package day_24loops;

import java.util.Scanner;

public class uniqucharakter {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
//        System.out.println("enetr a word");
//        String w= scan.nextLine();
//        System.out.println("enter a letter");
//        char un=scan.next().charAt(0);
//        int count=0;
//
//
//        for (int i=0;i<w.length();i++){
//            if (w.charAt(i)==un){
//                count++;
//
//            }
//
//
//        }
//        if (count==1){
//            System.out.println(un+" uniqe");
//        }else if (count==0){
//            System.out.println(un+" was nat in the string");
//        }else {
//            System.out.println(un+" not uniqe "+un+" use "+count+" times");
//        }
//
//
String s="sedats";
int count=0;
            for (int i=0;i<s.length();i++){

                if (s.charAt(i)=='s'){
                    count++;
                }
            }

        System.out.println(count);







    }
}
