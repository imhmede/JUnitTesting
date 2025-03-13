
/**
 * Kenneth Cox
 * CS123
 * ENMU
 * 
 * take in some numbers and test if in order
 * 1 2 3 - in order
 * 1 5 2 - not in order
 * 5 2 1 - in order
 */

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class StreamOrder {

    public static void main(String[] args) {
        StreamOrder order = new StreamOrder();

        if (args.length > 0 && args[0].equals("Unit")) {
            order.runUnitTest(); // run unit test
        }
        try {
            Optional<String> input = order.getInput(Optional.empty(), Optional.empty());
            List<Integer> numbers = order.parse(input);

            String result = order.results(numbers);

            System.out.println(result);

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }

    public Optional<String> getInput(Optional<PrintStream> out, Optional<InputStream> in) {
        InputStream inStream = in.isPresent() ? in.get() : DEFAULT_IN;
        PrintStream outStream = out.isPresent() ? out.get() : DEFAULT_OUT;
        BufferedReader br = new BufferedReader(new InputStreamReader(inStream));
        String score = null;

        try {
            outStream.print("Enter 3 numbers seperated by a space: ");
            score = br.readLine();
            boolean not_valid = score.chars().mapToObj(ch -> (char) ch).anyMatch(
                    ch -> {
                        return !(Character.isDigit(ch) || Character.isWhitespace(ch));
                    });

            if (not_valid) {
                throw new IOException("Exception");
            }

        } catch (Exception ioe) {
            outStream.println(ioe.getMessage());
            return Optional.empty();
        }

        return Optional.of(score);
    }

    /**
     * takes user provided input and parses out deliemeter and converts chars to
     * ints
     * 
     * @param input
     * @return
     * @throws IOException if Optional is an empty value
     */
    public List<Integer> parse(Optional<String> input) throws IOException {
        if (!input.isPresent()) {
            throw new IOException("no value was present to parse, ensure input was passed!");
        }

        String[] noDelimeters = input.get().split(" ");
        List<Integer> numbers = Arrays.stream(noDelimeters).map(ch -> Integer.parseInt(ch))
                .collect(Collectors.toList());

        return numbers;
    }

    /**
     * builds result string, tells user if list is in order
     * 
     * @param numbers
     * @return
     */
    public String results(List<Integer> numbers) {
        StringBuilder builder = new StringBuilder();
        builder.append(numbers.toString());
        builder.append(": ");
        builder.append(this.isOrdered(numbers) ? "is" : "is not");
        builder.append(" in order!");

        return builder.toString();

    }

    protected void runUnitTest() {
        UnitTest test = new UnitTest();
        test.run();
    }

    private boolean isOrdered(List<Integer> nums) {
        List<Integer> copy = new ArrayList<Integer>(nums);
        Collections.sort(copy);
        List<Integer> copyReverse = new ArrayList<Integer>(copy);
        Collections.reverse(copyReverse); // reverse order to check for backwards order
        return copy.equals(nums) || copyReverse.equals(nums);
    }

    class UnitTest {

        UnitTest() {
            order = new StreamOrder();
        }

        void run() {
            testBigIsNotOrdered();
            testParseOrder();
            testGetInputException();
            testGetInput();
            testIsOrdered();
            testIsOrderedFalse();
            testIsReverseOrdered();
            System.exit(SUCCESS);
        }

        void testParseOrder() {
            List<Integer> input = new ArrayList<>();
            input.add(1);
            input.add(2);
            input.add(3);

            progress(!order.isOrdered(input));
        }

        void testBigIsNotOrdered() {
            try {
                Optional<String> input = Optional.of("200 12 331");
                List<Integer> got = order.parse(input);
                List<Integer> want = new ArrayList<>();
                want.add(200);
                want.add(12);
                want.add(331);
                if (!got.containsAll(want)) {
                    System.exit(FAILURE);
                }
            } catch (IOException _e) {
                // no exception wshould be raise since value is present
            }
        }

        void testGetInputException() {
            final ByteArrayOutputStream exceptionMsg = new ByteArrayOutputStream();
            final String utf8 = StandardCharsets.UTF_8.name();

            try {
                PrintStream stream = new PrintStream(exceptionMsg, true, utf8);
                Optional<PrintStream> outStream = Optional.of(stream);
                Optional<InputStream> inStream = Optional.of(new ByteArrayInputStream("B".getBytes()));

                order.getInput(outStream, inStream);

                progress(!exceptionMsg.toString().contains("Exception"));

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        void testIsOrdered() {
            List<Integer> nums = List.of(1, 2, 3);
            boolean got = order.isOrdered(nums);
            progress(!got);

        }

        void testIsOrderedFalse() {
            List<Integer> nums = List.of(2, 1, 3);
            boolean got = order.isOrdered(nums);
            progress(got);
        }

        void testIsReverseOrdered() {
            List<Integer> nums = List.of(3, 2, 1);
            boolean got = order.isOrdered(nums);
            progress(!got);

        }

        void testGetInput() {
            final ByteArrayOutputStream exceptionMsg = new ByteArrayOutputStream();
            final String utf8 = StandardCharsets.UTF_8.name();

            try {
                Optional<PrintStream> outStream = Optional.of(new PrintStream(exceptionMsg, true, utf8));
                Optional<InputStream> inStream = Optional.of(new ByteArrayInputStream("1 2 3".getBytes()));

                order.getInput(outStream, inStream);

                progress(inStream.isEmpty());

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }

        private void progress(boolean got) {
            StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
            StackTraceElement e = stacktrace[METHOD_STACK_INDEX];
            String methodName = e.getMethodName();
            System.out.println("Running test: " + methodName);
            assertOrder(got, methodName);
            System.out.println("Test passed!");
            System.out.println("x--------------------------------x");
        }

        private void assertOrder(boolean got, String method) {
            if (got) {
                System.out.println("Want: " + got + " Got: " + !got);
                System.out.println("failed at: " + method);
                System.exit(FAILURE);
            }
        }

        StreamOrder order;
        final int SUCCESS = 0;
        final int FAILURE = 1;
        final int METHOD_STACK_INDEX = 2;
    }

    private final PrintStream DEFAULT_OUT = System.out;
    private final InputStream DEFAULT_IN = System.in;

}
