package replitexamples20.ParkingMeter;
import  java.util.*;
public class parkingmain {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ParkingMeter pm = new ParkingMeter(in.nextInt());
        pm.add(in.nextInt());
        pm.tick();
        System.out.println(pm.timeLeft);
        System.out.println(pm.isExpired());

    }
}
