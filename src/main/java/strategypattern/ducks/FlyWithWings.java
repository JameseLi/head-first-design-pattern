package strategypattern.ducks;

/**
 * @author lizhengjun
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("fly with wings");
    }
}
