package strategypattern.ducks;

/**
 * @author lizhengjun
 */
public class StrategyPattenDuckMain {
    public static void main(String[] args) {
        AbstractDuck duck = new MallardDuck();
        duck.swim();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.setFlyBehavior(new FlyNoWay());
        duck.setQuackBehavior(new Squack());
        duck.performFly();
        duck.performQuack();
        duck = new DecoyDuck();
        duck.swim();
        duck.display();
        duck.performFly();
        duck.performQuack();
    }
}
