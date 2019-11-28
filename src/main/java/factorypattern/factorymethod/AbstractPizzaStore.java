package factorypattern.factorymethod;

/**
 * @author lizhengjun
 */
public abstract class AbstractPizzaStore {

    public void orderPizza(String type) {
        AbstractPizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

    }

    /**
     * 生产披萨
     *
     * @param type 披萨类型
     * @return AbstractPizza
     */
    abstract AbstractPizza createPizza(String type);
}
