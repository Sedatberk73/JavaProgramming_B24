package day_56polimorfisiz.shape;

public class sphere extends Shape implements hasvalume,mavi{
    double radius;
    @Override
    public double area() {
        return Math.PI*4*Math.pow(radius,2);
    }

    @Override
    public double perimeter() {
        return 2*Math.PI*radius;
    }

    @Override
    public double valume() {
        return (4/3)*Math.PI*4*Math.pow(radius,3);//math.pi*radius*radius*radius
    }


    @Override
    public void speak() {

    }
}
