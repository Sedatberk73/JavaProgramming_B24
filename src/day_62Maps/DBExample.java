package day_62Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class DBExample {
    public static void main(String[] args) {

        HashMap<String,String> person1=new HashMap<>();
        person1.put("first name=","James");
        person1.put("LAST_NAME","Bond");
        person1.put("AGE ","40");


        HashMap<String,String> person2=new HashMap<>();
        person2.put("first name=","sedat");
        person2.put("LAST_NAME","berk");
        person2.put("AGE ","27");




        ArrayList<Map<String,String>> allPeople=new ArrayList<>();

        allPeople.add(person1);
        allPeople.add(person2);
        System.out.println(allPeople);



    }
}
