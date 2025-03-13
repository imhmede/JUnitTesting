
/**
 * Kenneth Cox
 * CS123
 * ENMU
 */
import java.util.*;
import java.util.stream.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class Grade {

    public Grade() {
        _gradeMap = new GradeMap();
    }

    public static void main(String[] args) {
        Grade grade = new Grade();

        // check if we need to run unit test
        if (args.length > 0 && args[0].equals("Unit")) {
            grade.runUnitTest();
        } else {
            Integer score = grade.getInput(Optional.empty(), Optional.empty());
            grade.printGrade(Optional.empty(), score);
        }

    }

    /**
     * 
     * @param out   DI to facilitate testing with a mock output stream allows wrting
     *              to a buffer
     * @param score input translated into integer
     */
    public void printGrade(Optional<PrintStream> out, Integer score) {
        // score is initialized to null before buffer is read, fail safe
        if (score != null) {

            PrintStream outStream = out.isPresent() ? out.get() : DEFAULT_OUT;

            if (score >= MIN_GRADE && score <= MAX_GRADE) {
                String letterGrade = this._gradeMap.getGrade(score);
                outStream.println("The letter grade for a " + score + " is: " + letterGrade);
            } else {
                outStream.println("That is not a valid grade!");
            }

        }
    }

    /**
     * @param in  DI to facilitate testing with a mock input stream allows reading
     *            from a buffer
     * @param out DI to facilitate testing with a mock output stream allows writing
     *            to a buffer
     * @return
     */
    public Integer getInput(Optional<PrintStream> out, Optional<InputStream> in) {
        InputStream inStream = in.isPresent() ? in.get() : DEFAULT_IN;
        PrintStream outStream = out.isPresent() ? out.get() : DEFAULT_OUT;
        BufferedReader br = new BufferedReader(new InputStreamReader(inStream));
        Integer score = null;

        try {
            outStream.print("Enter a grade: ");
            score = Integer.parseInt(br.readLine());
        } catch (Exception ioe) {
            outStream.println(ioe.getMessage() + " was given. Expected a number");
        }

        return score;
    }

    // runs unit tests from inner class
    protected void runUnitTest() {
        UnitTest test = new UnitTest();
        test.run();
    }

    class GradeMap {
        HashMap<List<Integer>, String> gradeMap = new HashMap<List<Integer>, String>();

        GradeMap() {
            initializeList();
        }

        // gets the letter grade assocaited with the scores passed
        private String getGrade(Integer score) {
            /**
             * filter the list of keys to find the one that contains the score
             * then get the value associated with that key
             */
            return gradeMap.entrySet().stream().filter(entry -> {
                return entry.getKey().contains(score);
            }).map(entry -> {
                return entry.getValue();
            }).collect(Collectors.joining());
        }

        private void initializeList() {
            gradeMap.put(addList(90, 100), "A");
            gradeMap.put(addList(80, 89), "B");
            gradeMap.put(addList(70, 79), "C");
            gradeMap.put(addList(60, 69), "D");
            gradeMap.put(addList(0, 59), "F");
        }

        // stream to create a list of integers from start to end
        private List<Integer> addList(int startInclusive, int endInclusive) {
            return IntStream.rangeClosed(startInclusive, endInclusive)
                    .boxed().collect(Collectors.toList());
        }
    }

    class UnitTest {
        Grade input = new Grade();
        GradeMap grades = new Grade.GradeMap();

        UnitTest() {
        }

        void run() {
            testA();
            testB();
            testC();
            testD();
            testF();
            testCornerF();
            testInvalidGrade();
            testForException();
            System.exit(PASS_STATUS);
        }

        // tracks progress of current unit test
        private void progress(String got, String want) {
            StackTraceElement[] stacktrace = Thread.currentThread().getStackTrace();
            StackTraceElement e = stacktrace[METHOD_STACK_INDEX];
            String methodName = e.getMethodName();
            System.out.println("Running test: " + methodName);
            assertion(want, got, methodName);
            System.out.println("Test passed!");
            System.out.println("x--------------------------------x");
        }

        private void testA() {
            String grade = grades.getGrade(100);
            String want = "A";
            progress(grade, want);
        }

        private void testB() {
            String grade = grades.getGrade(89);
            String want = "B";
            progress(want, grade);
        }

        private void testC() {
            String grade = grades.getGrade(79);
            String want = "C";
            progress(want, grade);
        }

        private void testD() {
            String grade = grades.getGrade(69);
            String want = "D";
            progress(want, grade);
        }

        private void testF() {
            String grade = grades.getGrade(59);
            String want = "F";
            progress(want, grade);
        }

        private void testCornerF() {
            String grade = grades.getGrade(0);
            String want = "F";
            progress(want, grade);
        }

        // test to see if proper out is given for an invalid string
        private void testInvalidGrade() {
            // Compatiable with PrintStream; writes to buffer
            final ByteArrayOutputStream exceptionMsg = new ByteArrayOutputStream();
            final String utf8 = StandardCharsets.UTF_8.name();
            final String want = "That is not a valid grade!\n";

            try {
                Integer grade = 101;
                Optional<PrintStream> outStream = Optional.of(new PrintStream(exceptionMsg, true, utf8));
                input.printGrade(outStream, grade);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            progress(want, exceptionMsg.toString());
        }

        private void testForException() {
            final ByteArrayOutputStream exceptionMsg = new ByteArrayOutputStream();
            final String utf8 = StandardCharsets.UTF_8.name();
            final String want = "Enter a grade: For input string: \"//\" was given. Expected a number\n";

            try {
                Optional<PrintStream> outStream = Optional.of(new PrintStream(exceptionMsg, true, utf8));
                Optional<InputStream> inStream = Optional.of(new ByteArrayInputStream("//".getBytes()));
                input.getInput(outStream, inStream);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

            progress(want, exceptionMsg.toString());
        }

        private void assertion(String want, String grade, String method) {
            if (!want.equals(grade)) {
                System.out.println("Want: " + want + " Got: " + grade);
                System.out.println("Test Failed: " + method);
                System.exit(FAIL_STATUS);
            }
        }

        final int PASS_STATUS = 0;
        final int FAIL_STATUS = 1;
        final int METHOD_STACK_INDEX = 2;
    }

    private GradeMap _gradeMap;
    private final int MAX_GRADE = 100;
    private final int MIN_GRADE = 0;
    private final PrintStream DEFAULT_OUT = System.out;
    private final InputStream DEFAULT_IN = System.in;
}
