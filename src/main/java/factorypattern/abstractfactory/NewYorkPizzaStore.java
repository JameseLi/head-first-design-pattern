package factorypattern.abstractfactory;

/**
 * @author lizhengjun
 */
public class NewYorkPizzaStore extends AbstractPizzaStore {
    @Override
    protected AbstractPizza createPizza(String type) {
        AbstractPizza pizza = null;
        PizzaIngredientFactory pizzaIngredientFactory = new NewYorkPizzaIngredientFactory();

        if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Cheese Pizza");
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza(pizzaIngredientFactory);
            pizza.setName("New York Style Veggie Pizza");
        } else if (type.equals("clam")) {
            pizza = new ClamPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Clam Pizza");
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("New York Style Pepperoni Pizza");
        }
        return pizza;
    }
}
