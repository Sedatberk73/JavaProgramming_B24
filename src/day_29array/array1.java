package day_29array;

import java.util.Arrays;
import java.util.StringTokenizer;

public class array1 {

    public static void main(String[] args) {
       //
        String city1="san fransisco";
        String city2="berlin";





        String[] cities={"sanfransisco","tokyo","medison","amed","berlin"};

        System.out.println(cities[0]);//if we not put [] its not gana work
        for (int i=cities.length-1;i>=0;i--){
            System.out.println(cities[i]);//sondan yazmaya basladi

        }
        System.out.println("\n");
        for (int i=0;i<cities.length;i++){
            System.out.println(cities[i]);//o dan  yazmaya basladi

        }

        System.out.println("\n");
        System.out.println(Arrays.toString(cities));//{"sanfransisco","tokyo","medison","amed","berlin"}//if we wanna print whole array togetter we should print arrays class like this examp and we have to import arrays up//burada verilen ornekte array sinifini cagirarak butun arraylari beraber cagirdik
































    }
}
