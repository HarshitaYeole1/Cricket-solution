package strategyUsingEnum;

/**
 * Created by harshita on 7/9/16.
 */
public class CricketMain {

    public static void main(String[] args) {

        CricketPlayer player1=new CricketPlayer("Dhoni",1990,PlayingStrategy.TEST);
        CricketPlayer player2=new CricketPlayer("Virat",1995,PlayingStrategy.ONE_DAY);
        player1.play();
        player2.play();

        player1.setStrategy(PlayingStrategy.T20);
        player1.play();








    }
}
