package day_19String;

public class substringexample {
    public static void main(String[] args) {
            //    012345678
        String s="javascript";
        System.out.println(s.substring(1));//ilk  karakteri kesecek=avascript
        System.out.println(s.substring(2));
        System.out.println(s.substring(4));//ilk dort kismini kesiyor==script
        System.out.println(s.substring(0,4));//java bastan sifir kesecek  ve sonraki dorten sonrasini kesecek
        System.out.println(s.substring(2,6)); //altinci harf olan r yi kesecek ve ondan sonrasini komple kesecek sadece iki ile alti arasinda olan harfler okunulanack
        System.out.println(s.substring(0,2));
//ikinci rakami verdigimizde o rakama karsi gelen harfi kesecek ondan oncekileri okuyacak





    }
}
