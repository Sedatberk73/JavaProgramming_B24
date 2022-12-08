package day_46constructor;

public class Offer {
   private String location;
    String compony;
    double salary;
    boolean isFullTime;
    int numberOfPTo;

    public Offer(String location, String compony, double salary, boolean isFullTime, int numberOfPTo) {
        this.location = location;
        this.compony = compony;
        this.salary = salary;
        this.isFullTime = isFullTime;
        this.numberOfPTo = numberOfPTo;

    }
    public Offer(String location,String compony){
        this.compony=compony;
        this.location=location;
    }





    @Override
    public String toString() {
        return "Offer{" +
                "location=" + location + " " +
                ", compony='" + compony + '\'' +
                ", salary=" + salary +
                ", isFullTime=" + isFullTime +
                ", numberOfPTo=" + numberOfPTo +
                '}';
    }

    public static void main(String[] args) {
        Offer offer=new Offer("2222","berkolojy",4555,true,23);
        System.out.println(offer);

        Offer off=new Offer("3322","43345");
        System.out.println(off);


    }





}
