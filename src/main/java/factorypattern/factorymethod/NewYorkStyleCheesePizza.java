package factorypattern.factorymethod;

/**
 * @author lizhengjun
 */
public class NewYorkStyleCheesePizza extends AbstractPizza {

    public NewYorkStyleCheesePizza() {
        name = "NY style sauce and cheese pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated Reggiano Cheese");
    }
}
