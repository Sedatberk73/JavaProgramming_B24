package day07_unary_operators;

public class TicketPrice {
    public static void main(String[] args) {
        String city1="chicago";
        String city2="Virginia";
        double baseprise=110.50;
        double mileprice=1322.8;
        double dividingmiles=(mileprice/10)+baseprise;

        System.out.println("the ticket from "+city1+" to "+city2+" is $"+dividingmiles);



        float f=40;
        long l =10;
        double d=f*l;
        long s=(long) (f*l);
        System.out.println("d = \"" + d+"\"\t long "+s);



    }
}
