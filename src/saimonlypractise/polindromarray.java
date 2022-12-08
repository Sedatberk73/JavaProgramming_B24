package saimonlypractise;

import java.util.Arrays;

public class polindromarray {
    public static void main(String[] args) {

        /*
        Input: [“java”, “longer word”, “civic” “apple”,  “racecar”, “mom”, “anna”]
         */

       String[] arr={"java", "longer word", "civic" ,"apple",  "racecar", "mom", "anna"};




      String [] reverse =new String[arr.length];

    for (int i=0;i<reverse.length;i++){

        for(int y=arr.length-1;y>=0;y--){
            reverse[i]=arr[y];


        }


    }

        System.out.println(Arrays.toString(reverse));













    }
}
