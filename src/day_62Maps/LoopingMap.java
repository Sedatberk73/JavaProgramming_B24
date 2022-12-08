package day_62Maps;

import java.util.HashMap;
import java.util.Map;

public class LoopingMap {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("one",1);
        map.put("two",2);
        map.put("three",3);

        System.out.println(map.keySet());//just key values

        for (String keys:map.keySet()){
            System.out.println("The key is "+keys);
            System.out.println("The values: "+map.get(keys));
            System.out.println();

            //we itarate throught the set of keys,and using the keys we are able to acces the value with get method

        }






    }




}
