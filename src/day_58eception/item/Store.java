package day_58eception.item;

public class Store {
    public static void main(String[] args) {
       Eragon obj1= new Eragon();//Parent

       Book obj2=new Eragon();//Parent
       Item obj3=new Eragon();//Parent
        obj3.use();



//        Item obj4=new Book("barxo");
//        obj4.use();

        new Book("").use();


        obj1.tell();
        ((Eragon)obj2).tell();
        ((Eragon)obj3).tell();

        Eragon erognobj=(Eragon)obj3;

        erognobj.use();


        purchase(new Book("wooden spoon"));
        purchase(obj1);
        purchase(new Item("Harry potter"));

    }


    private static void purchase(Item harry_potter) {
        System.out.println("herry "+harry_potter.name);
    }


    public static void purchase(Book item){
        System.out.println("Purchasing "+item.name);

    }







}
