package saimonlypractise;

import java.util.Scanner;

public class maximumandminumum {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("please enter serial number");
       int max=scan.nextInt();
       int min= scan.nextInt();
       while (scan.hasNextInt()){
           int input= scan.nextInt();
           if(max<input){
               max=input;
           }
           if(min>input){
               min=input;
           }


       }
        System.out.println("max number is "+max);
        System.out.println("the min number is "+min);

/*if we write < inside if its ganna be max    max<input=max
if we write > inside if its will be min  min>input=min
 if we write  max>input inside if and if we wants to max and min we should run min-->for max

 */








    }
}
