package strategypattern.ducks;

/**
 * @author lizhengjun
 */
public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("fly with wings");
    }
}
