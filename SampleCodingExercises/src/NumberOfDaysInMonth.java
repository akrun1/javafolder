public class NumberOfDaysInMonth {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));



        System.out.println(getDaysInMonth(1, 2020));
        System.out.println(getDaysInMonth(2, 2020));
        System.out.println(getDaysInMonth(2, 2018));
        System.out.println(getDaysInMonth(-1, 2020));
        System.out.println(getDaysInMonth(1, -2020));




    }

    public static boolean isLeapYear(int year) {
        if ((year < 1) || (year > 9999)) {
            return false;

        } else {
            return (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);

        }
    }

    public static int getDaysInMonth(int month, int year) {

        int days = -1;
        if ((month < 1) || (month > 12) || (year < 1) || (year > 9999)) {
            return days;
        }
        switch(month) {
            case 1:
                days = 31;
                break;
            case 2:
                if(isLeapYear(year)) {
                    days =  29;
                } else {
                    days = 28;
                }
                break;
            case 3:
               days = 31;
                break;
            case 4:
                days = 30;
                break;
            case 5:
                days = 31;
                break;
            case 6:
                days = 30;
                break;
            case 7:
                days = 31;
                break;
            case 8:
                days = 31;
                break;
            case 9:
                days = 30;
                break;
            case 10:
                days = 31;
                break;
            case 11:
                days = 30;
                break;
            case 12:
                days = 31;
                break;

            default:
                days = -1;
                break;


        }

        return days;

    }

}
