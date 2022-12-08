package day_62Maps;



import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class Store {
    public static void main(String[] args) {

//  must be     key,    value
        HashMap<String,Double> inventory=new HashMap<>();

        inventory.put("water",2.3);
        inventory.put("soda",2.5);
        inventory.put("fruits",3.2);
        inventory.put("water",3.4);//reassigment  value
        inventory.put("bread",0.99);

        System.out.println(inventory);


        Scanner scan=new Scanner(System.in);
        System.out.println("what do you want to buy?");
        String item=scan.next();
        while (!inventory.containsKey(item)) {
            System.out.println(item+" not inside stock please try again");
            item = scan.next();
            if (inventory.containsKey(item)) {
                System.out.println("that item is in the stock");
                System.out.println(item + " costs: " + inventory.get(item));
            }
        }

        HashMap<String,Double> inventory2=new LinkedHashMap<>();
        inventory.put("mon",4.5);
        inventory.size();





    }


}
