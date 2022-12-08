package day_33multidimentionalArray;

import java.util.Arrays;

public class urlsplit {
    public static void main(String[] args) {
        String url="http://learncybertekschool.com/courses///130";
      String[] arr=  url.split("/");
        System.out.println(Arrays.toString(arr));// [http:, , learncybertekschool.com, courses, 130]

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[, 130, courses, http:, learncybertekschool.com]

























    }
}
