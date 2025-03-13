
/**
 * Kenneth Cox
 * CS123
 * ENMU
 * 
 * This program will display three charactersitics of a list of numbers
 * - count the Odd and Even numbers present
 * - find the smallest and largerst numbers
 * - find all repeating numbers 
 * and also take a cumulative total for each value proceeding
 * 
 * example: 
 *     input: [1, 2, 3, 4, 4, 5]
 *  odd - 3
 *  even - 3
 *  min - 1
 *  max - 5
 *  recurring - [5]
 *  totals - [1,3,6,10,14,19]
 **/
import java.io.*;
import java.lang.reflect.Method;
import java.util.*;
import java.util.stream.*;
import java.util.function.Predicate;
import java.nio.charset.StandardCharsets;

public class Numbers {
    public static void main(String[] args) {
        Numbers order = new Numbers();
        // Runs unit test if "Unit" passed as cl arg
        if (args.length > 0 && args[0].equals("Unit")) {
            order.runUnitTest(); // exits w/ code on success or failure of test
        }

        Optional<String> input = order.getInput(Optional.empty(), Optional.empty());
        List<Integer> parsedInput = null;
        try {
            parsedInput = order.parse(input);
            order.getCharactersistics(parsedInput, Optional.empty());
            order.getCumulativeTotals(parsedInput, Optional.empty());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * 
     * Prompts user for input and returns input to be parsed
     * 
     * @param out PrintStream //DI for unit test
     * @param in  InputStream //DI for unit test
     * @return
     */
    public Optional<String> getInput(Optional<PrintStream> out, Optional<InputStream> in) {
        InputStream inStream = in.isPresent() ? in.get() : DEFAULT_IN;
        PrintStream outStream = out.isPresent() ? out.get() : DEFAULT_OUT;
        BufferedReader br = new BufferedReader(new InputStreamReader(inStream));
        String input = null;

        try {
            outStream.print("Enter numberic values seperated by a space: ");
            input = br.readLine();
            boolean not_valid = input.chars().mapToObj(ch -> (char) ch).anyMatch(
                    ch -> {
                        return !(Character.isDigit(ch) ||
                                Character.isWhitespace(ch) ||
                                ch == MINUS);
                    });

            if (not_valid) {
                throw new IOException("You passed a value that is not a number");
            }

        } catch (Exception ioe) {
            outStream.println(ioe.getMessage());
            return Optional.empty();
        }

        return Optional.of(input);
    }

    /**
     * takes input that has been given and parses the digits
     * into individual integers in a list
     * example :
     * input - "12345"
     * output - [1,2,3,4,5]
     * 
     * @param input
     * @return
     * @throws IOException
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
     * outputs the charactersistics relating to the number list
     * 
     * count the Odd and Even numbers present
     * the smallest and largerst numbers
     * all repeating numbers
     * 
     * @param input list of numbers from input
     * @param out   //DI for unit test
     * @throws IOException
     */
    public void getCharactersistics(List<Integer> input, Optional<PrintStream> out)
            throws IOException {

        PrintStream printOut = out.isPresent() ? out.get() : DEFAULT_OUT;

        Characteristic<Integer> characteristic = new Characteristic<Integer>(input);

        Tuple<Long> oddEven = characteristic.getOddEventCount(n -> Math.abs(n % 2) == 1, n -> (n % 2) == 0);
        printOut.println("odd count is: " + oddEven.first + "\neven count is: " + oddEven.second);

        Tuple<Integer> minMax = characteristic.getSmallestLargest(Integer::compare, Integer::compare);
        printOut.println("the min and max are: " + minMax);

        List<Integer> duplicates = characteristic.getrepeatingDuplicates();
        printOut.println("Recurring Duplicates:" + duplicates);

    }

    /**
     * 
     * @param input list of numbers from input
     * @param out   //DI for unit test
     */
    public void getCumulativeTotals(List<Integer> input, Optional<PrintStream> out) {
        List<Integer> list = new ArrayList<>();
        PrintStream printOut = out.isPresent() ? out.get() : DEFAULT_OUT;

        IntStream.range(1, input.size() + 1).forEach(i -> {
            list.add(input.subList(0, i).stream().reduce(Integer::sum).get());
        });
        printOut.print("Cumulative totals: ");
        printOut.println(list);
    }

    protected void runUnitTest() {
        UnitTest test = new UnitTest();
        test.run();
    }

    class Characteristic<T> {

        Characteristic(List<T> inputList) {
            this.list = inputList;
        }

        /**
         * 
         * @param min implementation of Comparator / anon function for min function
         * @param max implementation of Comparator / anon function for max function
         * @return
         * @throws IOException
         */
        Tuple<T> getSmallestLargest(Comparator<T> min, Comparator<T> max) throws IOException {
            Optional<T> maxValue = list.stream().max(max);
            Optional<T> minValue = list.stream().min(min);

            if (maxValue.isEmpty() || maxValue.isEmpty()) {
                throw new IOException("Problem finding max/min");
            }

            return new Tuple<T>(minValue.get(), maxValue.get());

        }

        /**
         * 
         * @param fnForOdd  Predicate/ anon function for finding odd T
         * @param fnForEven Predicate / anon funct for finding even T
         * @return
         */
        Tuple<Long> getOddEventCount(Predicate<T> fnForOdd, Predicate<T> fnForEven) {
            long odd = list.stream().filter(fnForOdd).count();
            long even = list.stream().filter(fnForEven).count();

            return new Tuple<Long>(odd, even);
        }

        /**
         * find values that repeat
         * 
         * @return
         */
        List<T> getrepeatingDuplicates() {
            List<T> recurring = new ArrayList<>();

            T prev = null;
            Integer count = 0;
            for (T data : this.list) {
                if (prev != null && prev == data) {
                    count++;
                } else {
                    if (count > 0) {
                        recurring.add(prev);
                    }
                    prev = data;
                    count = 0;
                }
            }
            if (count > 0) {
                recurring.add(prev);
            }

            return recurring;
        }

        private List<T> list;
    }

    class Tuple<T> {
        Tuple(T first, T second) {
            this.first = first;
            this.second = second;
        };

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();

            builder.append("(");
            builder.append(first.toString());
            builder.append(",");
            builder.append(second.toString());
            builder.append(")");

            return builder.toString();
        }

        @Override
        public boolean equals(Object obj) {
            Tuple<T> tup = (Tuple<T>) obj;

            return tup.first == first && tup.second == second;
        }

        T first;
        T second;
    }

    class UnitTest {

        UnitTest() {

        }

        void run() {
            String bar = "|=========================================================|";

            System.out.println(bar);

            for (String data : TEST) {
                try {
                    Thread t1 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Method method = UnitTest.class.getDeclaredMethod(data);
                                method.setAccessible(true);
                                method.invoke(new UnitTest());
                            } catch (NoSuchMethodException ex) {
                                System.out.println("No such method: " + ex.getMessage());
                            } catch (Exception msg) {
                                System.out.println(msg.getMessage());
                            }
                        }
                    });
                    t1.start();
                    t1.join();
                } catch (Exception msg) {
                    System.out.println(msg.getMessage());
                }
            }
            System.out.println(bar);
            System.exit(SUCCESS);

        }

        public void testCharacteristicgetOddEventCountPositiveOdd() {

            List<Integer> input = new ArrayList<>();
            input.add(-2);
            input.add(-4);
            input.add(-6);
            input.add(-8);
            Characteristic<Integer> testCharacteristics = new Characteristic<>(input);

            Tuple<Long> oddEven = testCharacteristics.getOddEventCount(o -> Math.abs(o % 2) == 1, e -> (e % 2) == 0);
            progress(oddEven, new Tuple<Long>(Long.valueOf(0), Long.valueOf(4)));
        }

        void testCharacteristicgetOddEventCountNegativeOdd() {

            List<Integer> input = new ArrayList<>();
            input.add(-1);
            input.add(-3);
            input.add(-5);
            input.add(-7);
            Characteristic<Integer> testCharacteristics = new Characteristic<>(input);

            Tuple<Long> oddEven = testCharacteristics.getOddEventCount(o -> Math.abs(o % 2) == 1, e -> (e % 2) == 0);
            progress(oddEven, new Tuple<Long>(Long.valueOf(4), Long.valueOf(0)));
        }

        void testCharacteristicgetOddEventCount() {

            List<Integer> input = new ArrayList<>();
            input.add(1);
            input.add(2);
            input.add(3);
            input.add(4);
            Characteristic<Integer> testCharacteristics = new Characteristic<>(input);

            Tuple<Long> oddEven = testCharacteristics.getOddEventCount(o -> (o % 2) == 1, e -> (e % 2) == 0);
            progress(oddEven, new Tuple<Long>(Long.valueOf(2), Long.valueOf(2)));
        }

        void testCharacteristicgetSmallestLargest() {

            List<Integer> input = new ArrayList<>();
            input.add(1);
            input.add(2);
            input.add(3);
            input.add(4);

            Characteristic<Integer> testCharacteristics = new Characteristic<>(input);
            Tuple<Integer> minMax = null;
            try {
                Comparator<Integer> typeComp = Integer::compare;
                minMax = testCharacteristics.getSmallestLargest(typeComp, typeComp);
            } catch (Exception e) {
                // no exception should be thrown
            }

            progress(minMax, new Tuple<Integer>(1, 4));

        }

        void testGetCharacteristicOutput() {

            List<Integer> input = new ArrayList<>();
            input.add(1);
            input.add(2);
            input.add(3);
            input.add(4);

            final String utf8 = StandardCharsets.UTF_8.name();
            final ByteArrayOutputStream got = new ByteArrayOutputStream();

            try {
                Optional<PrintStream> stream = Optional.of(new PrintStream(got, true, utf8));
                getCharactersistics(input, stream);
            } catch (Exception e) {
                // no exception should be thrown
            }

            StringBuilder builder = new StringBuilder();
            builder.append("odd count is: 2\n");
            builder.append("even count is: 2\n");

            builder.append("the min and max are: " + new Tuple<Integer>(1, 4).toString());
            builder.append("\n");

            builder.append("Recurring Duplicates:" + new ArrayList<>().toString() + "\n");
            String want = builder.toString();

            progress(got.toString(), want.toString());

        }

        void testCharacteristicrepeatingDuplicates() {

            List<Integer> input = new ArrayList<>();
            input.add(1);
            input.add(1);
            input.add(2);
            input.add(1);
            input.add(3);
            input.add(3);
            input.add(6);
            input.add(6);
            input.add(4);
            input.add(4);

            Characteristic<Integer> testCharacteristics = new Characteristic<>(input);

            List<Integer> got = testCharacteristics.getrepeatingDuplicates();

            List<Integer> want = new ArrayList<Integer>();

            want.add(1);
            want.add(3);
            want.add(6);
            want.add(4);

            progress(got, want);
        }

        void testCumulutiveTotal() {

            Numbers nums = new Numbers();
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(7);
            list.add(2);
            list.add(9);

            final String utf8 = StandardCharsets.UTF_8.name();
            final ByteArrayOutputStream got = new ByteArrayOutputStream();
            try {

                Optional<PrintStream> outStream = Optional.of(new PrintStream(got, true, utf8));
                nums.getCumulativeTotals(list, outStream);

            } catch (Exception e) {

            }

            String want = new String("Cumulative totals: [1, 8, 10, 19]\n");
            progress(got.toString(), want);
        }

        <T> void progress(T got, T want) {
            StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
            StackTraceElement e = stacktrace[METHOD_STACK_INDEX];
            String methodName = e.getMethodName();
            System.out.println("Running test: " + methodName);
            assertOrder(got, want, methodName);
            System.out.println("Test passed!");
            System.out.println("x--------------------------------x");
        }

        <T> void assertOrder(T got, T want, String method) {
            if (!got.equals(want)) {
                System.out.println("Want\n" + want + "\nGot\n" + got);
                System.out.println("failed at: " + method);
                System.exit(FAILURE);
            }
        }

        private final String[] TEST = {
                "testCharacteristicgetOddEventCount",
                "testCharacteristicgetSmallestLargest",
                "testCharacteristicrepeatingDuplicates",
                "testCharacteristicgetOddEventCountNegativeOdd",
                "testCharacteristicgetOddEventCountPositiveOdd",
                "testGetCharacteristicOutput",
                "testCumulutiveTotal",
        };
        private final int SUCCESS = 0;
        private final int FAILURE = 1;
        private final int METHOD_STACK_INDEX = 2;

    }

    private final PrintStream DEFAULT_OUT = System.out;
    private final InputStream DEFAULT_IN = System.in;
    private final Character MINUS = '-';
}
