package day_34methods;

import java.util.Arrays;
import java.util.Scanner;

public class multiArray {
    public static void main(String[] args) {
        Scanner scn=new Scanner(System.in);
        String[][] allwords=new String[4][];
        System.out.println(Arrays.deepToString(allwords));


        System.out.println("enter multiple words seperated by a space");
        //   String [] first=scn.nextLine().trim().split(" ");
     allwords[0]=scn.nextLine().trim().split(" ");
       // System.out.println(Arrays.toString(first));
//scn.nextLine();
        System.out.println("enter multiple words last");
       // String [] last=scn.nextLine().trim().split(" ");
        allwords[1]=scn.nextLine().trim().split(" ");
       // System.out.println(Arrays.toString(first));


        System.out.println(Arrays.deepToString(allwords));



//ac gozunu seyret tekrari yok bunun isimiz muhabbet efkari yok bunun





    }
}
