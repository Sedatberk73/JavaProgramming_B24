package day_62Maps;

import java.util.HashMap;

public class MapPractice1 {
    public static void main(String[] args) {

        HashMap<Integer,String> hashMap=new HashMap<>();
        //      key&    value
        //map doesnt has add method, they dont inharit collaction interface
        hashMap.put(1,"sedat");
        hashMap.put(2,"berk");
        hashMap.put(3,"dilan");
        hashMap.put(4,"sedat");
        hashMap.put(5,"aslan");
        System.out.println(hashMap);
        //we can't duplicate key its uniqe but we can duplicate values if we want
        //how can you read from a map

        String name=hashMap.get(3);//key
        System.out.println(name);//values

        hashMap.put(1,"sed");//it can not add first element its reassigned first index value it cannot duplicate key
        System.out.println(hashMap);
//

        for (String continent: hashMap.values()){
            System.out.println(continent);
        }

        for (int cont: hashMap.keySet()){

        }




    }



}
