package strategypattern.ducks;

/**
 * 绿头鸭
 *
 * @author lizhengjun
 */
public class MallardDuck extends AbstractDuck {

    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }


    @Override
    protected void display() {
        System.out.println("I'm MallardDuck");
    }
}
