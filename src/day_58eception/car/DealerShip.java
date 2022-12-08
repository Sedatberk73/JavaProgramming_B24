package day_58eception.car;

import java.util.ArrayList;
import java.util.Arrays;

public class DealerShip {

    public static void main(String[] args) {
        ArrayList<Car> cars =new ArrayList<>();

        cars.add(new BMW());
        cars.add(new Ford());
        cars.add(new Model3());
        cars.add(new Tesla());//when we use 'new' its mean object

        BMW car5=new BMW();
        System.out.println();
        cars.add(car5);
        lease(car5);

        lease(new Model3());
        lease(new Ford());
        Ford ford=(Ford) getCar(3);
        System.out.println();

        System.out.println(getCar(2));



    }

    public static void lease(Car car){
        System.out.println("leasing car");

    }

    public static Car getCar(int option){
        if (option==1){
            return new BMW();
        }else if (option==2){
            return new Tesla();
        }else if (option==3){
            return new Ford();
        }else {
            return new Model3();
        }

    }



}
