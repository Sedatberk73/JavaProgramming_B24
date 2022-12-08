package day09_Scanner_logical;

import java.util.Scanner;

public class Addnumber {
    public static void main(String[] args) {
        Scanner keyboar=new Scanner(System.in);
        System.out.println("enter three number: ");
        int one= keyboar.nextInt();
        int two= keyboar.nextInt();
        int three= keyboar.nextInt();


        String msg=one+"+"+two+"+"+three+"=";

        System.out.println(msg+(one+two+three));


    }
}
