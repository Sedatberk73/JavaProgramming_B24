package day_60continueException.Bank;

import java.util.*;

public class Convert {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>(Arrays.asList(1,2,3,4,5,4,3,2,1));
        System.out.println(numbers);

        //remove all duplicate value
        Set<Integer> unique=new HashSet<>(numbers);
        System.out.println(unique);
        Set<String> obj=new HashSet<>();//hasset its not dublicate only one times run

        obj.add(null);
        obj.add("hello");
        obj.add("$4");
        obj.add("100");
        obj.add("%");
        obj.add("hello");
        System.out.println("original: "+obj);

        System.out.println("new "+new ArrayList<>(obj));
        System.out.println("again hasset "+new HashSet<>(obj));

        Set<String> obj2=new LinkedHashSet<>();
        //obj2.add(null); //its not gqanaa work because of treaSet
        obj2.add("hello");
        obj2.add("$4");
        obj2.add("100");
        obj2.add("%");

        obj2.add("hello");
        System.out.println("hasset: "+obj);
        System.out.println("Lunkhessed: "+obj2);

        Set<String> obj4=new TreeSet<>(obj2);
        System.out.println(obj4);
        Set<String> obj3=new TreeSet<>();// not sorting
      //  obj3.add(null);
        obj3.add("hello");
        obj3.add("$4");
        obj3.add("100");
        obj3.add("*");
        obj3.add("%");
        obj3.add("hello");
        System.out.println("treaset: "+obj3);









    }
}
