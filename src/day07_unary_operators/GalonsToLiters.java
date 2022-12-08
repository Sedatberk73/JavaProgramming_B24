package day07_unary_operators;

import java.util.Scanner;

public class GalonsToLiters {
    /*
    and write a program that can convert the gallons tto litters
    galon = 10;output:10 gallons equal to 37.8541 litersgalon = 20


     */
    public static void main(String[] args) {
       /* Scanner scan = new Scanner(System.in);
        System.out.println("how many do you have gallons water");
        double gl =scan.nextDouble();

        double liter=gl*3.785441178;

        System.out.println("your gallons should be "+liter+" litter");*/



        //x=8
        //y=10
        //z=81
        //i= 17

        //next a=7 b=8
        //a=1,
        // b=-a--+ a++/-a--*--a
        int a=1;//
        int b=-a-- + a++/-a-- *--a;
        System.out.println(b);
        System.out.println(a);
        int A = 50;
        int B = --A + A++ + A-- + A++;
        System.out.println("B = " + B);
        System.out.println("A = " + A);

        int X = 4;int Y = X * 4 - X++;
        System.out.println("Y = " + Y);
        System.out.println("X = " + X);


        int t = 100;int p = - ++t * -t-- / t++ + --t;
        System.out.println("t = " + t);
        System.out.println("p = " + p);

        int R = 20;
        int W = -R-- + -R++ + --R * R-- % 2;
        System.out.println("W = " + W);
        System.out.println("R = " + R);
        // TODO: 8/5/2021 ask teacher how is working;


       int y=R%2;
        System.out.println("y = " + y);

        int M = 300;int N = 400;int U = ++M + N++ - M-- % 2 + --N % 2;
        System.out.println("U = " + U);
        System.out.println("N = " + N);
        System.out.println("M = " + M);








    }
}
