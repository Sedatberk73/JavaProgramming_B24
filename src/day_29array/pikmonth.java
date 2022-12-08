package day_29array;

import java.util.Arrays;
import java.util.Scanner;

public class pikmonth {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int month=0;
        int count=1;
      do {
          if (count==1){
          System.out.println("enter month");
        month= scan.nextInt();}
     if (count>1){
              System.out.println("please enter number between 0-12 ");
              month= scan.nextInt();
          }
        count++;
      }while (month<0&&month>12);







      String[] oursmonth={"jenuary","february","marc","app","may","jun","jul","agust","sep","oktober","november","december"};
     //   System.out.println(oursmonth[month]);

        System.out.println(oursmonth[month-1]);//if we didtn write "" for index 0 we should put minus 1 for index 0 because index start 0 riht now its came one - because i writed "" beofre jenuary

//todo came back



























    }
}
