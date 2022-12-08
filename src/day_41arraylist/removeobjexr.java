package day_41arraylist;

import java.util.ArrayList;

public class removeobjexr {
    public static void main(String[] args) {
        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(900);
        System.out.println(nums);
        nums.remove("200");//its not gana work
        System.out.println(nums);

        Integer a=300;
        nums.remove(a);//its works
        nums.remove(Integer.valueOf(200));//itswork
        System.out.println(nums);

        nums.remove(new Integer(900));//its works
        System.out.println(nums);



    }
}
