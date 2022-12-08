package saimonlypractise;

import java.util.Scanner;

public class camelcase {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your message");
        String word=scan.nextLine().trim().toLowerCase();
        String nl="";
String lost="";
String st="";
        int count=0;

        String Space=" ";
        for (int i=0;i<word.length();i++){

            if (word.charAt(i)==' '){

            st+=""+word.substring(i,i+1).toUpperCase();





            }else{
            st+=word.charAt(i)+"";
            }



        }


        System.out.println(st);







    }
}
