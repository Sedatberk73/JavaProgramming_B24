package day_23loops;

import java.util.Scanner;

public class shoppinglist {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        String shppinglist="";
        String admore;
        do {
            System.out.println("enter your item");
            shppinglist+=scan.nextLine()+",";
            System.out.println("do you wanna ad more");
            admore=scan.nextLine();
        }while (admore.equals("y")||admore.equalsIgnoreCase("yes"));//we can use YES ,yes,yEs,YEs,yeS,


        System.out.println("shppinglist "+shppinglist.substring(0,shppinglist.length()-2));

















    }
}
