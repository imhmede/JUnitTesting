from datetime import datetime
import xml.etree.ElementTree as ET
import json
import os

def parse_checkstyle(xml_file_path):
    try:
        tree = ET.parse(xml_file_path)  # Parse the XML file
        root = tree.getroot()  # Get the root element
        errors = []

        # Extract file name from the 'file' element in the XML
        for file_element in root.findall('file'):
            file_name = file_element.attrib['name']  # Get the 'name' attribute of the <file> element

            for error in file_element.findall('error'):
                errors.append({
                    'file': file_name,  # Add the file name to the error
                    'line': error.attrib['line'],
                    'severity': error.attrib['severity'],
                    'message': error.attrib['message'],
                    'source': error.attrib['source']
                })
                
        return errors
    except Exception as e:
        print(f"Failed to parse XML: {e}")
        return []


def parse_pmd(xml_file_path):
    try:
        # Parse the XML file
        tree = ET.parse(xml_file_path)
        root = tree.getroot()
        
        # Define the namespace for PMD
        namespace = {'pmd': 'http://pmd.sourceforge.net/report/2.0.0'}
        
        # Extract information about violations
        violations = []
        for file_element in root.findall('pmd:file', namespace):
            file_name = file_element.get('name')
            for violation in file_element.findall('pmd:violation', namespace):
                violations.append({
                    'file': file_name,
                    'beginline': violation.get('beginline'),
                    'endline': violation.get('endline'),
                    'begincolumn': violation.get('begincolumn'),
                    'endcolumn': violation.get('endcolumn'),
                    'rule': violation.get('rule'),
                    'ruleset': violation.get('ruleset'),
                    'class': violation.get('class'),
                    'method': violation.get('method'),
                    'variable': violation.get('variable'),
                    'priority': violation.get('priority'),
                    'message': violation.text.strip() if violation.text else '',
                    'externalInfoUrl': violation.get('externalInfoUrl')
                })
        return violations
    except Exception as e:
        print(f"Failed to parse PMD XML: {e}")
        return []


def create_json_output(student_name, check_date, checkstyle_errors, pmd_violations):
    # Combine Checkstyle and PMD violations into a single structure
    output = {
        "studentName": student_name,
        "checkDate": check_date,
        "violations": {
            "checkstyle": checkstyle_errors,
            "pmd": pmd_violations
        }
    }
    return output


# Define the paths to the XML files
checkstyle_file_path = 'build/test-reports/checkstyle-result.xml'
pmd_file_path = 'build/test-reports/pmd.xml'
test_file_path = "build/test-reports/TEST-TestCases.txt"

# Parse the Checkstyle XML file
checkstyle_errors = parse_checkstyle(checkstyle_file_path)

# Print the parsed Checkstyle errors to the console
if checkstyle_errors:
    print("Checkstyle Errors:")
    for error in checkstyle_errors:
        print(f"File: {error['file']}, Line: {error['line']}, Severity: {error['severity']}, Message: {error['message']}, Source: {error['source']}")
else:
    print("No Checkstyle errors found or failed to parse the file.")

# Parse the PMD XML file
pmd_violations = parse_pmd(pmd_file_path)

# Print the parsed PMD violations to the console
if pmd_violations:
    print("\\nPMD Violations:")
    for violation in pmd_violations:
        print(f"File: {violation['file']}, Line: {violation['beginline']}, Rule: {violation['rule']}, Message: {violation['message']}, URL: {violation['externalInfoUrl']}")
else:
    print("\\nNo PMD violations found or failed to parse the file.")

# Define metadata
student_name = "John Cook"

# Get the current date and time
current_datetime = datetime.now()
check_date = current_datetime.strftime("%Y-%m-%d_%H-%M-%S")  # Format to avoid invalid characters in file names

# Generate the JSON output
output_json = create_json_output(student_name, check_date, checkstyle_errors, pmd_violations)

# Create the output directory if it doesn't exist
output_dir = "build/test-reports/"
os.makedirs(output_dir, exist_ok=True)

# Create a dynamic output file name
output_file_path = os.path.join(output_dir, f"violations.json")

# Save the JSON output to the file
with open(output_file_path, 'w') as json_file:
    json.dump(output_json, json_file, indent=4)

print(f"JSON output saved to {output_file_path}")