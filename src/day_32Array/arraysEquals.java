package day_32Array;

import java.util.Arrays;

public class arraysEquals {
    public static void main(String[] args) {

int [] a={1,3,4};
int[] b={1,3,4};
int[] c={1,3,5};
        int[] d={1,3,5,7,6};
        int[] e={4,3,1};
        System.out.println(Arrays.equals(a,b));//true
        System.out.println(Arrays.equals(a,c));//false
        System.out.println(Arrays.equals(d,c));//false
        System.out.println(Arrays.equals(a,e));//false
Arrays.sort(e);
        System.out.println(Arrays.equals(a,e));//true





    }
}
