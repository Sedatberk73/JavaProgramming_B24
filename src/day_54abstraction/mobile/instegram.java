package day_54abstraction.mobile;

public class instegram extends MobileApp {

    public void postPhoto() {
        System.out.println("posting phone");
    }

    @Override
    public void useApp(int minutes) {
        super.useApp(minutes);
        postPhoto();

    }



}