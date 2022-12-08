package day_54abstraction.Abstraction;

public class Honda extends Car{

    @Override
    public void start() {//different implementation
        System.out.println("Push the button");
    }
}
