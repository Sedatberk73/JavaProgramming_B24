package my_utilities;

import day_51inharitance.Modifier;

public class TestModifierWithInheritance extends Modifier {
//inharitance cannot acces for different package outside project we need object
    public static void main(String[] args) {
        Modifier obj=new Modifier();
        System.out.println(obj.a);
//        System.out.println("obj.b = " + obj.b);
//        System.out.println("obj.c = " + obj.c);
//
//        //System.out.println(obj.d);// its not working lke obj.d its private

        TestModifierWithInheritance obj2=new TestModifierWithInheritance();
              System.out.println(obj.getD());

        System.out.println(obj2.b);/// only can cal protected B and public a
        // we cant't call default and private
        //all public - methods//protected-methods in inharitance
        //constructor its not inharitance




    }

}
