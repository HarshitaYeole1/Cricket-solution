package strategyUsingInterfaces;

/**
 * Created by harshita on 7/9/16.
 */
public class CricketMain {
    public static void main(String[] args) {


        CricketPlayer player1=new CricketPlayer("Dhoni",new TestStrategy());
        CricketPlayer player2=new CricketPlayer("Virat",new T20Strategy());
        CricketPlayer player3=new CricketPlayer("Sachin",new OneDayStrategy());

        player1.play();
        player2.play();
        player3.play();

        player2.setStrategy(new TestStrategy());
        player2.play();


    }

}
