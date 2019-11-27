package decoratorpattern;

/**
 * @author lizhengjun
 */
public class DecoratorPatternMain {

    public static void main(String[] args) {
        AbstractBeverage abstractBeverage = new DarkRoast();
        System.out.println(abstractBeverage.getDescription() + " $" + abstractBeverage.cost());

        AbstractBeverage abstractBeverage1 = new Mocha(abstractBeverage);
        abstractBeverage1 = new Soy(abstractBeverage1);
        abstractBeverage1 = new Whip(abstractBeverage1);
        System.out.println(abstractBeverage1.getDescription() + " $" + abstractBeverage1.cost());

        AbstractBeverage abstractBeverage2 = new BigCup(abstractBeverage1);
        System.out.println(abstractBeverage2.getDescription() + " $" + abstractBeverage2.cost());
    }
}
