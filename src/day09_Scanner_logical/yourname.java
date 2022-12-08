package day09_Scanner_logical;

import java.util.Scanner;

public class yourname {
    public static void main(String[] args) {
        Scanner scan = new Scanner((System.in));
        System.out.println("enter your name and last name");
        String firstname= scan.next(),lastname= scan.next();



        System.out.println("your name is "+firstname+" \t\n"+lastname);




    }
}
