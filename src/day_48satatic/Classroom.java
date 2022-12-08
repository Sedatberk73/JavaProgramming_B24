package day_48satatic;

import java.util.Arrays;

public class Classroom {
    public static void main(String[] args) {
        System.out.println("batch: "+CydeoStudent.batchNumber);//its works
        CydeoStudent studentone=new CydeoStudent("james bond",23,4);

        System.out.println(studentone);//CydeoStudent{name='james bond', id=23, groupnumber=4}

        CydeoStudent studenttwo=new CydeoStudent("sherlock holmes",32,4);
        System.out.println(studenttwo);


        System.out.println(studentone.name+" and "+studenttwo.name+" have the fallowing instructors "+ Arrays.toString(CydeoStudent.instructors));

        //check how much cafee all cydeo strudents have
        System.out.println(CydeoStudent.myCoffee.amountLeft);

        studentone.myCoffee.drink(3);
        System.out.println(CydeoStudent.myCoffee.amountLeft);



    }
}
