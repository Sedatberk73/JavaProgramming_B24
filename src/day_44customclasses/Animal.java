package day_44customclasses;

public class Animal {//if we use static its not ganna use anyhwere
    String species;
    String size;
    int NumberOfLegs;
    boolean canFly;
    double weight;
    double lifespan;
    //no static means these are instance methods
    public  void eat(){
        System.out.println(species+"is eating");

    }
public  void sleeping(){
    System.out.println("this "+size+" animal is sleeping");
}
    public  void CanFly(){
        System.out.println("this "+size+" animal is sleeping");
    }

}
