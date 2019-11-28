package factorypattern.abstractfactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        AbstractPizzaStore pizzaStore = new NewYorkPizzaStore();

        AbstractPizza pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Joel eat pizza is " + pizza.getName());

        pizzaStore = new ChicagoPizzaStore();
        pizza = pizzaStore.orderPizza("cheese");
        System.out.println("Ethan eat pizza is " + pizza.getName());
    }
}
