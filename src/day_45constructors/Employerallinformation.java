package day_45constructors;

import java.util.Arrays;

public class Employerallinformation {
    public static void main(String[] args) {

       Employee one= new Employee("sedat",12321,"driver",23.5);
        System.out.println(one);


        System.out.println(new Employee("dilan",3453,"student",4543));


        Employee[] staff=new Employee[3];
        staff[0]=one;
        staff[1]=new Employee("dilan",3453,"student",4543);


        System.out.println(Arrays.toString(staff));





    }
}
