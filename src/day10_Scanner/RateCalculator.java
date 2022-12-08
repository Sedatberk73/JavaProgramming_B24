package day10_Scanner;

import java.util.Scanner;

public class RateCalculator {
    /*
    create a class RateCalculatorcreate a main methodcreate a Scanner
     objectAsk the user to enter a salary (double)
    Print the hourly rate (double) of the
    employeeassume that one year has 52 weekshourRate = salary / (weeklyHour * 52)
     */

    public static void main(String[] args) {
       /*
        System.out.println("enter your salary;");
        double salary= scan.nextDouble();
        System.out.println("enter your  weekly hour:");
        double weeklyhour= scan.nextDouble();



        double haourlyrate=salary/(weeklyhour*52);
        System.out.println("with salary of: "+salary+"your haourly rate: "+haourlyrate);*/

        Scanner scan=new Scanner(System.in);
        System.out.println("enter your salary");
        double salary= scan.nextDouble();
        System.out.println("please neter your weekly salary");
        double weeklysalary= scan.nextDouble();

        double hourlyrate=salary/(weeklysalary*52);
        System.out.println("hourlyrate = " + hourlyrate);








    }



}
