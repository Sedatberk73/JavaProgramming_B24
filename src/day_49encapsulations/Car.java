package day_49encapsulations;
//there is a one file two classes but only one can be public in class file
public class Car {
  Driver driver;//this just refrence car class nor object yetand it is instance veriable for car class
    String nameer;


    public Car(String name,String licennumber,int age){//we did object here
       driver =new Driver(name,licennumber,age);
    }



}







class Driver{
    //we can only one public on a file
    String name;
    String licance;
   int age;
   static {

   }

    public Driver(String name, String licance, int age) {
        this.name = name;
        this.licance = licance;
       this.age = age;
    }

    @Override
    public String toString() {
        return "Driver{" +
                "name='" + name + '\'' +
                ", licance='" + licance + '\'' +
                ", age=" + age +
                '}';
    }
}

