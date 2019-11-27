package strategypattern.ducks;

/**
 * 橡皮鸭
 *
 * @author lizhengjun
 */
public class RubberDuck extends AbstractDuck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Squack();
    }

    @Override
    protected void display() {
        System.out.println("I'm RubberDuck");
    }
}
