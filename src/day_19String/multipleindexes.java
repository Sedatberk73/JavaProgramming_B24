package day_19String;

public class multipleindexes {
    public static void main(String[] args) {

//           0123456789
String word="definition";
        System.out.println("first i post: "+word.indexOf('i'));//3
        System.out.println("last i post: "+word.lastIndexOf('i'));//7

        int seconihardcoded=word.indexOf('i',6);//reminder hangi sayidan sonra baslayacagimizi soyluyor burada index altidan sonra baslayacagimizi soyledik
        System.out.println(seconihardcoded);//burada 7 yazilacak cunku index altidan sonra baslayacigimizi soyledik
        seconihardcoded=word.indexOf('t',6);
        System.out.println(seconihardcoded);//altidan sonra t olmadigi icin alti yazilacak
        System.out.println(word.indexOf('n',3));//3 ten sonra gelen dordu aldi


        int firstpos=word.indexOf('i');//3
        int secondpos=word.indexOf('i',firstpos+1);//firstpostan 3 geldi arti bir de eklenince 4 ten baslayacak
        System.out.println(secondpos);//5


        int thirdspos=word.indexOf('i', secondpos+1);
        System.out.println("last position "+thirdspos);//7

        System.out.println("last position "+word.lastIndexOf('i',8));//skizden once baslayacak
        System.out.println("last position "+word.lastIndexOf('i',6));//bir oncekini aliyor

        String a="aaba";
        System.out.println(a.indexOf('a'));//2
        System.out.println(a.indexOf('a',a.indexOf('a')+1));//1 cunku arti bir ekledik ve a den sonraki a yi aldi
        System.out.println(a.indexOf('a',a.indexOf('a')+2));//iki b ye denk geldi ikiden sonraki a 3 te ve ucu run etti






















    }
}
