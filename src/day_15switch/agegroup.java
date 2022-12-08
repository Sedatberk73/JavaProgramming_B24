package day_15switch;

import java.util.Scanner;

public class agegroup {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        System.out.println("enter your age");
        int age= scan.nextInt();

       while (age>0&&age<120){
           System.out.println("enter your age");
           age= scan.nextInt();
            if (age > 0 && age <= 1) {
                System.out.println("infant");


            } else if (age >= 3 && age <= 5) {
                System.out.println("toddler");


            } else if (age >= 6 && age <= 9) {
                System.out.println("kid");

            } else if (age >= 10 && age <= 12) {
                System.out.println("boys");

            } else if (age >= 13 && age <= 17) {
                System.out.println("teenager");

            } else if (age >= 18 && age <= 20) {
                System.out.println("younger");

            } else if (age >= 21 && age <= 35) {
                System.out.println("adult");

            } else if (age >= 36 && age <= 55) {
                System.out.println("middle aged adult");

            } else if (age >= 55 && age <= 120) {
                System.out.println("senior citizen");

            } else {

                System.out.println("invalid enter");



            }
        }




























    }

}
