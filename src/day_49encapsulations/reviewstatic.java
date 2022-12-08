package day_49encapsulations;

public class reviewstatic {
    public static void main(String[] args) {
        System.out.println("A");

        method1();
        new reviewstatic();
    }
    public reviewstatic(){//this just constructor we need to cal than its ganna print
        System.out.println("B");

    }

    static {
        System.out.println("C");//this is gana first  run than A
    }

    public static void method1(){
        System.out.println("D");
    }






}
