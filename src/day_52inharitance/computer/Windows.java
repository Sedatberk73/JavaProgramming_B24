package day_52inharitance.computer;

import day_52inharitance.person.ChildOfPerson;

public class Windows extends computer{
    public Windows(String os, int memory) {
        super(os, memory);


    }
    public Windows(int memory) {
        super("Windows", memory);


    }

    @Override
    public String toString() {
        return "Windows{" +
                "os='" + os + '\'' +
                ", memory=" + memory +
                '}';
    }
}
class  labb{
    public static void main(String[] args) {
        Windows computerone=new Windows("windows",500);
        System.out.println(computerone.toString());

        Windows computer2=new Windows(1000);

        System.out.println(computer2.toString());

        ChildOfPerson student=new ChildOfPerson("sedat",23,1993);

        student.walk();
        student.study();



    }



}