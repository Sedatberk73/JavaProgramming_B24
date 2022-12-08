package day_50inharitance;

public class airpor {
    public static void main(String[] args) {

       FlightTigket tigket=new FlightTigket("first","newyork","florida");
        System.out.println(tigket.getType());
       // we can acess directly
        //tigket.type();
        //...
        tigket.setType("busines");
        System.out.println(tigket.getType());
        System.out.println(tigket.getArrivalLocation());
        System.out.println(tigket.getDepartureLocation());












    }

}
