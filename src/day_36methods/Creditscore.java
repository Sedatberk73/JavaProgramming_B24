package day_36methods;

public class Creditscore {
    public static int getcreditscore(){
        return 700;//eger void degilse yukarda hangi veri tipi varsa onlari returne gore
        // ayarlamamiz gerekiyor ornegin int ise int deger vermemiz gerkeit
    }

    public static void main(String[] args) {

        getcreditscore();//there is not ganna run

        System.out.println(getcreditscore());
int score=getcreditscore();
        System.out.println(score);//we gave ney value

        hasgoodcreditScore(900);//its not ganna run
        System.out.println(hasgoodcreditScore(860));//true

        if (hasgoodcreditScore(800)){
            System.out.println("you have good credit score");//false
        }else {
            System.out.println("you have bad score");//false
            //boolean sinifina bakarak islem yaparak sonra gelen deger nurada if else suzgecinden gecerek isleme aliniyor
        }



    }
public static boolean hasgoodcreditScore(int score){
        if (score>750){
            return true;
        }else {
            return false;
        }


}









}
