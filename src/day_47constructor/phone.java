package day_47constructor;

public class phone {
    String name;
    String brand;
    double version;
    int memory;
//this= is just referense to the instance of the class
    //this() : calling a constructor of that class
    public phone(String name){//even if we overloaded its can be different order
        this.name=name;
    }
    public phone(String name,String brand){
        this.name=name;
        this.brand=name;
    }

    public phone(String name,String brand,double version){
        this.name=name;
        this.brand=brand;
        this.version=version;



    }

    public phone(String name, String brand, double version, int memory) {
        this.name = name;
        this.brand = brand;
        this.version = version;
        this.memory = memory;
    }






}
