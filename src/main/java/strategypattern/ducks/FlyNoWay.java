package strategypattern.ducks;

/**
 * @author lizhengjun
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("can`t fly");
    }
}
