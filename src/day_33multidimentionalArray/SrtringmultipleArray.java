package day_33multidimentionalArray;

import java.util.Arrays;
import java.util.Scanner;

public class SrtringmultipleArray {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        String [] [] cybertek=new String[4][3]; //dort satir 3 sutun


        System.out.println(Arrays.deepToString(cybertek));//[[null, null, null], [null, null, null], [null, null, null], [null, null, null]]
        System.out.println(cybertek.length);//4
        cybertek=new String[4][1];//ikincisi pek ifade etmiyor eger deger varsa default olarak cikar
        //eger ilk[] normal veriden fazla ise o zaman ikini ne kadar veriye sahipse o kadar defaoult deger cikar

        String[] grp1={"sergi","nisso","rano"};
        String[] grp2={"mubarek","ibrahim"};
        String[] grp3={"nadi","nisso","saim"};
        String[] grp4={"nicole","tach","ailya","muhammed"};

        cybertek[0]=grp1;
        cybertek[1]=grp2;
        cybertek[2]=grp3;
        cybertek[3]=grp4;
       // System.out.println(Arrays.deepToString(cybertek));
for (String[] groups:cybertek){
    System.out.println(Arrays.deepToString(groups));
    //System.out.println();
    System.out.println(Arrays.toString(groups));
}

        System.out.println();
for (String[] groups:cybertek){
    System.out.println("group members: ");
    for (String member:groups){
        System.out.println(member);
    }


}










    }
}
