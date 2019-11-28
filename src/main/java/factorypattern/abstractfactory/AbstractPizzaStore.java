package factorypattern.abstractfactory;

public abstract class AbstractPizzaStore {

    public AbstractPizza orderPizza(String type) {
        AbstractPizza pizza = null;
        pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    /**
     * 制作披萨
     *
     * @param type 类型
     * @return AbstractPizza
     */
    protected abstract AbstractPizza createPizza(String type);
}
