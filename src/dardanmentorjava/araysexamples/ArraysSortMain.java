package dardanmentorjava.araysexamples;

import java.util.Arrays;

public class ArraysSortMain {

    /*
    1. Array -- Sort Ascending
Write a return method that can sort an int array in Ascending order without using the sort method of the Arrays class
Ex:
int[] arr = {10, 9, 8, 7};
arr = Sort(arr);=>{ 7, 8, 9, 10};
     */
        public static int [] sorting(int[] list){
     //1,2,3,4,5
        for (int i=0;i<list.length;i++){
     //
            for (int j=0;j<list.length;j++){
                int num=0;
                //    i=0   1>
                if (list[i]<list[j]){
                    num=list[i];
                    list[i]=list[j];//lis[0]=2
                    list[j]=num;//list[2]=1
                }

            }



            }


        return list;

}

    public static void main(String[] args) {
        int [] arr={1,2,3,4,5};
        int [] brr ={7,6,5,3};
       // System.out.println(Arrays.toString(sorting(arr)));
        System.out.println(Arrays.toString(sorting(brr)));


    }




}
