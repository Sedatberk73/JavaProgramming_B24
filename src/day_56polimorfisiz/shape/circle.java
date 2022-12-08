package day_56polimorfisiz.shape;

public class circle extends Shape {//this is concreate class

double radius;
    @Override
    public double area() {
        return Math.PI*radius*radius;
       // Math.PI*Math.pow(radius,2)
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }
}
