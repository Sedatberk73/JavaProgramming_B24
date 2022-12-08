package day11_if_statements;

import java.util.Scanner;

public class ifpractice {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        String message;
        double ratehourly=50;
        double weeklyhours=0;
        double netpay=0;
        System.out.println("please enter your weekly hours");
        weeklyhours=scan.nextDouble();
        if (weeklyhours>40){
            double overtime=weeklyhours-40;
            netpay=40*ratehourly;
            netpay+=ratehourly*1.5*overtime;
            message="your hourly with overtime "+netpay+" also you worked "+weeklyhours+" hours";
        }else{
            netpay=ratehourly*weeklyhours;
            message="your normal hour salary "+netpay;
        }
        System.out.println(message);












    }
}
