package dardanmentorjava.araysexamples;

import java.util.ArrayList;
import java.util.Arrays;

public class lastindexzeros {
    public static void main(String[] args) {
        int[] num={1,2,0,0,1,3,4,5,0,5,7};

        ArrayList<Integer> n=new ArrayList<>();

        System.out.println(Arrays.toString(lastzero(num)));
    }

    public static int[] lastzero(int[] nums){
        int lastindex[]=new int[nums.length];
        int count=0;
        for (int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                lastindex[count++]=nums[i];
            }

        }

        return lastindex;
    }


}
