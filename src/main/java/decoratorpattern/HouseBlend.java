package decoratorpattern;

/**
 * @author lizhengjun
 */
public class HouseBlend extends AbstractBeverage {

    public HouseBlend() {
        description = "House Blend Coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}
