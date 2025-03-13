
/**
 * Kenneth Cox
 * CS123
 * ENMU
 */
import java.io.*;
import java.time.*;

public class MilitaryTimeDifference {

    public static void main(String[] args) {
        UnitTest test = new UnitTest();
        test.run();

        MilitaryTimeDifference mil_time = new MilitaryTimeDifference();
        mil_time.getInput();
        String timeDifference = mil_time.getTimeDifference();
        System.out.println(timeDifference);
    }

    MilitaryTimeDifference() {
    }

    // Unit test / non-UI Constructor
    MilitaryTimeDifference(int time1, int time2) {
        this.time1 = time1;
        this.time2 = time2;
        this.timeDifference = null;
    }

    /**
     * builds the time difference string
     * using the Duration time difference computed
     * 
     * @return the timeDifference
     */
    public String getTimeDifference() {
        StringBuilder builder = new StringBuilder();
        calculateTimeDifference();

        builder.append(Integer.valueOf(this.timeDifference.toHoursPart()));
        builder.append(" hours and ");

        builder.append(Integer.valueOf(this.timeDifference.toMinutesPart()));
        builder.append(" minutes");

        return builder.toString();
    }

    /**
     * Calculates the time difference between the two times
     * 
     * @return the time difference
     */
    private void calculateTimeDifference() {
        int time1Hour = hour(this.time1);
        int time1Mins = minutes(this.time1);
        LocalTime start = LocalTime.of(time1Hour, time1Mins);

        int time2Hour = hour(this.time2);
        int time2Mins = minutes(this.time2);
        LocalTime stop = LocalTime.of(time2Hour, time2Mins);

        this.timeDifference = Duration.between(start, stop);

        if (this.timeDifference.isNegative()) {
            this.timeDifference = this.timeDifference.plusDays(FULL_24_HOURS);
        }
    }

    /**
     * 
     * @param time
     * @return the hour of the time
     */
    private int hour(int time) {
        return (time / MASK);
    }

    /**
     * 
     * @param time
     * @return the minutes
     */
    private int minutes(int time) {
        return time % MASK;
    }

    /**
     * Prompts the user for the two times
     * stores the times in time1 and time2
     */
    public void getInput() {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            System.out.print("Enter beginning time (in military format): ");
            this.time1 = Integer.parseInt(br.readLine());
            System.out.print("Enter end time (in military format): ");
            this.time2 = Integer.parseInt(br.readLine());

        } catch (IOException ioe) {
            System.out.println(ioe);
        }
    }

    /**
     * Unit test suite for
     * MilitaryTimeDifference
     */
    static class UnitTest {
        UnitTest() {
        }

        void run() {
            this.time1_less_than_time2();
            this.time1_greater_time2();
            this.time1_equals_time2();
            this.full_time_difference();
            this.uneven_time_difference_corner();
            this.uneven_time_difference();
        }

        private void full_time_difference() {
            int time1 = 0000;
            int time2 = 2359;
            String want = new String("23 hours and 59 minutes");
            MilitaryTimeDifference mil = new MilitaryTimeDifference(time1, time2);
            this.assertion(mil, want);
        }

        private void time1_greater_time2() {
            int time1 = 1730;
            int time2 = 900;
            String want = new String("15 hours and 30 minutes");
            MilitaryTimeDifference mil = new MilitaryTimeDifference(time1, time2);
            this.assertion(mil, want);
        }

        private void time1_less_than_time2() {
            int time1 = 900;
            int time2 = 1730;
            String want = new String("8 hours and 30 minutes");
            MilitaryTimeDifference mil = new MilitaryTimeDifference(time1, time2);
            this.assertion(mil, want);
        }

        private void time1_equals_time2() {
            int time1 = 900;
            int time2 = 900;
            String want = new String("0 hours and 0 minutes");
            MilitaryTimeDifference mil = new MilitaryTimeDifference(time1, time2);
            this.assertion(mil, want);

        }

        private void uneven_time_difference() {
            int time1 = 902;
            int time2 = 1000;
            String want = new String("0 hours and 58 minutes");
            MilitaryTimeDifference mil = new MilitaryTimeDifference(time1, time2);
            this.assertion(mil, want);
        }

        private void uneven_time_difference_corner() {
            int time1 = 802;
            int time2 = 1000;
            String want = new String("1 hours and 58 minutes");
            MilitaryTimeDifference mil = new MilitaryTimeDifference(time1, time2);
            this.assertion(mil, want);
        }

        private void assertion(MilitaryTimeDifference mil, String want) {
            String got = mil.getTimeDifference();
            if (!want.equals(got)) {
                System.out.println("Assertion failed");
                System.out.println("want: " + want);
                System.out.println("got: " + got);
                assert false;
            }
        }
    }

    private final int MASK = 100;
    private final int FULL_24_HOURS = 1;
    private int time1, time2;
    Duration timeDifference;
}
