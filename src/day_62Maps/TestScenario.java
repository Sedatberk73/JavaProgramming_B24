package day_62Maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TestScenario {
    public static void main(String[] args) {
        List<Map<String,String>> data=new ArrayList<>();

        data.add(helper("james","23",null));
        data.add(helper("jamie","32","il"));
        data.add(helper(null,null,null));
        data.add(helper(null,"30","TX"));
        System.out.println(data);


        //scenario: database shouldnt have null inputs

        for (Map<String,String> each:data){//iterate through the arraylist
            for (String values:each.values()){
                if (values==null){
                    System.out.println("Test Failed");
                }
            }


        }




    }

    public static Map<String,String> helper(String v1,String v2,String v3){
        Map<String,String> map=new HashMap<>();
        map.put("name",v1);
        map.put("age ",v2);
        map.put("state",v3);
        return  map;
    }




}
