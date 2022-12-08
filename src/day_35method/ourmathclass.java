package day_35method;

import java.util.Scanner;

public class ourmathclass {
    public static void adds(int num,int num2){
        System.out.println(num+"+"+num2+"="+(num+num2));

    }

    public static void substrac(int num,int num2){
        System.out.println(num+"-"+num2+"="+(num-num2));

    }

    public static void multipl(int num,int num2){
        System.out.println(num+"*"+num2+"="+(num*num2));

    }

    public static void devise(double num,double num2){
        if (num2!=0)
        System.out.println(num+"/"+num2+"="+(num/num2));
else
            System.out.println("not devise by 0");
    }

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter first number ");
        double nums= scan.nextInt();
        System.out.println("please enter second number");
        double nums2=scan.nextInt();

        adds((int)nums,(int)nums2);
        substrac((int)nums,(int)nums2);
        multipl((int)nums,(int)nums2);
        devise(nums,nums2);
        System.out.println();




    }













}
