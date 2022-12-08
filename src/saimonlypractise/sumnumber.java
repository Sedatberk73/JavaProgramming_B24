package saimonlypractise;

import java.util.Scanner;

public class sumnumber {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);



        /*

        Write a program that calculates the sum of numbers entered by
        the user until user enters a negative number.
hint: you need an infinite loop




int total=0;

        System.out.println("enter serial number");
            int number =scan.nextInt();
            while (number>=0){
                int input=scan.nextInt();
                   number+= input;
                   if(input<=0){
                       number+=input;
                   break;}
            }
        System.out.println("total number is "+number);   */


        int sum=0;
        boolean positive =true;
        while (positive){
            System.out.println("enter a number");
            int number= scan.nextInt();

            sum+=number;

            if (number<0){
                positive=false;

            }
        }
        System.out.println(sum);



















    }




}
