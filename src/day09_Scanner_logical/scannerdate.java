package day09_Scanner_logical;

import java.util.Scanner;

public class scannerdate
{
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("pelase enter your month ");
        byte month=scan.nextByte();
        System.out.println("please enter your date");
        short day=scan.nextShort();
        System.out.println("please enter your year");
        int year=scan.nextInt();


        String today=month+"/"+day+"/"+year;
        System.out.println("today is: "+today);







    }
}
