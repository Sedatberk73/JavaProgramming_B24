package day_52inharitance.person;

import java.util.ArrayList;

public class Employe extends Person {
    String jobtitle;
    boolean isFullTime;

    public Employe(String name, int age, int birthyear, ArrayList<String> hobbies, String jobtitle, boolean isFullTime) {
        super(name, age, birthyear);
        this.jobtitle = jobtitle;
        this.isFullTime = isFullTime;
    }

    //work

    public void work(){
        System.out.println(name+" is working "+jobtitle);

    }


}
