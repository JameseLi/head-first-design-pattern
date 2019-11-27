package decoratorpattern;

/**
 * @author lizhengjun
 */
public class DarkRoast extends AbstractBeverage {

    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    @Override
    public double cost() {
        return 0.99;
    }
}
