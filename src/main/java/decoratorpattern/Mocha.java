package decoratorpattern;

public class Mocha extends AbstractCondimentDecorator {

    private AbstractBeverage abstractBeverage;

    public Mocha(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.2 + abstractBeverage.cost();
    }
}
