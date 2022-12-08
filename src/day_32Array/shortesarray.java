package day_32Array;
import java.util.*;
public class shortesarray {
    public static void main(String[] args) {


        String str="sedat,berk,ve,gel";
        String[] strSplit = str.split(", ");

        String shortest = strSplit[0];
        String shortestList = "";

        for (String each : strSplit) {

            if (each.length() < shortest.length()) {
                shortest = each;
            }
        }

        for (String each : strSplit) {

            if (each.length() == shortest.length()) {
                shortestList += each + ",";
            }
        }
       // String [] spl2 = shortestList.split(",");
        //Arrays.sort(spl2);
       // System.out.println(Arrays.toString(spl2));

    }
}
