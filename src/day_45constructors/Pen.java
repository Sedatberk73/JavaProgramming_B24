package day_45constructors;

public class Pen extends Item{
    String color;//default value
    public Pen(String str){
        super(12);//no return type
        System.out.println("made Pen object");//made Pen object
        System.out.println("he str make this pen color "+str);
        color=str;


    }


    public static void main(String[] args) {
        Pen pen=new Pen("blue");//calling constructor
        new Pen("yellow");//calling again and its running
        new Pen("greeen");

    }
    public double fer(){
        return super.getPrice()*2;
    }

}
