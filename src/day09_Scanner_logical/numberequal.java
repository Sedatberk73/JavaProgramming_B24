package day09_Scanner_logical;

import java.util.Scanner;

public class numberequal {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter number one:");
        double numberone=scan.nextDouble();
        System.out.println("enter number two");
        double number2=scan.nextDouble();


        System.out.println(numberone+" is equal to "+number2+" : "+(numberone==number2));








    }
}
