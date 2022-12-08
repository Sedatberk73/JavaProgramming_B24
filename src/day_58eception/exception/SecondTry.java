package day_58eception.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SecondTry {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        try {
            System.out.println("enter a number");
            int num= scan.nextInt();
            System.out.println("enter enother number ");
            int num2= scan.nextInt();
            System.out.println(num/num2);

        }catch (InputMismatchException e){
            System.out.println("we wanted a number");
       } catch (ArithmeticException a) {
            //System.out.println("Cannot divide by 0");
            System.out.println(a.getMessage());// / by zero
        }finally {
            System.out.println("ere");
        }

















    }
}
