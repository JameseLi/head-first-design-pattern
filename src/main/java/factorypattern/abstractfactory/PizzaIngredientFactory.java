package factorypattern.abstractfactory;

/**
 * @author lizhengjun
 */
public interface PizzaIngredientFactory {
    /**
     * 创建面团
     *
     * @return Dough
     */
    Dough createDough();

    /**
     * 创建
     *
     * @return Sauce
     */
    Sauce createSauce();

    /**
     * 创建芝士
     *
     * @return Cheese
     */
    Cheese createCheese();

    /**
     * 创建蔬菜
     *
     * @return Veggie[]
     */
    Veggie[] createVeggies();

    /**
     * 创建Pepperoni
     *
     * @return Pepperoni
     */
    Pepperoni createPepperoni();

    /**
     * 创建生蚝
     *
     * @return Clams
     */
    Clams createClam();
}
