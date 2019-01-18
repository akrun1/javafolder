public class BarkingDog {

    public static void main(String[] args) {
        System.out.println("The dog barking is " + bark(true, 8));
    }

    public static boolean bark(boolean barking, int hourOfDay) {

        boolean out = false;
        if ((hourOfDay < 0 ) || (hourOfDay > 23)) {
            out = false;
        } else if (((hourOfDay > 22) && barking) || ((hourOfDay < 8) && barking)) {
            out = true;
        }



        return out;

        

    }


}
