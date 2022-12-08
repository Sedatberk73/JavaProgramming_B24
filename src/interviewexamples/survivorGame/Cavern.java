package interviewexamples.survivorGame;

public class Cavern extends BattleLoc{
    Cavern(Player player) {
        super(player, "Cavern", new Zombi(),"Food");
    }
}
