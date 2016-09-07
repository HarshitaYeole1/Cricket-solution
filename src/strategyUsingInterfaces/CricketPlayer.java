package strategyUsingInterfaces;

/**
 * Created by harshita on 7/9/16.
 */
public class CricketPlayer {

    PlayingStrategy strategy;
    String playerName;


    public CricketPlayer(String name, PlayingStrategy strategy){
        this.playerName=name;
        this.strategy = strategy;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public void setStrategy(PlayingStrategy strat) {
        this.strategy = strat;
    }

    public String play() {
        return ("Player "+getPlayerName()+ " is "+ strategy.playStrategy());
    }

}
