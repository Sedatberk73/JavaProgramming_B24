package day14ifstatements;

import java.util.Scanner;

public class fizzbuzz {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        /*

Task: Evaulate your number and print based on the following:
    multiples of three print “Fizz” instead of the number and for the multiples of five print “Buzz”
     For numbers which are multiples of both three and five print “FizzBuzz”.
      If the number is not disibile by any of those numbers print just the number
    Example:
        number = 5
        "FizzBuzz" -> when number is divisible by 3 and  5
        "Fizz" -> when number is divisible by 3
        "Buzz" -> when number is divisible by 5

         */
        System.out.println("enter first number");
        int first= scan.nextInt();
        System.out.println("enter second number");
        int second= scan.nextInt();
        if (first%3==0&&first%5==0&&second%3==0&&second%5==0){
            System.out.println("Fizzbuzz");
        }else if (first%3==0&&second%3==0){
            System.out.println("fizz");
        }else if (first%5==0&&second%5==0){
            System.out.println("buzz");
        }else {
            System.out.println(first+" "+second);
        }







    }
}
