package day_56polimorfisiz.transportation;

public class road2Example extends Tesla {
    @Override
    public void back() {
        super.back();
    }

    @Override
    public void left() {
        super.left();
    }

    @Override
    public void right(int door) {
       // super.right(door);
        System.out.println("now we are road2 example we use override for right door");
    }

    @Override
    public void go() {
        super.go();
    }

    @Override
    public void charge() {
        super.charge();
    }

    @Override
    public void windowopening() {
        super.windowopening();
        System.out.println("also using for roadExample");
    }

    public static void main(String[] args) {

        road2Example exam=new road2Example();
        exam.left();
        exam.right(2);
        exam.back();

        rightDoor r=new road2Example();
        r.right(2);

Tesla tr=new road2Example();
tr.windowopening();
Transportation trans=new road2Example();
trans.go();

Car cr=new road2Example();
cr.windowopening();

  door dor=new door();
   dor.back();



    }
}
