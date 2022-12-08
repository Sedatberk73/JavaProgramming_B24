package dayfuturelessons;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num= scan.nextInt();
        //fibonacii numbers
        //0,1,1,2,3,5,8,13,21,34; her zaman 0ve birle baslar ilk iki sayi ucuncunun totlamina
        // esit ve bu sekilde devam ediyor
        int s1=0;
        int s2=1;
        int total;
        for (int i=1;i<=num;i++){
            System.out.print(s1+",");
            total=s1+s2;
            s1=s2;
            s2=total;




        }














    }
}
