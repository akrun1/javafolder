package com.arun;

public class Main {

    public static void main(String[] args) {
        int result = 1 + 2;
        System.out.println("result = " + result);

        int previousResult = result;
        result = result -1;
        System.out.println("previousResult = " + previousResult);
        System.out.println(result);
        previousResult = result;
        result = result * 10;
        System.out.println(result);
        System.out.println(previousResult + " * 10 = " + result);
        previousResult = result;

        result = result/5;
        System.out.println(previousResult + " / 5 = " + result);

        previousResult = result;
        result = result % 3;

        System.out.println(previousResult + " % 3 = " + result);

        previousResult = result;
        result = result + 1;
        System.out.println(previousResult + " + 1  = " + result);

        result++;
        System.out.println("result is now " + result);

        result--;

        System.out.println("result is now " + result);

        result += 2;
        System.out.println("result is now " + result);

        result *= 10;
        System.out.println("result is now " + result);

        result -= 10;
        System.out.println("result is now " + result);

        result /= 10;
        System.out.println("result is now " + result);

        boolean isAlien = false;
        if (isAlien == false)
            System.out.println("It is not an alien!");

        if (isAlien == true)
            System.out.println("It is not an alien!");

        int topScore = 100;
        if (topScore == 100)
            System.out.println("You got the top score!");

        if (topScore >= 100)
            System.out.println("You got the top score!");

        if (topScore <= 100)
            System.out.println("You got the top score!");

        topScore = 80;
        if (topScore < 100)
            System.out.println("You got the top score!");


        int secondTopScore = 95;
        if ((topScore > secondTopScore) && (topScore < 100))
            System.out.println("Greater than second top score and less than 100");


        if ((topScore > 90) || (secondTopScore <=90))
            System.out.println("One of these tests is true");

        int newValue = 50;
        if (newValue == 50)
            System.out.println("This is an error");

        boolean isCar = true;
        /*
        if (isCar)
            System.out.println("This is not supposed to happen"); */

        boolean wasCar = isCar ? true : false;
        if (wasCar)
            System.out.println("wasCar is true");


        double myVar = 20d;
        double secondVar = 80d;
        double result2 = (myVar + secondVar) * 25;
        double result3 = (result2 % 40);
        System.out.println("result3 = " + result3);
        if (result3 <= 20)
            System.out.println("(" + myVar + " + "  + secondVar + ") * 25" +   " = "  + result2);
            System.out.println("Total was over the limit");
    }
}
