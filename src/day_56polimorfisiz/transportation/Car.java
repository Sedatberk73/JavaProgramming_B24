package day_56polimorfisiz.transportation;

public class Car extends Transportation{

    @Override
    public void go() {
        System.out.println("Car is driving");

    }

    public  void opneTrunk(){
        System.out.println("Opening the car Trunk");
    }


    public void windowopening(){
        System.out.println("windows opening for car");
    }

}
