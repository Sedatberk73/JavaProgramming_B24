package day_53inharitance.shapes;

public class UseShape {
    public static void main(String[] args) {
        Shape shape=new Shape("shape");
        System.out.println(shape.name);
        System.out.println(shape.area());
        System.out.println(shape.perineter());


        square sq=new square(2.3);

        System.out.println(sq.name);
        System.out.println(sq.area());
        System.out.println(sq.perineter());


        Circle circle=new Circle(3.2);
        System.out.println(circle.name);
        System.out.println(circle.area());
        System.out.println(circle.perineter());




    }

}
