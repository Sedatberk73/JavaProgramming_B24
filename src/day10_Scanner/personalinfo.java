package day10_Scanner;

import java.util.Scanner;

public class personalinfo {
    public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);
        System.out.println("enter their age");
        byte age= scan.nextByte();
        System.out.println("enter the favorite number");
        long num= scan.nextLong();
        System.out.println("are they student?  true or false");
        boolean isstudent=scan.nextBoolean();
        System.out.println("this is your personel info: ");
        System.out.println(" age : "+age);
        System.out.println("favorite number: "+num);
        System.out.println("are you student "+isstudent);*/
        Scanner scan=new Scanner(System.in);
        System.out.println("enter their age: ");
        byte age = scan.nextByte();
        System.out.println("enter the favorite number");
        long num=scan.nextLong();
        System.out.println("are you student");
        boolean isstudent= scan.nextBoolean();

        System.out.println("this is your personel info");
        System.out.println("age"+age);
        System.out.println("age = " + age);
        System.out.println("isstudent = " + isstudent);






    }
}
