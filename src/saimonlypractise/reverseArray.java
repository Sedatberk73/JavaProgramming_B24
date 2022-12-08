package saimonlypractise;

import java.util.Arrays;

public class reverseArray {
    public static void main(String[] args) {

        int[] arr={1,2,3,4,5,6,7};
        int [] rever=new int[arr.length];
        int j=arr.length-1;
        for (int i=0;i<arr.length;i++){
            rever[i]=arr[j];
            j--;

        }
        System.out.println(Arrays.toString(rever));








    }
}
