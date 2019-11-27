package decoratorpattern;

/**
 * @author lizhengjun
 */
public class MediumCup extends AbstractSizeDecorator {

    private AbstractBeverage abstractBeverage;

    public MediumCup(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", Medium Cup";
    }

    @Override
    public double cost() {
        return 0.5 + abstractBeverage.cost();
    }
}
