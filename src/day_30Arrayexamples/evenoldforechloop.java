package day_30Arrayexamples;

import java.util.Scanner;

public class evenoldforechloop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("how many numbers do you want to enter");
        int number[]=new int[scan.nextInt()];
        int even=0;
        int odd=0;
String evens="";
String odds="";
        for (int i=0;i<number.length;i++){
           number[i]= scan.nextInt();
           if (number[i]%2==0){

           }
        }
for (int eachnumber:number){//foeachloop hangi deger olusturduysak o degerle islem yapilir
    if (eachnumber%2==0){
        even++;
        evens+=eachnumber;
    }else {
        odd++;
        odds+=eachnumber;
    }
}

        System.out.println("odd = " + odd);
        System.out.println("even = " + even);
        System.out.println("evens = " + evens);
        System.out.println("odds = " + odds);










    }
}
