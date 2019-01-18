public class MinutesToYearsDaysCalculator {
    private static final String INVALID_MESSAGE = "Invalid Value";

    public static void main(String[] args) {
        printYearsAndDays(-561600);

    }


    public static void printYearsAndDays(long minutes) {
        if (minutes < 0L) {
            System.out.println(INVALID_MESSAGE);
        } else {

            String mins = minutes + " min";
            double year = (double) minutes / (60 * 24 * 365);
            int yr = (int) year;

            String years = yr + " y";
            int days = (int) Math.round((year - yr) * 365);
            System.out.println(mins + " = " + years + " and " + days + " d");
        }
    }

}
