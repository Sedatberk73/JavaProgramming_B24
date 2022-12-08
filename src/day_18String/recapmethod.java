package day_18String;

public class recapmethod {
    public static void main(String[] args) {
        String day="thursDAY";

        boolean b=day.equals("Thursday");
        System.out.println(b);


        System.out.println(day.equalsIgnoreCase("Thursday"));//sadece toplam karaktere bakiyor buyuk kucuk olmalari onemli degil bosluk bir karakterdir

        day =day.toUpperCase();//
        System.out.println(day);//


        System.out.println(day.toLowerCase());//gettin lower but system not gana change
        System.out.println(day);//THURSDAY not changed

        System.out.println(day.length());//space and character total int
        System.out.println(day.length()+2);//if we add number its gana get adding =8+2=10



        day=day.length()+"sed"; //concatenation
        System.out.println(day+2);//1sed2

        day=day.length()+""; //concatenation
        System.out.println(day+2);//82

       int  sed=day.length();
        System.out.println(sed);//1 just int value =8 is be one charactr

        day=day+"    helloo    world     ";
       System.out.println(day.trim()); //its should be "4    hello    world" bastaki ve sondaki spacesleri aldi

        //trimp remove spaces from the begining and of the string
        //String s="    hello    world    "
        //the trimp method remove all the spaces so  s="hello    world"//sadece bastakileri ve sondakileri siliyor

        String s="    hello    world     ";
        System.out.println(s.trim());//hello  world
        System.out.println(s.trim().substring(2).length());//12
        System.out.println(s.trim().toUpperCase().substring(1));//ELLO   WORLD
        System.out.println(s.substring(2).toLowerCase().trim());//hello  world
        System.out.println(s.isEmpty());//false

        String a  ="javascrip";
        System.out.println(a.startsWith("java"));//true hangi kelimelerle basladigini gosteriyor
        System.out.println(a.startsWith("JAVA"));//false

        a=" "+a;
        System.out.println(a.startsWith("j"));//false because stars with " j" it has a space
        System.out.println(a.startsWith(" javascrip"));//true
        System.out.println(a.startsWith(" j"));//true
        System.out.println(a.endsWith("rip"));//true its end with rip
        System.out.println(a.endsWith("rip "));//false there is a space












    }



}
