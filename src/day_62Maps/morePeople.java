package day_62Maps;

import java.util.HashMap;

public class morePeople {
    public static void main(String[] args) {

        HashMap<Integer,Person> people=new HashMap<>();

        people.put(10,new Person("james"));
        System.out.println(people);

        Person person2=new Person("Elmira");
        person2.age=21;
        person2.favoriteHobby="java";

        people.put(11,person2);
        System.out.println(people);

        people.get(10).age=32;
        people.get(10).favoriteHobby="watch movie";
        System.out.println(people.get(10).age);


    }
}
