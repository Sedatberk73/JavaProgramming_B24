package day_53inharitance.shapes;

public class square extends Shape {
    double side;
    public square(double side){
        super("Square");//burada yapilan otomatikmen isim verdik
        this.side=side;
    }


    @Override
    public double area(){
        System.out.println("Generic square");
        return side*side;

    }

    @Override
    public double perineter(){
        System.out.println("Generic perimeter");
        return side*4;
    }

    @Override
    public String toString() {
        return "square{" +
                "name='" + name + '\'' +
                ", side=" + side +
                '}';
    }
}
