package saimonlypractise;

import java.util.Scanner;

public class mail {
    public static void main(String[] args) {
        /*
        Ask user to enter two strings. Bothstrings should be at least 6 character long. If they are shorter than that print “Invalid data” and program should end.If the information provided is valid, you will take the first 4 characters of first string and combine them with the last three characters of the second string. At the end of your combined string add “@cybertek.com” and print the final string as your created email. The final email should be in all lowercase.
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("your name ");
        String name= scan.nextLine();
        System.out.println("enter last neme");
        String lastname= scan.nextLine();

        int total=name.length()+lastname.length();

        if (total>=6){
            System.out.println(name.substring(0,4).toLowerCase()+lastname.substring(lastname.length()-3).toLowerCase()+"@cybertek.com");
        }
        if (total<6){
            System.out.println("inavild data");
            System.exit(0);
        }








    }
}
