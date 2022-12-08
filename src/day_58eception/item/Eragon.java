package day_58eception.item;

public class Eragon extends Book {

    public Eragon(){
        super("Eragon");
    }


    @Override
    public void use() {
        System.out.println("reding Erogon");

    }
    public void tell(){
        System.out.println("eragon side");
    }

}
