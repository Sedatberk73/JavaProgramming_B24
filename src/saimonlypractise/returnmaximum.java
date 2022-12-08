package saimonlypractise;

import java.util.Scanner;

public class returnmaximum {
    public static void main(String[] args) {

        /*write a program that asks user to enter 5 numbers and returns the maximum number

write a program that asks user to enter 5 numbers and returns the minimum number

write a program that asks user to enter 5 numbers and returns the minimum and maximum numbers


        System.out.println("enter five number");
        int num1= scan.nextInt();
        int num2 =scan.nextInt();
        int num3=scan.nextInt();
        int num4= scan.nextInt();
        int num5= scan.nextInt();;
        int numbiggest=0;
        if(num1>numbiggest){
            numbiggest=num1;
        } if (num2>numbiggest){
            numbiggest=num2;
        }
         if (num3>numbiggest){
            numbiggest=num3;
        } if (num4>numbiggest){
            numbiggest=num4;
        } if (num5>numbiggest){
            numbiggest=num5;
        }
        System.out.println("the big number is "+numbiggest);*/
        Scanner scan=new Scanner(System.in);
        System.out.println("enter series number");
        int largest=scan.nextInt();
        int number=1;
        while (number<=5){
            int input=scan.nextInt();
            if(input>largest){
            largest=input;
            }

            number++;
        }
        System.out.println("largest = " + largest);




















    }

}
