package day_50inharitance;

public class usinganimal {
    public static void main(String[] args) {
        animal an=new animal();
        an.age=10;

        dog dg=new dog();
        dg.age=10;
        dg.species="serder";


        Lion lion=new Lion();
        lion.age=23;//came to animal class
        lion.numberoflegs=4;

        System.out.println(lion.toString());


    }
}
