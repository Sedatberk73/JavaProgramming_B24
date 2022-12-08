package day_41arraylist;

import java.util.ArrayList;

public class setmethods {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(900);
        System.out.println(nums);

        //how do you change a value/element
        nums.set(0,1000);//change a value of wrapper class-->remuve and add together
        System.out.println(nums);
         nums.set(3,-400);
        System.out.println(nums);//[1000, 200, 300, -400]
        System.out.println(nums.set(1,250));//200 just run index 1 but its doesnt change but it will change next time
        System.out.println(nums);//[1000, 250, 300, -400]
        System.out.println(nums.remove(0));//1000//not boolean
        System.out.println(nums.remove("250"));//gave boolean





    }
}
