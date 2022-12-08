package day10_Scanner;

import java.util.Scanner;

public class placeorder {
    public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);
        System.out.println("enter the product name");
        String product= scan.nextLine();
        System.out.println("enter the prise");
        double prise= scan.nextDouble();
        System.out.println("enter the quantity");
        int quantity= scan.nextInt();
        scan.nextLine();
        System.out.println("please enter the their full name");
        String fullname= scan.nextLine();
        System.out.println(fullname+" your order quantity "+quantity+"  "+product+
                " has been placed your total is $"+(quantity*prise));*///////////////

        Scanner scan=new Scanner(System.in);
        System.out.println("enter the product name");
        String product= scan.nextLine();
        System.out.println("enter the price");
        double price= scan.nextDouble();
        System.out.println();
        System.out.println("enter the quantity:");
        int quantity= scan.nextInt();
        scan.nextLine();
        System.out.println("plea enter the full name:");
        String name=scan.nextLine();
        System.out.println(name+" your order quantity "+quantity+" "+product+
                " has been placed your total price is $"+(quantity*price));





    }
}
