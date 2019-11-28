package factorypattern.factorymethod;

import java.util.ArrayList;

/**
 * @author lizhengjun
 */
public abstract class AbstractPizza {

    String name;
    String dough;
    String sauce;
    ArrayList toppings = new ArrayList();

    void prepare() {
        System.out.println("Prepare pizza " + name);
        System.out.println("Tossing dough...");
        System.out.println("Add sauce");
        System.out.println("Add Toppings");
        for (int i = 0; i < toppings.size(); i++) {
            System.out.println("" + toppings.get(i));
        }
    }

    void bake() {
        System.out.println("Bake for 25 min at 350");
    }

    void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("Place pizza in official PizzaStore box ");
    }

    public String getName() {
        return name;
    }
}
