package day_62Maps;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapClasses {
    public static void main(String[] args) {
        Map<Integer,String> map1=new HashMap<>();
        map1.put(2,"Two");
        map1.put(4,"four");
        map1.put(5,"five");
        map1.put(1,"one");
        map1.put(3,"three");
        System.out.println("hashmap"+map1);
        System.out.println();

        Map<Integer,String> map2=new LinkedHashMap<>();
        map2.put(2,"Two");
        map2.put(4,"four");
        map2.put(5,"five");
        map2.put(1,"one");
        map1.put(3,"three");
        System.out.println("linkhashmap"+map2);
        System.out.println();

        Map<Integer,String> map3=new TreeMap<>();
        map3.put(2,"Two");
        map3.put(4,"four");
        map3.put(5,"five");
        map3.put(1,"one");
        map3.put(3,"three");
        System.out.println("treemap"+map3);
        System.out.println();

        Map<String,String> map4=new HashMap<>();//allow null
        map4.put("two","Two");
        map4.put("four","four");
        map4.put("five","five");
        map4.put("one","one");
        map4.put("three","three");
        map4.put(null,"empty");
        System.out.println("hashmap"+map4);
        System.out.println();


        Map<String,String> map5=new TreeMap<>();//sorted guaranty
        map5.put("two","Two");
        map5.put("four","four");
        map5.put("five","five");
        map5.put("one","one");
        map5.put("three","three");
       // map5.put(null,"empty");
        System.out.println("threhhmap "+map5);
        System.out.println();

        Map<String,String> map6=new TreeMap<>();//sorted guaranty
        map6.put("two","Two");
        map6.put("four","four");
        map6.put("five","five");
        map6.put("one","one");
        map6.put("three","three");
    //    map6.put(null,"empty");
        System.out.println("linkhashmat "+map6);
        System.out.println();







    }
}
