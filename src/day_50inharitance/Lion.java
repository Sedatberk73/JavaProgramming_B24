package day_50inharitance;

public class Lion extends animal{
    int numberofClaws;

    boolean king;

    public void roar(){
        System.out.println("lion rooooar");

    }

    @Override
    public String toString() {
        return "Lion{" +
                "numberofClaws=" + numberofClaws +
                ", king=" + king +
                ", species='" + species + '\'' +
                ", age=" + age +
                ", numberoflegs=" + numberoflegs +
                '}';
    }
}
