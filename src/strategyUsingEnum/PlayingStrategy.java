package strategyUsingEnum;

/**
 * Created by harshita on 7/9/16.
 */

public enum PlayingStrategy{

    T20{
        @Override
        public String playStrategy() {
            return "using offensive strategy";
        }
    },
    TEST{
        @Override
        public String playStrategy() {
            return "using defensive strategy";
        }
    },
    ONE_DAY {
        @Override
        public String playStrategy() {
            return "using offensive and defensive strategy";
        }
    };


    public abstract String playStrategy();
}
