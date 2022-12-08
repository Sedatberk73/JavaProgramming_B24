package day_50inharitance.examples1;

public class WashingMashine extends Machine{
    private String modelType="Top load washine mashine";

    public static void main(String[] args) {
        WashingMashine washingMashine=new WashingMashine();
        System.out.println(washingMashine.brand);
        washingMashine.wash();
        washingMashine.brand="apple";
        System.out.println(washingMashine.brand);
    }

}
