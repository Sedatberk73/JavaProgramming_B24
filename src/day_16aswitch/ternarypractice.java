package day_16aswitch;

import java.util.Scanner;

public class ternarypractice {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter the items name");
        String itemname=scan.nextLine();

        System.out.println("enter the price of "+itemname);
        double itemprice=scan.nextDouble();

        System.out.println("do you have prime");
        String hasprice=scan.next();
//ad five dolar if dont has prime
        double finalprice=hasprice.equals("yes")||hasprice.equals("YES")||hasprice.equals("Yes")? itemprice:itemprice+5;
        System.out.println("your total price for "+itemname+" $"+finalprice);













    }
}
