package day_30arrayPrctise;

import java.util.Arrays;

public class countwords {
    public static void main(String[] args) {
        String s="java is fun";
        String[] arr=s.split(" ");
        String reverse="";
        System.out.println(Arrays.toString(arr));//[java, is, fun]

        for (int i=0;i<arr.length;i++){
            reverse+=arr[arr.length-i-1]+" ";//fan is java
        }
        System.out.println(reverse);


        String cats ="bangal cat tabby cat persion cat no cat here";
        String [] arrs =cats.split("cat");//only cut cap word and get array
        System.out.println(Arrays.toString(arrs));//[bangal ,  tabby ,  persion ,  no ,  here]

        arrs =cats.split(" cat ");//--> cut space and cat
        System.out.println(Arrays.toString(arrs));//[bangal, tabby, persion, no, here]--



















    }
}
