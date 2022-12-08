package day_49encapsulations;

public class UseCar {
    public static void main(String[] args) {
        Car car=new Car("toyota","23rt435",2005);

        System.out.println(car.driver);
        System.out.println(car.driver.licance);
        System.out.println(car.driver.age);

        Car car2=new Car("Adam","23rewders",3456);
        System.out.println(car2);
        System.out.println(car.driver);



    }



}
