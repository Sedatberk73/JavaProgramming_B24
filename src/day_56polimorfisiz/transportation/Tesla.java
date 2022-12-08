package day_56polimorfisiz.transportation;

public class Tesla extends Car implements SelfDriving,Electric ,rightDoor{
door d=new door();

    public void back() {
        d.back();
        System.out.println("back door opening for tesla");
    }

    public void left() {
        d.left();
    }

    public void right(int door) {
        d.right(door);
        System.out.println("rigt door is opening for tesla");
    }

    @Override
    public void go() {
        System.out.println("Tesla ===tesla is driving");
    }

    @Override
    public void charge() {
        System.out.println("Tesla is charging");
    }

    @Override
    public void noGas() {
        System.out.println("Tesla has no gass for new car");
    }

    @Override
    public void selfDrive() {
        System.out.println("tesla is in auto pilot");

    }

    @Override
    public void byself() {
        System.out.println("tesla also can driving bySelf");
    }

    @Override
    public void v5() {

        System.out.println("vites no use for tesla");
    }

    @Override
    public void windowopening() {
        super.windowopening();
        System.out.println("also using for tesla class");
    }
}
