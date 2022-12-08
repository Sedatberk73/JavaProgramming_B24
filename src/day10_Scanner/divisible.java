package day10_Scanner;

import java.util.Scanner;

public class divisible {
    /*todo:
    create a class Divisiblecreate a main methodcreate a Scanner objectAsk the user to enter a number.
    Check if that number is evenly divisible by 2, 3, and 5.
     Print the boolean valuesEx:Enter a number6565 is divisible by 2:
     false65 is divisible by 3: false65 is divisible by 5: true

     */
    public static void main(String[] args) {

      /*  Scanner methodcreate=new Scanner(System.in);
        System.out.println("enter a number");
        int number= methodcreate.nextInt();
        boolean isdivisible=(number%2)==0 &&(number%3)==0 &&(number%5)==0;
        System.out.println("isdivisible = " + isdivisible);*/

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number");
        int num= scan.nextInt();
        boolean isdevisible=num%5==0&&num%3==0&&num%2==0;
        System.out.println("isdevisible = " + isdevisible);







    }
}
