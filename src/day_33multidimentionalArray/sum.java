package day_33multidimentionalArray;

import java.util.Arrays;

public class sum {
    public static void main(String[] args) {

        int [] arr={1,2,3,4};
        int [] sum= Arrays.copyOf(arr,arr.length+1);

//        for (int i=0;i<arr.length;i++){
//            sum[sum.length-1]+=arr[i];
//        }
//        System.out.println(Arrays.toString(sum));//[1, 2, 3, 4, 10]
//
//

for(int i:arr){
    sum[sum.length-1]+=i;
}
        System.out.println(Arrays.toString(sum));









    }
}
