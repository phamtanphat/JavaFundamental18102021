package OOPHigher.Abstraction;

public class PizzaStore {

    public void orderPizza(Pizza pizza){
        pizza.category();
        pizza.size();
        pizza.sauce();
        pizza.prepare();
        pizza.cut();
        pizza.box();
    }
}
