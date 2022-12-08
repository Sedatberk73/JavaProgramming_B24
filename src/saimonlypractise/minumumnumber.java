package saimonlypractise;

import org.w3c.dom.css.CSSStyleSheet;

import java.util.Scanner;

public class minumumnumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter serial number");
   /*  int smallest=scan.nextInt();
     while (scan.hasNextInt()){//int degerleri durdurmak icin kullanilir
         int input=scan.nextInt();
         if (input<smallest){
             smallest=input;
         }
     }
        System.out.println("smallest = " + smallest);*/
      int smallest=scan.nextInt();
        int number=1;

        while (number<=4){
            int  input=scan.nextInt();
            if (input<smallest){
                smallest=input;
            }
            number++;
        }
        System.out.println("smallest = " + smallest);

























    }
}
