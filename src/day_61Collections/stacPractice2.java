package day_61Collections;

import java.util.Stack;

public class stacPractice2 {
    public static void main(String[] args) {

        Stack<Integer> stack=new Stack<>();
        stack.push(10);
        stack.add(20);
        stack.add(100);
        stack.add(80);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.get(2));
        //stack.push(2,3) //cannot be inside of element but add can be anywhere
        stack.add(2,3);
        System.out.println(stack);
        System.out.println(stack.add(4));//true collection return boolean
        System.out.println(stack.push(8));//print 8









    }
}
