import strategyUsingEnum.CricketPlayer;
import strategyUsingEnum.PlayingStrategy;

import static org.junit.Assert.*;

/**
 * Created by harshita on 7/9/16.
 */
public class CricketPlayerTestEnum {
    CricketPlayer player1;
    CricketPlayer player2;
    @org.junit.Before
    public void setUp() throws Exception {
      player1=new CricketPlayer("Dhoni",1990, PlayingStrategy.TEST);
      player2=new CricketPlayer("Virat",1995,PlayingStrategy.ONE_DAY);
    }

    @org.junit.Test
    public void itShouldTestsetStrategy() throws Exception {
        player1.setStrategy(PlayingStrategy.T20);
        assertNotEquals("Dhoni is using defensive strategy",player1.play());
    }

    @org.junit.Test
    public void itShouldTestplay() throws Exception {
        player1.play();
        assertEquals("Dhoni is using defensive strategy",player1.play());
    }



}