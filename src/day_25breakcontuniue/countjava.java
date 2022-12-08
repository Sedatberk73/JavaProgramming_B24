package day_25breakcontuniue;

public class countjava {
    public static void main(String[] args) {
        String s="java is a java language[java] . can be used for alot javajavajava";
        int n=0;
//        for (int i=0;i<s.length();i++){
//
//            if (s.charAt(i)=='j'&&s.charAt(i+1)=='a'&&s.charAt(i+2)=='v'&&s.charAt(i+3)=='a'){
//              n++;
//            }
//        }
//        System.out.println(n);
String tr="jav";

        int java=0;
        for (int i=0;i<s.length()-tr.length()+1;i++){//uc tane eksiltmemiz lazim cunku 0 ile baslayan index var

            if (s.substring(i,i+tr.length()).equals(tr)){
                java++;
            }

        }
        System.out.println("java = " + java);



















    }
}
