package strategypattern.ducks;

/**
 * 诱饵鸭
 *
 * @author lizhengjun
 */
public class DecoyDuck extends AbstractDuck {

    public DecoyDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }
    @Override
    protected void display() {
        System.out.println("I'm DecoyDuck");
    }
}
