package dayfuturelessons;

public class constractorfirst {
    public static void main(String[] args) {

        cons constr=new cons("you cant win a fight with your boss","soft skils","Tom Markert",146,12.5);
        cons constr1=new cons("you cant win a fight with your boss","soft","not sedat",0,0);
        //constr 2:))  setter metodlarini daha kolay yazilmasi icin uste yazildi
        //cinstr1 3:)) metod daha kis yolla yapildi ve overloading var



      constr.setBooks("you cant win a fight with your boss");//1:) ilk once privatten kurtulmak icin set metodlarina deger verildi
       /* constr.setAuthor("Tom Markert");
        constr.setType("soft skils");
        constr.setPage(149);
        constr.setPrice(12.5);*////bu sistemi yazmasak bile calisabilir cunku degerleri yukarda verdik

        //1:)) set metodlari burada get olarak yazilip run edildi
       /* System.out.println("i am start study to be developer also i star read a book for improve my language.");
        System.out.println("my first books is: "+constr.getBooks()+". the author name is "+constr.getAuthor()+". ");
        System.out.println("books type is "+constr.getType()+". books total page is "+constr.getPage());
        System.out.println("the books prise is $"+constr.getPrice()+" it s a good book for start\n i wish it will be continue to all my life...");
         yapilan bu islem constructurin getter setter metotdlari icin yapildi
           bu yontem ile fonksiyonlardan deger alinabilir oncellik setter sonra getter. yani gettiri sysout ta kullaniyoruz...*/


        constr.showinfo();//yukarda deger verilip fonksiyonu oteki taraftan daha kolay bicimde cagirdik
        constr1.showinfo();//fonksiyona yeni bir deger verilip tekrar cagirdik bu sefer girilen degerler degistirildi.

        cons constr2=new cons();//burada oteki taraftan overloading yapip yani yeniden adlandirilip
        constr2.showinfo();//sisteme yani degerlerden yeni veriler girildi.
//4:) constr2 yeni this fonksiyonu  degerlerle kisaltildi
        cons constr3=new cons("overloading metodu","sadece iki tane yazildi digerleri bosta olup default degerler alacak");
        constr3.showinfo();//5:) this fonksiyonunu kullanarak degerler kissa yoldan yazilip overloding yapildi girlmeyen degerler default oldu
























    }
}
