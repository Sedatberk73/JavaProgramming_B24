package day_24loops;

import java.util.Scanner;

public class obebokek {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter two number");
        int s1= scan.nextInt();
        int s2=scan.nextInt();
        int obeb=0;
        int okek;

        int min=s2>s1?s2:s1;

        for (int i=min;i>0;i--){

            if (s1%i==0&&s2%i==0){
                obeb=i;
                break;
            }
        }
        okek=s1*s2/obeb;

        System.out.println("obeb "+obeb+" okek: "+okek);























    }
}
