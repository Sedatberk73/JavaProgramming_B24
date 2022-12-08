package saimonlypractise;

import java.util.Arrays;
import java.util.Scanner;

public class secondmaximumnumber {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);

        System.out.println("how many numbers do you wanna look for maximum and minum");
        int[] number=new int[scan.nextInt()];
        int mux=0;




        for (int i=0;i<number.length;i++){
            System.out.println("eneter number "+(i+1));
            number[i]=scan.nextInt();
            if (number[i]>mux){
                mux=number[i];
            }




        }
        int min=number[0];//eger yukarda olsaydi yani array degeri vermeden once olsaydi sifir yazilir cunku daha array yazilmamisti
        for (int i=number.length-1;i>=0;i--){

            if (number[i]<min){
                min=number[i];
            }

        }


        System.out.println("max number "+mux);
        System.out.println("min number "+min);
        System.out.println("whole number "+ Arrays.toString(number));














    }
}
