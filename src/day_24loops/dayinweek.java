package day_24loops;

public class dayinweek {
    public static void main(String[] args) {
        String dayto="";
        for (int day=1;day<=7;day++){

            switch (day){
                case  1:
                   dayto="monday" ;
                   break;
                case 2: dayto="tuesday"; break;

                case 3: dayto="wendsday"; break;
                case 4: dayto="thursday"; break;
                case 5: dayto="friday"; break;
                case 6: dayto="saturday"; break;
                case 7: dayto="sunday"; break;
            }
            System.out.println(dayto);

        }














    }
}
