public class SumOddRange {

    public static void main(String[] args) {
        System.out.println("The sum of numbers in the range of 1 and 100 is " + sumOdd(1, 100));
        System.out.println("The sum of numbers in the range of -1 and 100 is " + sumOdd(-1, 100));
        System.out.println("The sum of numbers in the range of 100 and 100 is " + sumOdd(100, 100));
        System.out.println("The sum of numbers in the range of 100 and -100 is " + sumOdd(100, -100));
        System.out.println("The sum of numbers in the range of 100 and 1000 is " + sumOdd(100, 1000));

    }


    public static boolean isOdd(int number) {
        boolean bl = false;
        if (number <= 0) {
            bl = false;
        } else {
            bl = number % 2 == 1;
        }
        return bl;
    }

    public static int sumOdd(int start, int end) {
        if ((end < start) || (start <=0) || (end <= 0)) {
            return -1;
        }
        int Sum = 0;
        for(int i= start; i <= end; i++) {
            if(isOdd(i)) {
                Sum += i;

            }
        }

        return Sum;
    }


}
