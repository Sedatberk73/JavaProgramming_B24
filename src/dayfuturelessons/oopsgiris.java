package dayfuturelessons;

public class oopsgiris {
    //nesne yonelimli programlama
    public static void main(String[] args) {
        oops1class car=new oops1class();//burada yapilan sey obur clastan referans saglandi ki bu tsarafta kullanabilsin;
//car aslinda obur siniftan gelen verilerin kullanilmasi icin uretilen yeni veridir

        car.color="silver";
        car.model="renault";
        car.engine=1.4;
        car.doors=4;


        System.out.println("car color: "+car.color);
        System.out.println("car model: "+car.model);
        System.out.println("car motor: "+car.engine);
        System.out.println("car total doors: "+car.doors);

/* ilk once iki sinif yapildi her zaman main sinifi olamali  daha sonra yapilan obur sinif main sinifta tanitildi( opps1class car =new oops1class())
main olmayan obur  clasta public degerleri verilip tanitildi (public int a_)
sonra bu degerler burada yani main clasinda yeni bir dger(car) ile main clasinda verileri yukletilip main calasinda
run edildi

 */






    }

}
