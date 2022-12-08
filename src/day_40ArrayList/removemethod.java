package day_40ArrayList;

import java.util.ArrayList;

public class removemethod {
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<>();

        list.add("water");
        list.add("sun");
        list.add("wind");
        list.add("wood");
        System.out.println(list);

        list.remove(0);//remove the first element
        System.out.println("list = " + list);//[water, sun, wind, wood]
        list.remove(list.size()-1);//list = [sun, wind, wood]
        System.out.println("list = " + list);//list = [sun, wind]
        list.remove(0);
        System.out.println("list = " + list);//list = [wind]

        ArrayList<Integer> nums=new ArrayList<>();

        nums.add(50);
        nums.add(70);
        nums.add(80);
        System.out.println("nums = " + nums);//nums = [50, 70, 80]

       // nums.remove(1);//index numaralarina bakiyor
        int n=nums.remove(1);//we convert primitive type also array remove index 1 when we use remove store change
        System.out.println("nums = " + nums);//nums = [50, 80]

        System.out.println(nums.remove(1));//80












    }
}
