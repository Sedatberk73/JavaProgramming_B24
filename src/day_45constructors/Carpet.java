package day_45constructors;

public class Carpet {
    int  witdh;
    int length;
    double price;
    boolean ispersian;
    double totalprice;



    public Carpet(int wit, int leng, double pri, boolean persian) {
        this.witdh = wit;
        this.length = leng;
        this.price = pri;
        this.ispersian = persian;
        totalprice=witdh*length*price;
        if (persian){
            totalprice+=200;
        }


    }

    @Override
    public String toString() {
        return "Carpet{" +
                "witdh=" + witdh +
                ", length=" + length +
                ", price=" + price +
                ", ispersian=" + ispersian +
                ", totalprice=" + totalprice +
                '}';
    }
}
