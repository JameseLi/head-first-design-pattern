package factorypattern.abstractfactory;

public abstract class AbstractPizza {
    String name;
    Dough  dough;
    Sauce sauce;
    Veggie[] veggies;
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clam;

    /**
     * 准备pizza
     */
    abstract void prepare();

    void bake() {
        System.out.println("bake for 25 min at 350");
    }

    void cut() {
        System.out.println("cutting the pizza into diagonal slices");
    }

    void box() {
        System.out.println("place pizza in official PizzaStore box");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
