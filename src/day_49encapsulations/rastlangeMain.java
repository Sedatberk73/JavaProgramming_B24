package day_49encapsulations;

public class rastlangeMain {
    public static void main(String[] args) {
        Rectangle res=new Rectangle(-21,23);
        System.out.println(res.getHeight());
        res.setHeight(12);
        System.out.println(res.getHeight());
        res.setWidth(-2);
        System.out.println(res.getWidth());
        System.out.println(res.calculate());




    }

}
