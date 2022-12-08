package day_39_wrapper_calses;

import java.util.ArrayList;

public class AddtoArrayList {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
numbers.add(50);//add will put the element to the end
        System.out.println("numbers = " + numbers);//no need to Arrays.toString
        numbers.add(-100);
        numbers.add(200);
        System.out.println("numbers = " + numbers);//numbers = [50, -100, 200] aoutoboxing
        numbers.remove(1);//
        System.out.println("numbers = " + numbers);

        System.out.println(numbers.add(400));//add method also return boolean
        System.out.println(numbers);

        //reading first element from to array arr[0]
        System.out.println("first element "+numbers.get(0));//first element 50//found element index and run element
        System.out.println("numbers length="+numbers.size());
        System.out.println("lastindex "+numbers.get(numbers.size()-1));////lastindex 400








    }
}
