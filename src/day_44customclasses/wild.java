package day_44customclasses;

public class wild {
    public static void main(String[] args) {
        Animal tiger=new Animal();
        //tiger is object
//        tige.species="tiger";
//        tige.size="Medium";
//        tige.NumberOfLegs=4;//

        tiger.eat();
        tiger.sleeping();
        new Animal().eat();//nullis eating
        Animal panda=new Animal();//not overloading is it reassining
        panda.eat();//nullis eating
        System.out.println();
    }
}
