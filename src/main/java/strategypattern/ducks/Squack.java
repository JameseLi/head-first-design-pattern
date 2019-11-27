package strategypattern.ducks;

/**
 * @author lizhengjun
 */
public class Squack implements QuackBehavior {
    public void quack() {
        System.out.println("zizi...");
    }
}
