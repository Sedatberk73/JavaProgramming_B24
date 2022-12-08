package day_61Collections;

import java.util.ArrayDeque;
import java.util.PriorityQueue;

public class queExample {

    public static void main(String[] args) {

        PriorityQueue<Integer> queue =new PriorityQueue<>();

        queue.add(2);
        queue.add(5);
        queue.add(8);
        queue.add(1);
        System.out.println(queue);
        System.out.println(queue.peek());//peakjust print last element
        System.out.println(queue.poll());//==pop()//remove the last element
        System.out.println(queue);

       // System.out.println(new PriorityQueue<>().remove());//couse exceptions
        System.out.println(new PriorityQueue<>().poll());//return null if no element has

        ArrayDeque<String> obj=new ArrayDeque<>();
        obj.offer("z");
        obj.offer("hello");
        obj.offer("chicken");
        System.out.println(obj);
        System.out.println(obj.peek());//its fist ona ganna print
        System.out.println(obj.poll());//z
        System.out.println(obj);//[hello, chicken]
       // obj.offer(null); cannot null
        System.out.println(obj);

        obj.add("ser");
        obj.offer("ber");
        obj.addFirst("water");
        System.out.println(obj);









    }
}
