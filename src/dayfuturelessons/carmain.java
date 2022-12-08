package dayfuturelessons;

public class carmain {
    public static void main(String[] args) {
        car car1=new car();



        car1.setColor("dark blue");
       car1.setModel("dark blue");
       car1.setEngine(2.4);
       car1.setDoor(4);
//set deger verip get deger aliyoruz







        System.out.println("car color="+car1.getColor());
        System.out.println("car model="+car1.getModel());
        System.out.println("CAR engine="+car1.getEngine());
        System.out.println("car door="+car1.getDoor());
        car1.start();
        car1.stop();








    }
}
