package factorypattern.factorymethod;

/**
 * @author lizhengjun
 */
public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractPizzaStore pizzaStore = new NewYorkPizzaStore();
        pizzaStore.orderPizza("cheese");
        pizzaStore = new ChicagoStylePizzaStore();
        pizzaStore.orderPizza("cheese");
    }
}
