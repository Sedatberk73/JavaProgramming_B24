package day10_Scanner;

import java.util.Scanner;

public class evenodd {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter the number");
        long num= input.nextLong();
         boolean iseven=num%2==0;
         boolean isodd=num%2!=0;
        System.out.println(num+" is even "+iseven);
        System.out.println(num+" is add "+isodd);







    }
}
