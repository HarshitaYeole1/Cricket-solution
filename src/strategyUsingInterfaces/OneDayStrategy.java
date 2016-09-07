package strategyUsingInterfaces;

/**
 * Created by harshita on 7/9/16.
 */
public class OneDayStrategy implements PlayingStrategy {

    @Override
    public String playStrategy() {
        return "using mixed strategy";
    }
}
