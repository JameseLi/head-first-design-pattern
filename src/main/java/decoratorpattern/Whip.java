package decoratorpattern;

/**
 * @author lizhengjun
 */
public class Whip extends AbstractCondimentDecorator {

    private AbstractBeverage abstractBeverage;

    public Whip(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.2 + abstractBeverage.cost();
    }
}
