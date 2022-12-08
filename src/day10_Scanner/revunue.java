package day10_Scanner;

import java.util.Scanner;

public class revunue {
    /*

     */

    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);
        System.out.println("enter the product prise");
        double prise= input.nextDouble();

        System.out.println("enter the product quantity");
        double quantity= input.nextDouble();

        double revunue=prise*quantity;
        System.out.println("revunue = " + revunue);






    }
}
