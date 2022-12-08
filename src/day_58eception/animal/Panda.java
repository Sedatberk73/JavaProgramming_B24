package day_58eception.animal;

public class Panda extends Animal {
    @Override
    public Panda getAnimal() {
        return new Panda();
    }
}
