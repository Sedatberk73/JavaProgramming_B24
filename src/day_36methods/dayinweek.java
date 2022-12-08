package day_36methods;

import java.util.Scanner;

public class dayinweek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter day number");
        int num=scan.nextInt();
       //burada yapilan degeri methodun icine vermemiz gerekiyor
        System.out.println(gatDayOfWeek(num));
        System.out.println(gatDayOfWeek(num).charAt(0));//firstly put parameteris inside methods than wnts to firstletter

        if (gatDayOfWeek(num).equals("saturday")||gatDayOfWeek(num).equals("sunday")){
            System.out.println("its the weekend working hard");
        }


    }

    public static String gatDayOfWeek(int number){

        String day="";
        switch (number){
            case 1: day="monday"; break;
            case 2: day="tuesday"; break;
            case 3: day="wednesday"; break;
            case 4: day="thursday"; break;
            case 5: day="friday"; break;
            case 6: day="saturday"; break;
            case 7: day="sunday"; break;
            default: day="not valid number";

        }

        return day;//buraya gelen degeri isletim hangi islmle geri donnmesi icin return degerini verdik return burada islenen degeri yeni degerle geri gonderiryor

    }











}
