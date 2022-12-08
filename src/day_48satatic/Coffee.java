package day_48satatic;

public class Coffee {
    String brand;
    double amountLeft;

    public Coffee(String brand, double amountLeft) {
        this.brand = brand;
        this.amountLeft = amountLeft;
    }

    public void drink(double amount){
        amountLeft-=amount;
    }









}
