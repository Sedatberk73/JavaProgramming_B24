package officehourspractice.day_09_15_2021;

import java.util.Arrays;
import java.util.Scanner;

public class revereachword {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your words");
        String str=scan.nextLine().trim();

        String[] arr=str.split(" ");

        String revers="";

        for (String eachword:arr){

         String eaces="";
            for (int i=eachword.length()-1;i>=0;i--){
                revers+=""+eachword.charAt(i);

            }
            revers+=" ";

         //revers+=eaces+" ";

           // System.out.print(eaces);
        }
        System.out.println();
        System.out.println(revers.trim());















    }
}
