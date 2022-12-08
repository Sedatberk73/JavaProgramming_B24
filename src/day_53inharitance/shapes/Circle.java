package day_53inharitance.shapes;

public class Circle extends Shape{
double radius;
    public Circle(double radius){
        super("Circle");
        this.radius=radius;
    }

    @Override
    public double area() {
        return Math.PI*radius*radius;
    }

    @Override
    public double perineter() {
        return 2*Math.PI*radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", name='" + name + '\'' +
                '}';
    }
}
