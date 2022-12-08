package day10_Scanner;

import java.util.Scanner;

public class Shoppinglist {
    public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);
    String item1, item2,item3,report="";
    double price1,price2,price3,totalprice=0;
        System.out.println("Enter Item and its Price");
        item1=scan.nextLine();
        price1=scan.nextDouble();
        scan.nextLine();
        totalprice+=price1;
        report+="item1: "+item1+" "+"price: "+price1+", ";


        System.out.println("Enter Item2 and its Prise2");
        item2=scan.nextLine();
        price2=scan.nextDouble();
        totalprice+=price2;
        report+="Item2: "+item2+" "+"price: "+price2+", ";

        scan.nextLine();//for nextline


        System.out.println("Enter item3 and its Prise3");
        item3=scan.nextLine();
        price3=scan.nextDouble();
        totalprice+=price3;
        report+="Item3: "+item3+" "+"Price: "+price3;


        System.out.println(report);
        System.out.println("Total Price: "+totalprice);




}
}