package day_33multidimentionalArray;

import java.util.Arrays;

public class arrayCOpy {
    public static void main(String[] args) {
        //
        int [] c={20,30,40};
        int [] d= Arrays.copyOf(c,3);//3 toplam uc elementi kastediyor index degil
        System.out.println(Arrays.toString(c));
        System.out.println(Arrays.toString(d));

        c[0]=200;//bu sefer sade sifirnci indexi degistirdik
        System.out.println(Arrays.toString(c));// [200, 30, 40]
        System.out.println(Arrays.toString(d));//[20, 30, 40]

        System.out.println();
        int [] a={20,30,40};
        int [] b =a;
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.toString(b));
        b[0]=100;//bu sefr esitledigimiz icin her ikisidi degisicek//eger sadece birisinin degerini degistirmek istiyorsak yukardaki ornek daha mantikli
        //bura hr iki valuede dagisiyor amac sadece bir degeri degistirmek ise Array.copyOf(a,a.length) olmalidir.
        System.out.println(Arrays.toString(a));//[100, 30, 40]
        System.out.println(Arrays.toString(b));//[100, 30, 40]
        System.out.println();
        int [] e={20,30,40};
        int [] f =Arrays.copyOf(e,e.length+1);
        f[3]=100;
        System.out.println(Arrays.toString(e));//[20, 30, 40]
        System.out.println(Arrays.toString(f));//[20, 30, 40, 100]











    }
}
