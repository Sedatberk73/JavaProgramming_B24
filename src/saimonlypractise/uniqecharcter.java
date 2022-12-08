package saimonlypractise;

import java.util.Scanner;

public class uniqecharcter {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String in= scan.nextLine();
        String uniq="";
        String last="";

        for (int i=0;i<in.length();i++){


            if (uniq.contains(""+in.charAt(i))){
                uniq+=in.charAt(i);

            }



        }
        System.out.println(uniq);






















    }
}
