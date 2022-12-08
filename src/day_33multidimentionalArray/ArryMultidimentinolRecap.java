package day_33multidimentionalArray;

import java.util.Arrays;

public class ArryMultidimentinolRecap {
    public static void main(String[] args) {
        int [] arr={4,1,-4,60,-100,30};
        int [] arr2={30,60,-4,1,-100,4};


        System.out.println(Arrays.equals(arr,arr2));//its ganna check boolean value falce/true

        Arrays.sort(arr);
        Arrays.sort(arr2);

        System.out.println(Arrays.toString(arr));//  [-100, -4, 1, 4, 30, 60]
        System.out.println(Arrays.toString(arr2));// [-100, -4, 1, 4, 30, 60]

        System.out.println(Arrays.equals(arr,arr2));//we fixed with sort and know its true


















    }
}
