package day_54abstraction.mobile;

public class Discord extends MobileApp {



    public void chat(){
        System.out.println("Chating on "+getName());
    }

    @Override
    public void useApp(int minutes) {
        super.useApp(minutes);
        chat();
    }
}
