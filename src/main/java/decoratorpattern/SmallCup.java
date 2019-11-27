package decoratorpattern;

/**
 * @author lizhengjun
 */
public class SmallCup extends AbstractSizeDecorator {

    private AbstractBeverage abstractBeverage;

    public SmallCup(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", Small Cup";
    }

    @Override
    public double cost() {
        return 0.1 + abstractBeverage.cost();
    }
}
