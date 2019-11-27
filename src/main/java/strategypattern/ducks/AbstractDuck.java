package strategypattern.ducks;

/**
 * @author lizhengjun
 */
public abstract class AbstractDuck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    /**
     * 游泳方法
     */
    public void swim() {
        System.out.println("all duck can swim");
    }

    /**
     * 修饰方法
     */
    protected abstract void display();

    protected void performFly() {
        flyBehavior.fly();
    }

    protected void performQuack() {
        quackBehavior.quack();
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
}
