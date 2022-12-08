package day_58eception.animal;

public class PO extends Panda {
    @Override
    public PO getAnimal() {//we can't do animal  its parent class
        return new PO();
    }
}
