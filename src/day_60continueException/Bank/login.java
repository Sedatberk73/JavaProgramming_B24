package day_60continueException.Bank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class login {
    Scanner scan=new Scanner(System.in);
    final String expextpasword="12345";
    String pasword;

    public void login(){

        System.out.println("Welcome to sedat berk ATM");
        System.out.println("Please enter your password");
        String actualPasword=scan.next();



    }

    public static void main(String[] args) {
        Balance bank=new Balance();
        bank.balance=500;

     //   bank.withdraw(200);
       // bank.withdraw(700);
        bank.balance=-50;
        bank.withdraw(20);



    }




}
