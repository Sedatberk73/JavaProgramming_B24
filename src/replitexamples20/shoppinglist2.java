package replitexamples20;
import java.util.Scanner;
public class shoppinglist2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String shoppingListReport = "";
        String item = "";
        String countinue = "";
        double price = 0;
        int count = 1;
        double totalPrice = 0;
        System.out.println("Enter Item"+ count +" and its price:");
        item=scan.nextLine();
        price=scan.nextInt();
        shoppingListReport+= "Item"+count+": "+item +" Price: "+price+" ";
        totalPrice+=price;
        scan.nextLine();

        System.out.println("Add one more item?");
        countinue= scan.nextLine();

        while (countinue.equals("yes")) {
            System.out.println("Enter Item"+ ++count +" and its price:");
            item=scan.nextLine();
            price=scan.nextInt();
            scan.nextLine();

            System.out.println("Add one more item?");
            countinue= scan.nextLine();


            shoppingListReport+= "Item"+count+": "+item +" Price: "+price+" ";
            totalPrice+=price;
        }


        System.out.println(shoppingListReport);
        System.out.println("totalPrice: "+totalPrice);







/*
output:
input: Tomatoes
input: 5.5
output:
input: yes
output: Enter Item2 and its price:
input: Cheese
input: 3.5
output: Add one more item?
input: yes
output: Enter Item3 and its price:
input: Apples
input: 6.3
output: Add one more item?
input: no
output: Item1: Tomatoes Price: 5.5, Item2: Cheese Price: 3.5, Item3: Apples Price: 6.3
output: Total price: 15.3
 */








    }
}
