package strategyUsingInterfaces;

/**
 * Created by harshita on 7/9/16.
 */
public class TestStrategy implements PlayingStrategy {

    @Override
    public String playStrategy() {
        return "using defensive strategy";
    }
}
