package decoratorpattern;

/**
 * @author lizhengjun
 */
public class Espresso extends AbstractBeverage {

    public Espresso() {
        description = "Espresso Coffee";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
