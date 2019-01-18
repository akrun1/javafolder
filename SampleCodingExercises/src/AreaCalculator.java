

public class AreaCalculator {



    private static final double INVALID_MESSAGE = -1.0d;


    public static void main(String[] args) {
        System.out.println("Area of the rectangle is " + area(14, 20));
        System.out.println("Area of cirle is " + area(32));;
    }



    public static double area(double radius) {

        if (radius < 0) {
            return INVALID_MESSAGE;
        }

        return Math.PI * Math.pow(radius, 2);



    }

    public static double area(double x, double y) {
        if ((x < 0 ) || (y < 0)) {
            return INVALID_MESSAGE;
        }
        return x * y;

    }

}
