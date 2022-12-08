package day_55Abstraction.Excerice;

public class squatting extends Lifting {

    @Override
    public void perform() {
        System.out.println("squatting");
    }


    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(minutes*0.34);
    }


    @Override
    public void rackWeights() {
        System.out.println("putting away the weight");
    }











}
