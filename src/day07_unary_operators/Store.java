package day07_unary_operators;

public class Store {
    public static void main(String[] args) {
        String storeName="target";
        int numberOfTvs=100;

        System.out.println("person came into the store bought a tv");
        System.out.println("number of tvs now: "+--numberOfTvs);

        System.out.println("another person came into the store bought a tv");
        System.out.println("number of tvs now: "+--numberOfTvs);


        System.out.println("person cames into the store and put a tv into the cart");
        System.out.println("number of tv in the store is still: "+ numberOfTvs--);
        System.out.println("they buy everything and leave "+numberOfTvs);

//numberoftv++==[same] numberoftvs=numberoftv+1;

        System.out.println("Shipmen of tv comes");
        numberOfTvs=numberOfTvs+53;//reassignent
        System.out.println("samone with big bucks comes in and buy 5tvs");
        numberOfTvs=numberOfTvs-5;
        System.out.println();




    }
}
