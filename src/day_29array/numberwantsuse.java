package day_29array;

import java.util.Arrays;
import java.util.Scanner;

public class numberwantsuse {


    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many numbers do you want to enter");
       int size=scan.nextInt();

       int [] num=new int[size];


       for (int i=0;i<size;i++){
           System.out.println("enter number "+(i+1));//0+1
           num[i]=scan.nextInt();
       }
        System.out.println("your number each is "+Arrays.toString(num));
       int avarege=0;

       for (int i=0;i<num.length;i++){
           avarege+=num[i];
       }
        System.out.println();
        System.out.println("total number avarege "+avarege/num.length);












    }
}
