package day_54abstraction.Person;

import java.util.Arrays;
import java.util.Collections;

public abstract class Person {
    String name;
    String age;

    public Person(String name, String age) {
        this.name = name;
        this.age = age;

    }

    public abstract void sleep();
}
