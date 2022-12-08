package day_48satatic;

public class BestBuyStorge {
    public static void main(String[] args) {
        BestBuy storeone=new BestBuy("main Street","tuesday");

        BestBuy storetwo=new BestBuy("oak drive","tuesday");

        System.out.println(storeone.location);
        System.out.println(storetwo.location);
        System.out.println(BestBuy.day);//
        System.out.println(storeone.day);//its static we can use for object value too
        System.out.println(storetwo.day);//
        //System.out.println(BestBuy.location); we can use like that location not static its intance

        BestBuy.day="Monday";
        System.out.println(BestBuy.day);////monday
        System.out.println(storeone.day);//monday
        System.out.println(storetwo.day);//monday


        storeone.day="wednesday";//it is not best way but its works
        System.out.println(BestBuy.day);////wednesday"
        System.out.println(storeone.day);//wednesday"
        System.out.println(storetwo.day);//wednesday"

    }


}
