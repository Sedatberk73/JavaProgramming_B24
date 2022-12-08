package day_62Maps;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class multiplearraylistMap {
    public static void main(String[] args) {
        ArrayList<String> usa=new ArrayList<>(Arrays.asList("dallas","new york","miami","lasvegas","seattle"));
        ArrayList<String> europe=new ArrayList<>(Arrays.asList("Berling","barcelona","napoli","helsinki","madrit"));
        ArrayList<String> asia=new ArrayList<>(Arrays.asList("tokyo","seoul","pejin","hong kong","nagazaki"));

        HashMap<String,ArrayList<String>> allcountries=new HashMap();

        allcountries.put("usa",usa);
        allcountries.put("africa",new ArrayList<>(Arrays.asList("johannesburg","mabacci","kahire","beyrut")));
        allcountries.put("europe",europe);
        allcountries.put("asia",asia);
        allcountries.put("medditerianan ",new ArrayList<>(Arrays.asList("istanbul","hakkari","van")));
        System.out.println(allcountries.size());


        System.out.println(allcountries);

        for (String continent:allcountries.keySet()){
            System.out.println("city in "+continent+" are "+allcountries.get(continent));
        }


        for (String continent:allcountries.keySet()){
            System.out.println("city in "+continent);

            for (String city:allcountries.get(continent)){
                System.out.println(city.substring(0,1));
            }

        }






    }
}
