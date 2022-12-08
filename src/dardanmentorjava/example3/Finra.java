package dardanmentorjava.example3;

public class Finra extends FinraAbstrac{
/*
1. Numbers -- FINRA
Write a method which prints out the numbers from 1 to 30 but for numbers which are a multiple of 3, print "FIN" instead of the number and for numbers which are a multiple of 5, print "RA" instead of the number. for numbers which are a multiple of both 3 and 5, print "FINRA" instead of the numbe
 */

    @Override
    public String foundFinra(int a, int b) {
        String result="";
        for (int i=a;i<=b;i++){
            if (i%3==0&&i%5!=0){
                result+="Fin ";
            }else if (i%5==0&&i%3!=0){
                result+="ra ";
            }else if (i%15==0){
                result+="FINRA ";
            }else {
                result+=i+" ";
            }

        }
        return result;
    }







}
class founfinra{
    public static void main(String[] args) {
        Finra fin=new Finra();

        System.out.println(fin.foundFinra(1,30));

    }


}