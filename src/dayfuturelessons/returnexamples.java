package dayfuturelessons;

public class returnexamples {
    public static int adding(int a){
        return a+3;//en son 8+3=11 buradan 11olarak maine geri dondu.
    }
    public static int subtracting(int a){
        return a-7; //sonra 15-7=8
    }
    public static int multiple(int a){
return a*5; //sonra burasi 3*5=15
    }
    public static int division(int a){
    return a/2;//daha sonra buraya geldi 6/2=3
    }
    public static int remain(int a){
        return a%7;//ilk once buraya geldi 13%7=6
    }

    public static void main(String[] args) {
        System.out.println("result= "+adding(subtracting(multiple(division(remain(13))))));
        //ic ice butun fonsiyonlari uyguladik daha sonra sirasiyla butun fonsiyonlara a degeri gidip oradki islemi yapip geri gelecek
        //gelecek olan a ilk once kalana sonra bolmeye sonra carpmaya sonra cikarmaya en sonda da toplamaya gidip islemi yapip geri donecek
        //bu sistemde void yerine int kullandik cunku void deger dondurmuyor hangi degeri dondurmek istedigimizde o dongunun
        // object(String) veya primitivini (boolean,int,char..) void yerine kullanip sonra yapacagimiz fonksiyonun degerini
        // deger ile beraber ex: adding(int a) yazip sonrada fonksiyonun icine return a+/%/*(vermek istedigimiz islem)...; yazip
        // main fonksiyona yollaniyor en sonda main a yi hangi degerde gostermek isterse onu yazip isleniyor.
    }









}
