package day_15switch;

import java.util.Scanner;

public class sturback {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);


        System.out.println("welcome to sturbucks ");
        System.out.println("which size whould you like");
        String size= scan.next();
        double price=0;
        int calories=0;
        boolean validorder=true;

        switch (size){
            case "Tall":
                price=3.50;
                calories=100;
                System.out.println("your order is "+size+" your order calories= "+calories+" and prise is be $"+price);
              //  break;//if dont use when size equals tall its gana work for other too exept other braker
            case "Grande":
                price=4.50;
                calories=150;
                System.out.println("your order is "+size+" your order calories= "+calories+" and prise is be $"+price);
              // break;//if we didint use when size equal grande system run grande and next line exept brake;

            case "Venti":
                price=5.50;
                calories=200;
                System.out.println("your order is "+size+" your order calories= "+calories+" and prise is be $"+price);
               break;//

            default:

             validorder=false;



        }
        if (validorder){//default work and when valid its false else its be work
            System.out.println("your order is "+size+" your order calories= "+calories+" and prise is be $"+price);
        }else{
            System.out.println("invalid enter");
        }














    }
}
