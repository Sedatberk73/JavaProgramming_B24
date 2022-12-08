package day_55Abstraction.learn_interface;

public class Spanish implements Language{
    @Override
    public void hi() {
        System.out.println("Hola");
    }

    @Override
    public void bye() {
        System.out.println("Adios");
    }

}
