package day_38methods;

import java.util.Scanner;

public class countElements {
    //how many time one lements has in array

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int arr[]=new int[5];
        arr[0]=scan.nextInt();arr[1]= scan.nextInt();arr[2]= scan.nextInt();arr[3]= scan.nextInt();arr[4]= scan.nextInt();
        System.out.println("which number you wana check");
        int num=scan.nextInt();

        System.out.println(frequencyOfElements(arr,num));
        System.out.println();
       // System.out.println(getUniqElements(arr));//void oldugu icin bu sekilde yazilamaz
        getUniqElements(arr,num);

    }






    public static int frequencyOfElements(int[] arr, int num){
        int count=0;
        for (int each:arr){
            if (each==num){
                count++;
            }
        }

        return count;
    }

public static void getUniqElements(int[] arr,int num){
        for (int each:arr) {
            int count = frequencyOfElements(arr, each);
            if (count==1){
                System.out.println("unuq number is "+each);
            }


        }



}










}
