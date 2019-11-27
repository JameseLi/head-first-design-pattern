package strategypattern.ducks;

/**
 * 红头鸭
 *
 * @author lizhengjun
 */
public class RedHeadDuck extends AbstractDuck {


    public RedHeadDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }

    @Override
    protected void display() {
        System.out.println("I'm RedHeadDuck");
    }
}
