package day_55Abstraction.Excerice;

public class Running extends Exercise {

    @Override
    public void getCaloriesBurned(int minutes) {
        System.out.println(minutes*0.4);
    }


    @Override
    public void perform() {
        System.out.println("running");
    }
}
