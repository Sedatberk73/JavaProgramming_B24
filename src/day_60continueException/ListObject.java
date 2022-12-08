package day_60continueException;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObject {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("c");
        list.add("b");
        list.add("a");
        list.add("c");
        list.add(null);


        System.out.println(list);
        System.out.println(list.get(2));

        List<String> linked=new LinkedList<>();
        linked.add("4");
        linked.add("b");
        linked.add("1");
        linked.add("c");
        linked.add(null);
        System.out.println(linked.get(2));
        ((LinkedList) linked).addFirst(2);


        System.out.println(linked);

        List<String> vector=new Vector<>();
        vector.add("a");
        vector.add("b");
        vector.add("c");
        vector.add("c");
        System.out.println(vector);
        vector.remove("c");
        vector.add(null);
        System.out.println(vector);




    }
}
