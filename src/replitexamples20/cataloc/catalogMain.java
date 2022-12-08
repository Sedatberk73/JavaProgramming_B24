package replitexamples20.cataloc;
import java.util.*;
public  class  catalogMain {
    String aysim;
    public catalogMain(String aysim){
        this.aysim=aysim;

    }


    Catalog ctls = new Catalog("serd");



    public static void main(String[] args) {
        Catalog ctl = new Catalog();
        ctl.loadItems();
        ctl.loadPrices();
        ctl.loadMonthlyPayments();


        System.out.println(ctl.items.toString());
        System.out.println(ctl.prices.toString());
        System.out.println(ctl.monthlyPayments.toString());

        Catalog ctl2 = new Catalog();

        System.out.println(ctl2.getWholeCatalog());
        ctl2.loadWholeCatalog();
    }

}
