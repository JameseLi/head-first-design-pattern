package decoratorpattern;

public class Milk extends AbstractCondimentDecorator {

    private AbstractBeverage abstractBeverage;

    public Milk(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", Milk";
    }

    @Override
    public double cost() {
        return 0.1 + abstractBeverage.cost();
    }
}
