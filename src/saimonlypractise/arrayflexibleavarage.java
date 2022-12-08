package saimonlypractise;

import java.util.Arrays;
import java.util.Scanner;

public class arrayflexibleavarage {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("how many number do you run for avarage");
        int[] number=new int[scan.nextInt()];//intyeger degerini belirledik
        int avarage=0;

        for (int i=0;i<number.length;i++){
            System.out.println("enter your number "+(i+1));
            number[i]=scan.nextInt();
            avarage+=number[i];
        }
        System.out.println("your numbers whole is "+ Arrays.toString(number));
        System.out.println("your number avarage="+avarage/number.length);
        System.out.println("your total number is "+avarage);
        System.out.println("you just wanted "+number.length+" numbers");














    }
}
