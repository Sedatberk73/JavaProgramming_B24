package interviewexamples.survivorGame;

public class Forest extends BattleLoc{
    Forest(Player player) {
        super(player, "Forest", new Vampir(),"Firewood");
    }
}
