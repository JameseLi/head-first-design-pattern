package factorypattern.factorymethod;

/**
 * @author lizhengjun
 */
public class ChicagoStylePizzaStore extends AbstractPizzaStore {

    @Override
    AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        }
        return pizza;
    }
}
