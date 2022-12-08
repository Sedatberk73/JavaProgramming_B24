package day_38methods;

public class picture {
    public static void main(String[] args) {
        draw("sedat");
draw("secon one "," second drow we have two parameters");
draw("third parameters with number is ",4);


    }
    public  static void draw(String color){
        System.out.println("using color 1 "+color);//first methods

    }

    public static void draw(String color1,String color2){//name doesnt matter we have to change parameters for run we can add new parameters or ad fifferent paramters
        System.out.println("using 2 colors "+color1+color2);
    }
public static void draw(String color,int a){
    System.out.println("printing "+color+" and "+a);

}













}
