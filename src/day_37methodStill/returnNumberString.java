package day_37methodStill;

public class returnNumberString {
    public static void main(String[] args) {
        System.out.println(convernumbertoword(9));
    }



    public  static String convernumbertoword(int num){
        String[] convert={"one","two","three","four","five","six","seven","eight","nine","ten"};


        return convert[num-1];

    }







}
