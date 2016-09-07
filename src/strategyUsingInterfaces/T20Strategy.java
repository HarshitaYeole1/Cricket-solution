package strategyUsingInterfaces;

/**
 * Created by harshita on 7/9/16.
 */
public class T20Strategy implements PlayingStrategy {

    @Override
    public String playStrategy() {
        return "using offensive strategy";
    }
}
