package day_19String;

import java.awt.*;
import java.util.Scanner;

public class initials {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("enter first name");
        String name=scan.nextLine();

        System.out.println("enter last name");
        String lastname=scan.nextLine();


     //   System.out.println("the name initials(basharfleri) with uppercase="+name.toUpperCase().charAt(0)+lastname.toUpperCase().charAt(0));//SB

String first= ""+name.charAt(0);//eger basina "" eklemesek int deger olacak
        System.out.println(first);

        System.out.println("your name initial="+name.toUpperCase().charAt(0)+lastname.toUpperCase().charAt(0));












    }
}
