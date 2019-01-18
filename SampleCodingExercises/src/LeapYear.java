public class LeapYear {

    public static void main(String[] args) {
        System.out.println("The value of Leap Year is " + isLeapYear(1924));
    }

    public static boolean isLeapYear(int Year) {

        boolean out = false;
        if ((Year < 1) ||(Year > 9999)) {
            out = false;
        } else if ((((Year % 4) == 0) && ((Year % 100) != 0)) || (Year % 400 == 0)) {
            out = true;
        }

        return out;

    }


}
