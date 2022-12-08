package day_24loops;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class multiplicationtable {


    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        int arr[]={1,2,3,4,5,7,8,9,10};
        for (int i=0;i<arr.length;i++){

            System.out.println("------table for "+arr[i]+"------");
            for (int j=0;j<arr.length;j++){


                System.out.println(arr[i]+"*"+arr[j]+"="+arr[i]*arr[j]);


            }


        System.out.println("enter your number");








        }



























    }

}
