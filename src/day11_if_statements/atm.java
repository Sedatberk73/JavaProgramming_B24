package day11_if_statements;

import java.util.Scanner;

public class atm {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("welcome to atm ");
        System.out.println("please enter your pascode");
        int inputpascode= scan.nextInt();
        int validpascode=1234;
        int value =1000;
        if (inputpascode==validpascode){
            System.out.println("welcome your acount please select a number");
            System.out.println("\t1) chak to balanne");
            System.out.println("\t2) chak to deposit");
            System.out.println("\t3) chak to withdraw");
            int selection=scan.nextInt();
            if (selection==1){
                System.out.println("your balance is : "+value);
            }
            if (selection==2){
                System.out.println("enter your bills in the sloot");
            }

            if (selection==3){
                System.out.println("take your money from the dispenser");
            }



        }else{
                System.out.println("its not correct please try again");
                inputpascode=scan.nextInt();
                

            }










    }
}
