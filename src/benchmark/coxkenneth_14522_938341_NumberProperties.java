
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
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.stream.Stream;
import java.util.Arrays;
import java.util.Spliterator;

public class NumberProperties {
    public static void main(String[] args) {
        NumberProperties nums = new NumberProperties();

        nums.runUnitTest();

    }

    /**
     * test if all numbers are the same
     * 
     * @param x first double value
     * @param y second double value
     * @param z third double value
     * @return
     */
    public boolean allTheSame(double x, double y, double z) {
        final long IS_EQUAL_MASK = 0x00;
        long x_bits = Double.doubleToRawLongBits(x);
        long xNotYBits = (x_bits & ~Double.doubleToRawLongBits(y));
        long xNotZBits = (x_bits & ~Double.doubleToLongBits(z));
        return ((xNotYBits & xNotZBits) == IS_EQUAL_MASK);

    }

    /**
     * the approximate average of doubles provided
     * 
     * @param a
     * @return
     */
    public double average(double... a) {
        var average = Arrays.stream(a).average().getAsDouble();
        return BigDecimal.valueOf(average).setScale(1, RoundingMode.UP).doubleValue();
    }

    /**
     * finds the smallest number provided of given double values
     * 
     * 
     * @param a
     * @return
     */
    public double theSmallest(double... a) {
        return Arrays.stream(a).min().getAsDouble();
    }

    /**
     * check if list is in sorted order
     * 
     * @param a
     * @return
     */
    public boolean sorted(double... a) {
        var sorted = Stream.of(a).sorted();
        return sorted.spliterator().hasCharacteristics(Spliterator.SORTED);

    }

    protected void runUnitTest() {
        UnitTest test = new UnitTest();
        test.run();
    }

    class UnitTest {

        UnitTest() {

        }

        private void run() {
            String bar = "|=========================================================|";

            System.out.println(bar);

            for (String name : TEST) {
                try {
                    Thread t1 = new Thread(new Runnable() {
                        @Override
                        public void run() {
                            try {
                                Method method = UnitTest.class.getDeclaredMethod(name);
                                method.setAccessible(true);
                                method.invoke(new UnitTest());

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

        void testallTheSame() {
            NumberProperties properties = new NumberProperties();
            boolean got = properties.allTheSame(1.0, 1.0, 1.0);
            boolean want = true;
            progress(got, want);

            boolean got_second = properties.allTheSame(1.2, 2.0, 1.0);
            boolean want_second = false;
            progress(got_second, want_second);
        }

        void testsorted() {

            NumberProperties properties = new NumberProperties();
            boolean got = properties.sorted(1.2, 1.3, 2.9);
            boolean want = true;
            progress(got, want);

        }

        void testaverage() {
            NumberProperties properties = new NumberProperties();
            double got = properties.average(1.4, 2.3, 1.7);
            double want = 1.8;
            progress(got, want);
        }

        void testaverageDecimal() {
            NumberProperties properties = new NumberProperties();
            double got = properties.average(0.4, 0.5, 0.7);
            double want = 0.6;
            progress(got, want);
        }

        void testtheSmallest() {

            NumberProperties properties = new NumberProperties();
            double got = properties.theSmallest(1.0, 2.3, 0.7);
            double want = 0.7;
            progress(got, want);

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

        private final String[] TEST = {
                "testallTheSame",
                "testtheSmallest",
                "testaverage",
                "testsorted",
                "testaverageDecimal",
        };

        private final int SUCCESS = 0;
        private final int FAILURE = 1;
        private final int METHOD_STACK_INDEX = 2;
    }
}
