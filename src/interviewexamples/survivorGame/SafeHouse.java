package interviewexamples.survivorGame;

public class SafeHouse extends NormalLocation{


    SafeHouse(Player player) {
        super(player, "Security house");
    }

    @Override
    public boolean getLocation() {
        player.setHealthy(player.getrHealty());
        System.out.println("your healty is full your good to play");
        System.out.println("your are at securty house");
        return true;
    }
}
