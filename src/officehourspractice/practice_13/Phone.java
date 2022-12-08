package officehourspractice.practice_13;

public abstract class Phone {

     String brand;
     String model;
     double price;
     int size;
    abstract void calling();
    abstract void  texting();

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size=" + size +
                '}';
    }









}
