package day05_veriables;

public class CellPhone {
    public static void main(String[] args) {
        String color="spacegray";
        String brand="iphone";
        String model= "11pro";
        int price=1100;
       int storage=2;
        boolean hescamera=true;


//i way:
        System.out.println("my phone is a "+brand+". phone model is "+ model+" the color is "+color+
                ". my ohone price $"+price+". also phone storage is "+storage+"gb"+"."+"has a camera? "+hescamera);

        System.out.println(brand+model);//concatenation[]
        System.out.println();
//two way:
        String info="my phone is a "+brand+".\n\t phone model is "+ model+" \n\t the color is "+color+
                ". \n\t my ohone price $"+price+". \n\t also phone storage is "+storage+"gb"+"."+"\n has a camera? "+hescamera;

        System.out.println(info);



    }
}
