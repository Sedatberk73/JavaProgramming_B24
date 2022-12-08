package day_43Arraylists;

import java.util.ArrayList;
import java.util.Arrays;

public class removeifexample {
    public static void main(String[] args) {

        ArrayList<Integer> nums=new ArrayList<>(Arrays.asList(3,2,5,3,4,5,6,7,8,9,2));

//nums.removeIf(n->n%2==1);//n it get outamtttticly fixed its ganna check all the number we dont need write like int n also its get remove all add numbe
        System.out.println(nums);//[2, 4, 6, 8, 2]

nums.removeIf(i->i%2==0); //variable ->boolean expration
        System.out.println(nums);//[]





    }
}
