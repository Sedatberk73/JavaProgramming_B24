package day_52inharitance.person;

import java.util.ArrayList;

public class Person {
    String name;
    int age;
    int birthyear;
    ArrayList<String> hobbies;


    public Person(String name, int age, int birthyear) {
        this.name = name;
        this.age = age;
        this.birthyear = birthyear;
        this.hobbies = new ArrayList<>();

    }

    public void walk(){
        System.out.println(name+" is walking");


    }





}
