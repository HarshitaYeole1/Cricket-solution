package strategyUsingEnum;

/**
 * Created by harshita on 7/9/16.
 */
public class CricketPlayer {

    PlayingStrategy strategy;
    String playerName;
    int yearOfDebut;

    public CricketPlayer(String playerName,int yearOfDebut,PlayingStrategy strategy) {
        this.strategy = strategy;
        this.playerName = playerName;
        this.yearOfDebut=yearOfDebut;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public PlayingStrategy getStrategy() {
        return strategy;
    }

    public void setStrategy(PlayingStrategy strategy) {
        this.strategy = strategy;
    }

    public int getYearOfDebut() {
        return yearOfDebut;
    }

    public void setYearOfDebut(int yearOfDebut) {
        this.yearOfDebut = yearOfDebut;
    }

    public String play()
    {

        return (this.playerName+ " is " + strategy.playStrategy());
    }

}
