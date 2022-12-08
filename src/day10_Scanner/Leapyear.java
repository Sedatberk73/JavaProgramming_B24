package day10_Scanner;

import java.util.Scanner;
public class Leapyear {
    /*
    create a class LeapYearcreate a main methodcreate a Scanner objectAsk the user to enter a year.
    Determine if the year is a leap year or not.
    You can assume a leap year is a year that is divisible by 4. Print true or false.Hint: use remainder operator
     */
    public static void main(String[] args) {
        Scanner methodcreate=new Scanner(System.in);
        System.out.println("enter a year: ");
        double year= methodcreate.nextDouble();
        boolean isleapyear=true;

       if( isleapyear=(year%4==0)){
        System.out.println("isleapyear = " + isleapyear+" it is a leap year");}


        System.out.println("isleapyear = " + isleapyear+" it isn't a leap year");



    }
}
