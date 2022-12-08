package day13_ifelsecontinue;

import java.util.Scanner;

public class retake {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("what attempt number is this");
        int attemt=scan.nextInt();
        System.out.println("what is your grade after "+attemt);
        double grade= scan.nextDouble();

        double result=0;
        if(attemt==1){
            result=grade-grade*0.1;
        }else if(attemt==2){
            result=grade-grade*0.2;
        }else if(attemt==3){
            result=grade-grade*0.35;
        }
        System.out.println("after attemt "+attemt+" your final grade "+result);






    }
}
