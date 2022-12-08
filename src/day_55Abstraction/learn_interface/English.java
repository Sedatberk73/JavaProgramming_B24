package day_55Abstraction.learn_interface;

public class English implements Language {//for interface we have to write implements its allows to go interface class


    @Override
    public void hi() {
        System.out.println("hello");
    }

    @Override
    public void bye() {
        System.out.println("good bye");
    }
}
