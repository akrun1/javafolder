public class PlayingCat {

    public static void main(String[] args) {
        System.out.println(isCatPlaying(false, 35));

    }

    public static boolean isCatPlaying (boolean summer, int temperature) {

        boolean out = false;
        if(summer) {
            out = (temperature >= 25) && (temperature <= 45);
        } else {
            out = (temperature >=25) && (temperature <= 35);
        }

        return out;
    }
}


