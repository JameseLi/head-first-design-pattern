package strategypattern.ducks;

/**
 * @author lizhengjun
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("guagua...");
    }
}
