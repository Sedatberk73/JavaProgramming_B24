package day_32Array;

import java.util.Scanner;

public class splitPractise {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter words");
        String word=scan.nextLine();
        scan.close();
        String [] wordes=word.split(" ");
        String rever="";
        for (int i=wordes[1].length()-1;i>=0;i--){
            rever+=wordes[1].charAt(i);
        }
        System.out.println(wordes[0]+" "+rever+" "+wordes[2]);











    }
}
