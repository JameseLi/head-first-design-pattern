package decoratorpattern;

/**
 * @author lizhengjun
 */
public abstract class AbstractBeverage {

    String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    /**
     * 价格
     *
     * @return double
     */
    public abstract double cost();
}
