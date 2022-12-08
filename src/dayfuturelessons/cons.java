package dayfuturelessons;

public class cons {
    private String books;
    private String type;
    private String author;
    private   int page;
    private   double price;

    public cons(String books,String type){//5:) en son tekrar overloading yapilarak veriler girildi iki veri girdigimizde kalan verilr default olur
        this.books=books;
        this.type=type;
        //burada sadece overloading metodu uygulanip sitemi tekrar yazdirdi kalan degerler default olarak yazilacaktir

    }

    public cons(){//4:) burada motoplari kisa yoldan yazip obur tarafa sadece sinifin adi yazilarak main metodunda daha kisa yazildi
      /* this.books="no information";
        this.author="no informations";
        this.type="no information";
        this.price=0;
        this.page=0;*/
        this("no information","no information","no information",0,0);
        //overloadingi daha kisa yolla yapilmistir amac en kisa yolu bulmaktir
    }

    public cons(String books,String type,String author,int page,double price){
        this.books=books;//2:) ikinci olarak daha kolay olamasi icin yeni class acilip showinfo clasina yonlendirildi
        this.author=author;
        this.type=type;
        this.page=page;
        this.price=price;//bu classi acarak setter metodlarini oteki tarafta yazmaktan kurtulduk
        //bunun yerine yazilan yeni fonksiyona deger veriliyor ex cons nos=new cons("sdddsd","sdfsfdsf",0,0) gibi
    }




    public String getBooks() {//1:) ilk getter setter metodlari islendi amac private olan sistemde main metoduna veri yollamak
        return books="selasmen";
    }

    public void setBooks(String books) {
        this.books = books;

    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void showinfo(){//3:) burada veriler daha kolay bir sekilde yazilip main classa yonlendirildi.
        System.out.println("i am start study to be developer also i star read a book for improve my language.");
        System.out.println("my first books is: "+this.books+". the author name is "+this.author+". ");
        System.out.println("books type is "+this.type+". books total page is "+this.page);
        System.out.println("the books prise is $"+this.price+" it s a good book for start\n i wish it will be continue to all my life...");
        System.out.println("------------------------------------------------------------------");
        System.out.println();//
        System.out.println();
        //burada fonksiyonu yeniden yeni bir fonksiyonla adlandirilip ana main clasinda daha kolay yazilmasini sagladik
        //oteki tarafa sadece shoinfo(); gidip butun fonksiyonu yazabilirirz.
    }







}
