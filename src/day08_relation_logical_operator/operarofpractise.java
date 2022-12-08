package day08_relation_logical_operator;

public class operarofpractise {
    public static void main(String[] args) {
/*
add new class GiftCard
add main method
gift card balance = 200
	item 1 price = 40
	item 2 price = 100
	calculate the remaining balance of gift card
Example output:

	The gift card started with a balance of $200 and after buying item 1
	 for $40 and item 2 for $100. The remaining balance of the gift card is $60
 */
int item1=40;
int item2=100;
int balance=200;

int remainingafterbaying=item2-item1;
        System.out.println("The gift card started with a balance of $"+balance+" and after buying item 1\n" +
                "\t for $"+item1+" and item 2 for $"+item2+". The remaining balance of the gift card is $"+remainingafterbaying);
        System.out.println(200%60);



    }

}
