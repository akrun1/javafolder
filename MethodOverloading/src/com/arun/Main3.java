package com.arun;

public class Main3 {

    public static void main(String[] args) {
        String out = getDurationString(130, 25);
        System.out.println(out);
        System.out.println(getDurationString(360));


    }

public static String getDurationString(int minutes, int seconds) {
    if ((minutes < 0) || (seconds < 0) || (seconds > 59)) {
        return "Invalid value";

    }

    int fullSeconds = (minutes * 60) + seconds;
    System.out.println("fullSeconds is " + fullSeconds);
    int hours =  fullSeconds / (60 * 60);
    double remainder = fullSeconds - (hours * 3600);
    System.out.println("remaining secs = " + remainder);
    double mins =  remainder / 60;
    double remainder2 = remainder - (mins * 60);

    System.out.println("remainder2 = " + remainder2);

    return hours + "h " + mins + "m";


}

public static String getDurationString(int seconds) {
    if (seconds < 0) {
        return "Invalid value";
    }

    int mins =  (seconds/60);
    int secs = seconds - mins * 60;
    return getDurationString(mins, secs);

}



}
