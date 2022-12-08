package day_33multidimentionalArray;

import java.util.Arrays;

public class mergeArrays {
    public static void main(String[] args) {

        int [][] nums={
                {10,20,30},{5,10,50}

        };
        //task: takes the elements from the 2 d array an put all the numbers

        int [] merge=new int[nums[0].length+nums[1].length];
        int t=0;
        for (int i=0;i<nums[0].length-1;i++){

            for (int j=0;j<nums[1].length;j++){
                merge[t++]=nums[i][j];
            }

        }
        System.out.println(Arrays.toString(merge));











    }
}
