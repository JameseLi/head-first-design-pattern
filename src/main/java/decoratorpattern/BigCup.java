package decoratorpattern;

/**
 * @author lizhengjun
 */
public class BigCup extends AbstractSizeDecorator {

    private AbstractBeverage abstractBeverage;

    public BigCup(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", Big Cup";
    }

    @Override
    public double cost() {
        return 1 + abstractBeverage.cost();
    }
}
