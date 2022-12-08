package dardanmentorjava.dardanexamples2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class concatintwoArrays {
    /*
    Hello all
Here are the new java coding questions:

1. Array -- Concat two arrays
Write a return method that can concate two arrays.

2.Numbers -- odd & even
Write  a method which can identifies given number is even or odd

EX:
identify(5) ->  "Odd"

identify(6) ->  "Even".
and 3. Numbers -- Divide without / operator
Write a method that can divide two numbers without using division operator
     */

int[] arr1;
int[] arr2;

    public concatintwoArrays(int[] arr1, int[] arr2) {
        this.arr1 = Arrays.copyOf(arr1,arr1.length);
        this.arr2 =  Arrays.copyOf(arr2,arr2.length);
       // concetarray(arr1,arr2);
    }

    public int[] concetarray(int[] arr1, int[] arr2){
        int[] concet=new int[arr1.length+arr2.length];
        int num=0;
        for (int i=0;i<arr1.length;i++){
            concet[num++]=arr1[i];
        }
        for (int i=0;i<arr2.length;i++){
            concet[num++]=arr2[i];
        }

        return concet;
    }

    public static void main(String[] args) {
        int[] a={1,2,3,4,5};
        int b[]={6,7,8,9};

        concatintwoArrays concat=new concatintwoArrays(a,b);

        System.out.println(Arrays.toString(concat.concetarray(a,b)));

    }








}
