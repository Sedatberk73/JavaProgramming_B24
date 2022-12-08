package day_20exampleofstring;

public class indexofpracrice {
    public static void main(String[] args) {
        String word="banana";
        int first=word.indexOf('a');
        int lasta=word.lastIndexOf('a');
        System.out.println("first = " + first);
        System.out.println("lasta = " + lasta);


        System.out.println(word.charAt(word.length()-1));//last charCTER FOUND
        System.out.println(word.charAt(word.length()-2));//
        //burada yapilan once girilen kelimenin uzunlugu bulundu bulunan uzunluktan kelimenin hangi harfini istenirse o haften uzunluk cikarildi sonra da chardan o uzunluk bulundu
        System.out.println(word.split(word));
        String charc= String.format("%s", word.charAt(word.length() / 2));
        System.out.println(charc);








    }
}
