package day_48satatic;

public class Iphone {
    String model,Color;
    double price;
    int storage;
    double totalprice;

    public static void main(String[] args) {
        Iphone iphone=new Iphone("iphine",12.2);
        System.out.println(iphone.toString());
        iphone.calculate();

    }

    static String brand,operatingsystem;

    public Iphone(String model, String color, double price, int storage) {
        this(model,price);
//       this.model = model;
        Color = color;
//        this.price = price;
        this.storage = storage;
        calculate();

    }

    public Iphone(String model,double price){
        this.model=model;
        this.price=price;
    }

    static {
        brand="Apple ";
        operatingsystem="IOS";
        System.out.println(brand+operatingsystem);//all the time its print first
    }

    public void calculate(){

        totalprice=storage*price;
       System.out.println(totalprice);
    }

    @Override
    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", Color='" + Color + '\'' +
                ", price=" + price +
                ", storage=" + storage +
                ", totalprice=" + totalprice +" colculate is "+
                '}';
    }
}
