package day_34methods;

public class getcharcters {
    public static void lettersZA(){
        char letter='Z';String s="";
        for (char t= 'A';t<='Z';t++){
            s+=""+t +",  ";
        }
        System.out.print(s.substring(0,s.length()-3));
        System.out.println();
    }
    public static void lettersAz(){
        char letter='A';String s="";

        for (char t= 'Z';t>='A';t--){
            s+=""+t +",  ";
        }
        System.out.print(s.substring(0,s.length()-3));
        System.out.println();
    }


    public static void lettersza(){
        char letter='z';String s="";
        for (char t= 'a';t<='z';t++){
            s+=""+t +",  ";
        }
        System.out.print(s.substring(0,s.length()-3));
        System.out.println();
    }
    public static void lettersaz(){
        char letter='a';
        String s="";
        for (char t= 'z';t>='a';t--){
            s+=""+t +",  ";
        }
        System.out.print(s.substring(0,s.length()-3));
        System.out.println();
    }
    public static void letters09(){
        char letter='9';
        String s="";
        for (char t= '0';t<='9';t++){
           s+=""+t +",  ";
        }
        System.out.print(s.substring(0,s.length()-3));
        System.out.println();
    }

    public static void all(){
        lettersZA();
        lettersAz();

        lettersaz();
        lettersza();
        letters09();
    }
























}
