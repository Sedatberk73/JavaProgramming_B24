package day_25breakcontuniue;

import java.util.Arrays;

public class example {
    /*
Sum. Write a method that accepts int[] array and an int number, find 2 elements in the array that sum is equal to the given int. Assume that an input array will have only one pair of numbers that sum equal to our given number. It will always have this pair. See input and output examples. I will use the Brute Force algorithm. If you have a better algorithm, please put it in the comments. I will be happy to see it.
     */
    // sum({1, 2, 3, 5}, 4)     -> {1, 3}
    // sum({7, 7, 4, 3, 8}, 7)  -> {4, 3}

    public static int[] arr(int[] all,int num){

        int[] nums= new int[2];

        for (int i=0;i<all.length;i++){

            for (int j=0;j<all.length;j++){
                if (all[i]+all[j]==num){
                    nums[0]=all[i];
                    nums[1]=all[j];
                }

            }



        }
        return nums;

    }

    public static void main(String[] args) {
        int [] arrs={1,2,3,5,7};

        System.out.println(Arrays.toString(example.arr(arrs,12)));
    }









}
