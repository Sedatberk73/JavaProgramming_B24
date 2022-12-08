package day_30arrayPrctise;

import java.util.Arrays;
import java.util.Scanner;

public class convertName {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("ente your name");
        String letter=scan.nextLine();
        char[] name=letter.toCharArray();
        System.out.println(Arrays.toString(name));//[s,e,d,a,t]
        System.out.println(Arrays.toString(letter.toCharArray()));//[s,e,d,a,t]
        System.out.println(letter.toCharArray());//sedat
        System.out.println(letter.toCharArray()[2]);//d
        System.out.println(name[name.length-1]);//last character t







    }
}
