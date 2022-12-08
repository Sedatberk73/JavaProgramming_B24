package day_26practise;

import sun.nio.cs.ext.IBM424;

import java.util.Scanner;

public class htmlgenaretorsystem {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("enter your tags");
        String tag= scan.nextLine();
        String total="";
        String first="<";
        String second=">";
        String third="</";
       int number=Integer.parseInt(tag.substring(tag.indexOf("^")+1));//to integer
        tag=tag.substring(0,tag.indexOf("^"));
       for (int i=0;i<number;i++){
           total+=first+tag+second+third+tag+second;

       }
        System.out.println(total);






    }
}
