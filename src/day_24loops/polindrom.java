package day_24loops;

import java.util.Scanner;

public class polindrom {
    public static void main(String[] args) {
//        Scanner scan=new Scanner(System.in);
//        String pol= scan.nextLine();
//        String revers="";
//
//        for (int index=pol.length()-1;index>=0;index--){//index always start 0 thatsway we use length-1;
//
//            revers+=pol.charAt(index);
//
//        }
//        if (pol.equalsIgnoreCase(revers)){
//            System.out.println(pol+" polindrom "+revers);
//        }else{
//            System.out.println(pol+" not polindron "+revers);
//        }
////


        Scanner scan=new Scanner(System.in);
      String pol= scan.nextLine();
       String revers="";


       for (int i=pol.length()-1;i>=0;i--){
           revers+=pol.charAt(i);


       }
       if (pol.equals(revers)) {
           System.out.println(pol + " is revers "+revers);
       }else{
           System.out.println(pol+" is not revers "+revers);
       }







    }
}
