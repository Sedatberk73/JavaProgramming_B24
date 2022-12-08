package day09_Scanner_logical;

import java.util.Scanner;

public class Angles {
    public static void main(String[] args) {
        /*
        180 triangle
        360 cicle
         */
        Scanner scan=new Scanner(System.in);

        System.out.println("please enter three number? ");
        int number1= scan.nextInt();
        int number2= scan.nextInt();
        int number3= scan.nextInt();
         int total=number1+number2+number3;
        boolean istriangle=total==180;
        if (istriangle==true){
            System.out.println("istriangle = " + istriangle);

        }else{
            boolean iscicle=total==360;
            System.out.println("iscicle = " + iscicle);
        }








    }
}
