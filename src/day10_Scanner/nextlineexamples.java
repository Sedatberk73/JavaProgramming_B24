package day10_Scanner;

import java.util.Scanner;

public class nextlineexamples {
    public static void main(String[] args) {
     /*   Scanner scan=new Scanner(System.in);
        System.out.println("enter a number");
        int input= scan.nextInt();

        scan.nextLine();

        System.out.println("enter your full name");
        String Fullname= scan.nextLine();//not allowed for line we should to use scan.nextline() before ask


        System.out.println(input);
        System.out.println(Fullname);*/
    Scanner scan=new Scanner(System.in);
        System.out.println("enter a number please");
        int num=scan.nextInt();

        scan.nextLine();
        System.out.println("enter your full name");
        String name= scan.nextLine();
        System.out.println(num);
        System.out.println(name);








    }


}
