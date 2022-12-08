package day_36methods;

import my_utilities.StringUtil;

import java.util.Scanner;

public class UsingStringMethods {
    public static void main(String[] args) {
        System.out.println(   StringUtil.reverse("Soft skilss"));

        String s="racecar";
        String reverse=StringUtil.reverse(s);

        System.out.println(s.equals(reverse));//true//polindrom
        Scanner scan=new Scanner(System.in);
        System.out.println("enter some words");
        System.out.println(StringUtil.reverse(scan.nextLine()));

        System.out.println("enter some words");
        System.out.println(StringUtil.proper(scan.nextLine()));


    }







}
