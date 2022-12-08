package day_39_wrapper_calses;

import java.util.Scanner;

public class CountCharacters {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your mail");
        String mail= scan.nextLine();

        int countuppercase=0;
        int coountlowercase=0;
        int isdigitnumber=0;
        int allothernumber=0;
   //     for (int i=0;i<mail.length();i++){
//           if ( Character.isUpperCase(mail.charAt(i))){
//               countuppercase++;
//           }
//            if ( Character.isLowerCase(mail.charAt(i))){
//                coountlowercase++;
//            }
//            if ( Character.isDigit(mail.charAt(i))){
//                isdigitnumber++;
//            }
//
//            if ( !Character.isDigit(mail.charAt(i))&&!Character.isLowerCase(mail.charAt(i))&&!Character.isUpperCase(mail.charAt(i))){
//                allothernumber++;
//
//        }    }
            for(char each:mail.toCharArray()){
            if (Character.isUpperCase(each)){

     countuppercase++;
            }else if (Character.isLowerCase(each)){
            coountlowercase++;

            }else if (Character.isDigit(each)){
                isdigitnumber++;
            }else {
                allothernumber++;
            }
            }














        System.out.println("countuppercase = " + countuppercase);
        System.out.println("coountlowercase = " + coountlowercase);
        System.out.println("isdigitnumber = " + isdigitnumber);
        System.out.println("allothernumber = " + allothernumber);




    }
}
