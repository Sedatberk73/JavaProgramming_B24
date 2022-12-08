package saimonlypractise;

import java.util.Scanner;

public class related {
    public static void main(String[] args) {
        /*
        Given two full names check if the two people are related.
        They will be considered to be related if they have the same last nameEx:Input:James BondJamie BondOutput: Related Input:James BondAlex BenjiOutput: Not Related
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("enter ful name");
        String firstname=scan.nextLine();
        int last=firstname.lastIndexOf(" ");

        System.out.println("enter your name ");
        String secondlastname=scan.nextLine();
        int sclast=secondlastname.lastIndexOf(" ");

        if (firstname.substring(last).equalsIgnoreCase(secondlastname.substring(sclast))){
            System.out.println("related");
        }else{
            System.out.println("not related");
        }




















    }
}
