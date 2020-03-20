package strategypattern.ducks;

/**
 * @author lizhengjun
 */
public class Squack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("zizi...");
    }
}
