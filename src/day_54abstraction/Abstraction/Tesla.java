package day_54abstraction.Abstraction;

public class Tesla extends ElectricCar{

    @Override
    public void start() {
        System.out.println("use card to start");
    }

    public void charge(){
        System.out.println("plugged in  charging");
    }





}
