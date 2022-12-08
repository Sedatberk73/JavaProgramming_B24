package my_utilities;

import day_51inharitance.Modifier;

public class TestModifierOutsideTest {

    public static void main(String[] args) {
        Modifier objr=new Modifier();
        System.out.println(objr.a);//if is publiv its work different package
       // System.out.println("obj.b = " + obj.b); protected its not working with different package
       // System.out.println("obj.c = " + obj.c); default it's not working with different package

        System.out.println("obj.b = " + objr.getB());//we need to call getter setter
        System.out.println("obj.c = " + objr.getC());//we need to call getter setter
        System.out.println(objr.getD());//we need to call getter setter






    }







}
