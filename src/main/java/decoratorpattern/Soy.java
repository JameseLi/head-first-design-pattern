package decoratorpattern;

public class Soy extends AbstractCondimentDecorator {
    private AbstractBeverage abstractBeverage;

    public Soy(AbstractBeverage abstractBeverage) {
        this.abstractBeverage = abstractBeverage;
    }

    @Override
    public String getDescription() {
        return abstractBeverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + abstractBeverage.cost();
    }
}
