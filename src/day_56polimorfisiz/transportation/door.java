package day_56polimorfisiz.transportation;

public  class door implements rightDoor,leftDoor,bacDoor{

    @Override
    public void back() {
        System.out.println("back door is opening");
    }

    @Override
    public void left() {
        System.out.println("left door is opening");
    }


    @Override
    public void right(int door) {
        System.out.println("rigth door is openning");
    }
}
