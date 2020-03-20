package strategypattern.ducks;

/**
 * @author lizhengjun
 */
public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("guagua...");
    }
}
