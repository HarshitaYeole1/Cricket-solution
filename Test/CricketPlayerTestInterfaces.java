import strategyUsingInterfaces.CricketPlayer;
import strategyUsingInterfaces.OneDayStrategy;
import strategyUsingInterfaces.T20Strategy;
import strategyUsingInterfaces.TestStrategy;

import static org.junit.Assert.*;

/**
 * Created by harshita on 7/9/16.
 */
public class CricketPlayerTestInterfaces {
    CricketPlayer player1;
    CricketPlayer player2;
    @org.junit.Before
    public void setUp() throws Exception {
        player1=new CricketPlayer("Dhoni",new TestStrategy());
        player2=new CricketPlayer("Virat", new OneDayStrategy());
    }

    @org.junit.Test
    public void itShouldTestsetStrategy() throws Exception {
        player1.setStrategy(new T20Strategy());
        assertNotEquals("Player Dhoni is using defensive strategy",player1.play());
    }

    @org.junit.Test
    public void itShouldTestplay() throws Exception {
        player1.play();
        assertEquals("Player Dhoni is using defensive strategy",player1.play());
    }

}