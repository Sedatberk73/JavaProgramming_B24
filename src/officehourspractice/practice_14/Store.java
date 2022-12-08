package officehourspractice.practice_14;

public class Store {

    public static void main(String[] args) {
        //All posible reference of a tshir object
        Tshirt tshirt=new Tshirt();

        Clothes shirt=new Tshirt();
        shirt.wear();

        Object shirts=new Tshirt();
        shirt.wear();
        buy(shirt);
        buy(tshirt);
        Clothes jecket=new Jacket();
        ((Jacket)jecket).putOnHood();

        HasHood jacket3=new Jacket();
    }
    public static void buy(Clothes item){




    }


}
