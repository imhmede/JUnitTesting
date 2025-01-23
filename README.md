# JUnit Testing for QuickSort and BinarySearch       
This is a sample Java program designed for a lab assignment involving the implementation of JUnit tests for the QuickSort and BinarySearch algorithms.

## Project Structure

The project is structured as follows:
- **`src/main/app/Runner.java`**: The main class for the program.
- **`src/main/sorting/QuickSort.java`**: Contains the implementation of the QuickSort algorithm.
- **`src/main/sorting/BinarySearch.java`**: Contains the implementation of the BinarySearch algorithm.
- **`src/test/sorting/TestSortingAlgorithms.java`**: JUnit test class that verifies the correctness of the QuickSort and BinarySearch programs.
- **`lib`**: Contains the JUnit JAR file (version 5).
- **`build.xml`**: Ant build script for compiling, running, and cleaning the project.
- **`README.md`**: This file, containing instructions and additional information.

## Requirements

- **Java JDK**: The program requires Java JDK to compile and run. Make sure you have it installed on your machine.
- **JUnit 4/5**: Download the JUnit 5 JAR file from the [JUnit website](https://junit.org/junit5/) and place it in the `lib` folder.
- **Apache Ant**: The program is automated using an Ant script, so you need to have Apache Ant installed.
    - To install Apache Ant, follow the instructions in the [official Apache Ant installation guide](https://ant.apache.org/manual/install.html).
    - For a tutorial on getting started with Apache Ant, check out the [Hello World with Apache Ant guide](https://ant.apache.org/manual/tutorial-HelloWorldWithAnt.html).


## Usage

To compile all the Java files, run the following command:

```bash
ant compile
'''

To run the Java program, use the following command:
```bash
ant run

To perform unit testing, run the following command:
```bash
ant test
'''

To clean up the project directory by deleting the classes directory, use the following command:
```bash
ant clean

