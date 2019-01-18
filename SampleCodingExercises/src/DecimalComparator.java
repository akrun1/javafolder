

public class DecimalComparator {

    public static void main(String[] args) {
        System.out.println("It returns " + areEqualByThreeDecimalPlaces(3.1766, 3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double input1, double input2) {


        return (int) (input1 * 1000) == (int) (input2 * 1000);


    }

}
