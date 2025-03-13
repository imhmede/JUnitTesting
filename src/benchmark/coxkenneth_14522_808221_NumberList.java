
/**
 * CS123
 * Kenneth Cox
 * ENMU
 * 
 */
import java.io.*;
import java.util.*;

/**
 * NumberList
 * Generates a space delimeted sequence of numbers from input without delimeters
 * of anything
 * Example on calling main:
 * - input : 12345
 * - output : 1 2 3 4 5
 */
public class NumberList {
    public static void main(String[] args) {
        String sequence;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter a sequence, (no delimeter): ");
            sequence = br.readLine();
            NumberList.process_sequence(sequence);
        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    /**
     * Static method, used to process sequence from io to proper
     * space delimeted format
     * 
     * @param sequence
     */
    public static void process_sequence(String sequence) {
        List<Character> delimeted_sequence = new ArrayList<>();
        // cast into char and puts each character from provided sequence into ArrayList
        sequence.chars().forEach(c -> delimeted_sequence.add(Character.valueOf((char) c)));
        // prints each characters with space
        delimeted_sequence.stream().forEach(c -> {
            System.out.print(c + " ");
        });
        System.out.println();
    }
}
