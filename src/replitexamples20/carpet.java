package replitexamples20;
public class carpet {
    double width;
    double length;
    double unitprice;
    boolean ispersian;
    double totalprice;

    public carpet(double width,double length,double unitprice,boolean ispersian){
        this.width=width;
        this.length=length;
        this.unitprice=unitprice;
        this.ispersian=ispersian;
        colculate(width, length, unitprice, ispersian);

    }

    public void colculate(double width,double length,double unitprice,boolean ispersian){
        if (ispersian) {
            totalprice=(width+length)*unitprice+200;

        }else{
            totalprice=(width+length)*unitprice;
        }
    }
}
