package day05_veriables;

public class CarDriverInfo {
    public static void main(String[] args) {
        String carModel="toyota";
        String Drivername="sedat";
        String Licencenumber="78JKL654";
        short speed=240;
        char licenseclass='a';
        boolean isautomatic=true;
        String info ="my car is a "+carModel+"\n\t car user name "+Drivername+"  car licence number is "+Licencenumber
                +"\n\t car speed is "+speed+" my driver clas is "+licenseclass+
                "\n\t has a automatic? "+isautomatic+" it has automatic driver";
        System.out.println("info = " + info);

    }
}
