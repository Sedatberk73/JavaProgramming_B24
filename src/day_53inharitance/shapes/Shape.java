package day_53inharitance.shapes;

public class Shape {

    String name;

    public Shape(String name) {
        this.name = name;
    }

    public double area(){
        System.out.println("Generic Shape");
        return 0.0;
    }

    public double perineter(){
        System.out.println("Generic perimeter");
        return 0.0;
    }

}
