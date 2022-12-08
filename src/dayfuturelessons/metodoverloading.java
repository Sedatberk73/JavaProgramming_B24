package dayfuturelessons;

public class metodoverloading {
   /* public static void adding(int a,int b,int c){
        System.out.println("result="+(a+b+c));

    }
    public static void adding(int a,int b){
        System.out.println("result="+(a+b));
    }
    public  static void adding(int a,int b,int c, int d){
        System.out.println("result="+(a+b+c+d));
    }


    public static void main(String[] args) {
        adding(1,2,3);
        adding(2,3);
        adding(1,2,3,4);
        //the overloading bir fonksiyonun birden fazla parametrelerle calismasi ve asiri yuklenmesi durumudur
        // .

    }*/
public static void total(String name,int score){
    System.out.println(name+"  named of player score is : "+score);

}public static void total(String name){
        System.out.println(name+" named of player score is : 0");

    }
    public static void total(int score){
        System.out.println("nameless of player score is : "+score);

    }

    public static void main(String[] args) {
        total("sedat",1000);//
        total("sedat");
        total(500);
    }//burada yapilan islem ayni fonksionda farkli islemler yapip tekrar kullanik burada ayni fonksiyona once iki deger verdik
    // sonra tek deger verdik daha sonra baska bir deger verdik verilen degerler mutlaka main de belirtmelidir ki yazilabilsin..













}
