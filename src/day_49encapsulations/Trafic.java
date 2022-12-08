package day_49encapsulations;

public class Trafic {
    public static void main(String[] args) {
       TraficLight light=new TraficLight("red");

        System.out.println(light.getColor());//red
        light.setColor("blue");//its not can blue
        System.out.println(light.getColor());//red

        light.setColor("yellow");
        System.out.println(light.getColor());


        light.setColor("brown");
        System.out.println(light.getColor());//yellow


       // light.color="brown";

    }


}
