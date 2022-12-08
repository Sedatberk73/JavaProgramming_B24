package day_38methods;

import java.util.Arrays;
import my_utilities.ArraysUtill;
public class AddToArray {

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int num=68;
        System.out.println(Arrays.toString(ArraysUtill.addElement(arr,num)));
        System.out.println("edd element with two array");
        int [] y={6,7,8,9};
        System.out.println("its gana be twoo array concat and overloading  "+Arrays.toString(ArraysUtill.addElements(arr,y)));

        System.out.println(Arrays.toString(ArraysUtill.addElements(arr,y)));
       // System.out.println(Arrays.toString(ArraysUtill.addElements(arr,100))); we cant do it right now because we overloaded with two array so we need two array






    }


//    public static int[] addElement(int[] arr,int element){
//int [] newArray=new int[arr.length+1];
//
//for (int i=0;i<arr.length;i++){
//    newArray[i]=arr[i];
//}
//newArray[newArray.length-1]=element;
//
//
//
//
//     return newArray;
//    }











}
