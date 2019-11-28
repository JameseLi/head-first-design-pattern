package factorypattern.abstractfactory;

/**
 * @author lizhengjun
 */
public class ClamPizza extends AbstractPizza {
    private PizzaIngredientFactory pizzaIngredientFactory;

    public ClamPizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    void prepare() {
        System.out.println("Preparing " + name);
        dough = pizzaIngredientFactory.createDough();
        System.out.println(dough.toString());
        sauce = pizzaIngredientFactory.createSauce();
        System.out.println(sauce.toString());
        cheese = pizzaIngredientFactory.createCheese();
        System.out.println(cheese.toString());
        clam = pizzaIngredientFactory.createClam();
        System.out.println(clam.toString());
    }
}
