package day_47constructor;

import java.util.*;

public class Item {
   private String name;
    int quantity;
    double unitPrize;
double totalprice;

    public Item(String name, int quantity, double unitPrize) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrize = unitPrize;
       // this.totalprice=unitPrize*quantity;
       calculate();
    }
    public Item(String name){
        this.name=name;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", quantity=" + quantity +
                ", unitPrize=" + unitPrize +
                ", totalprice=" + totalprice +
                '}';
    }
    public void calculate(){

        totalprice=quantity*unitPrize;

    }


    public static void main(String[] args) {
        Scanner san=new Scanner(System.in);
       Item item=new Item("wolfstreet",5,4);
Item name=new Item("sedat");

        System.out.println(name);//Item{name='sedat', quantity=0, unitPrize=0.0, totalprice=0.0}
        System.out.println(item);
        item.quantity+=5;//if we add we should call calculate again
        item.calculate();//we change quantitiy so have te call again
        System.out.println(item);
        String keepgoin="yes";
        ArrayList<Item> list=new ArrayList<>();//item is objecj for

        while (keepgoin.equals("yes")){
            System.out.println("what is the item name");
            String names=san.nextLine();
            System.out.println("what is the item quantitiy");
            int quan=san.nextInt();

            System.out.println("what is the price");
            double price=san.nextDouble();

            Item item1=new Item(names,quan,price);
            list.add(item1);

            System.out.println("do you wanna add more");
            san.nextLine();
            keepgoin=san.nextLine();

        }
        System.out.println(list);






    }





}
