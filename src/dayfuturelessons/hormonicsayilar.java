package dayfuturelessons;

import java.util.Scanner;

public class hormonicsayilar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
//        double k=0;
//        double h= scan.nextDouble();
//        while (h>0){
//            k+=1/h;
//            h--;
//            System.out.println(h);
//        }
//
//        double star= scan.nextDouble();
//        int y=0;
//        while (star>=y){
//            int k=1;
//            while (y>=k){
//                System.out.print("*");
//                k++;
//            }
//            System.out.println();
//            y++;
//        }


      int sayi1=1,sayi2;//ustlu sayilar

       sayi1= scan.nextInt();
        sayi2= scan.nextInt();
        int i=1;//girilen sayi kadar deger alacak tabi her seferinde ++ekleyerek
        int ustolacaksaynintoplmi=1;

       while (i<=sayi2){
          ustolacaksaynintoplmi*=sayi1;//eger sayi2 yazsak o zaman sayi2*say2*say2 yani son sayinin koku olurdu biz ilk sayinin kokune bakiyoruz


          i++;
       }
        System.out.println("ustolacaksaynintoplmi = " + ustolacaksaynintoplmi);















    }
}
