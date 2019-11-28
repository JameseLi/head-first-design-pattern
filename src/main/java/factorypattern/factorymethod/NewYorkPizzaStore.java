package factorypattern.factorymethod;

/**
 * @author lizhengjun
 */
public class NewYorkPizzaStore extends AbstractPizzaStore {
    @Override
    AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NewYorkStyleCheesePizza();
        }
        return pizza;
    }
}
