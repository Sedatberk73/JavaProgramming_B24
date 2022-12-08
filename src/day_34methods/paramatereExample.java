package day_34methods;

import java.util.Scanner;

public class paramatereExample {
    public static void main(String[] args) {
        getAge(2000);
        getAge(1993);
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your birthday");
        int year=scan.nextInt();
        getAge(year);
    }

    public static void getAge(int year){
        System.out.println("your age in 2021 is ");
        System.out.println(2021-year);
    }

















}
