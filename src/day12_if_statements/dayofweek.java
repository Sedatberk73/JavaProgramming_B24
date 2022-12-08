package day12_if_statements;

import java.util.Scanner;

public class dayofweek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your number");
        int day= scan.nextByte();
        String result="";
        if(day==1){
            result="monday";
        }else if(day==2){
            result="tuesday";
        }else if(day==3){
            result="wednesday";
        }else if(day==4){
            result="thursday";
        }else if(day==5){
            result="friday";
        }else if(day==6){
            result="saturday";
        }else if(day==7){
            result="sunday";
        }else {
            result="invalid day number";
        }
        System.out.println("result = " + result);

















    }
}
