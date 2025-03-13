
/**
 * Kenneth Cox
 * CS123
 * ENMU
 * 
 * Lab 5 B
 * Test properties of a string
 *    - middle characters
 *    - vowel count
 *    - string multiplication
 *    - counts words seperated by deliemeter
 */
import java.lang.reflect.Method;
import java.util.Arrays;

public class StringProperties {
    public static void main(String[] args) {
        StringProperties string = new StringProperties();
        string.runTest();
    }

    /**
     * finds the middle characters of a given string
     * if even, returns middle two characters
     * if odd, returns absolute middle
     * example:
     * middle -> dd
     * mid -> i
     * 
     * @param str
     * @return
     */
    public String middle(String str) {
        final int half = 2;
        final int size = str.length();
        String mid = null;
        final int midIdx = size / half;

        if (midIdx % 2 == 1) {
            mid = str.substring(midIdx - OFFSET, midIdx + OFFSET);
        } else {
            mid = str.substring(midIdx, midIdx + OFFSET);
        }
        return mid;

    }

    /**
     * builds and returns a strings repeated n times
     * essentially emmulates str * n
     * example:
     * "hello" * 5 = "hellohellohellohellohello"
     * 
     * @param str
     * @param n
     * @return
     */
    public String repeat(String str, int n) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < n; i++) {
            builder.append(str);

        }
        return builder.toString();
    }

    /**
     * counts the numbers of vowels in a given
     * string
     * example:
     * hello -> 2
     * 
     * @param str
     * @return
     */
    public long countVowels(String str) {
        return str.chars().mapToObj(ch -> (char) ch).filter(
                ch -> {
                    // keep if char is vowel
                    return !(VOWELS.indexOf(ch) == NOT_FOUND);
                }).count();
    }

    /**
     * counts the number of words seperated by delimeter
     * corner case of "" or " " will not work with split, provided
     * a test and returns 0 if empty
     * 
     * @param str
     * @return
     */
    public int countWords(String str) {
        final int empty = 0;
        if (str.length() == empty) {
            return empty;
        }
        return str.split(DELIMETER).length;
    }

    protected void runTest() {
        UnitTest test = new UnitTest();
        test.run();
    }

    class UnitTest {

        UnitTest() {

        }

        // runs test with threading
        void run() {
            String bar = "|=========================================================|";

            System.out.println(bar);
            Method[] testableUnits = UnitTest.class.getDeclaredMethods();

            for (var method : testableUnits) {
                try {
                    Thread t1 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            if (Arrays.asList(EXCLUDE).indexOf(method.getName()) == NOT_FOUND) {
                                method.setAccessible(true);
                                try {
                                    method.invoke(new UnitTest());
                                } catch (Exception msg) {
                                    System.out.println(msg.getMessage());
                                }
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

        void testrepeat() {
            StringProperties properties = new StringProperties();
            String got = properties.repeat("Hello", 4);
            String want = "HelloHelloHelloHello";
            progress(got, want);

            String got_second = properties.repeat("Hello", 0);
            String want_second = "";
            progress(got_second, want_second);

        }

        void testmiddle() {
            StringProperties properties = new StringProperties();
            String got = properties.middle("middle");
            String want = "dd";
            progress(got, want);

            String got_second = properties.middle("noway");
            String want_second = "w";
            progress(got_second, want_second);

            String got_third = properties.middle("n oway");
            String want_third = "ow";
            progress(got_third, want_third);

        }

        void testcountVowels() {
            StringProperties properties = new StringProperties();
            long got = properties.countVowels("axius");
            long want = 3;
            progress(got, want);

            long got_second = properties.countVowels("Shy Gypsy, slyly spryly tryst by my crypt");
            long want_second = 0;
            progress(got_second, want_second);
        }

        void testcountWords() {
            StringProperties properties = new StringProperties();
            int got = properties.countWords("Mary had a little lamb");
            int want = 5;
            progress(got, want);

            int got_second = properties.countWords("");
            int want_second = 0;
            progress(got_second, want_second);

            int got_third = properties.countWords(" ");
            int want_third = 0;
            progress(got_third, want_third);
        }

        private <T> void progress(T got, T want) {
            StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
            StackTraceElement e = stacktrace[METHOD_STACK_INDEX];
            String methodName = e.getMethodName();
            System.out.println("Running test: " + methodName);
            assertOrder(got, want, methodName);
            System.out.println("Test passed!");
            System.out.println("x--------------------------------x");
        }

        private <T> void assertOrder(T got, T want, String method) {
            if (!got.equals(want)) {
                System.out.println("Want: " + want + "\nGot: " + got);
                System.out.println("failed at: " + method);
                System.exit(FAILURE);
            }
        }

        private final String[] EXCLUDE = {
                "run",
                "progress",
                "assertOrder"
        };
        private final int SUCCESS = 0;
        private final int FAILURE = 1;
        private final int METHOD_STACK_INDEX = 2;
    }

    private final int OFFSET = 1;
    private final int NOT_FOUND = -1;
    private final String VOWELS = "AEIOUaeiou";
    private final String DELIMETER = " ";
}
