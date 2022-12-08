package day_58eception.item;

public class Book extends Item{

    public Book(String name) {
        super(name);
    }

    @Override
    public void use() {
        System.out.println("Reading a book");

    }

}
