package interviewexamples.intervieweamples1.car;

public  class bmw extends car implements  radio,brake{

    @Override
    public void vites() {
        //super.vites();
        System.out.println("vites 5 for bmw");

    }

    @Override
    public void eacdoor() {
        System.out.println("bmw has two doors");
    }

    @Override
    public void engine() {
        System.out.println("bmw has 2.3 engine");

    }

    @Override
    public void brak() {
        System.out.println("bmw has good breake");
    }

    @Override
    public void rad() {
        System.out.println("Bmw radio is okay");
    }
}
