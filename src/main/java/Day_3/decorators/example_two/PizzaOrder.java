package Day_3.decorators.example_two;

import java.util.ArrayList;
import java.util.List;

class PizzaOrder {
    private static final int MAX_TOPPINGS = 6;

    private final List<Pizza> layers = new ArrayList<>();

    public PizzaOrder() {
        layers.add(new PlainPizza());
    }

    private Pizza current() {
        return layers.get(layers.size() - 1);
    }

    private Pizza wrapWith(String kind, Pizza base) {
        if (kind.equalsIgnoreCase("cheese")) {
            return new CheeseDecorator(base);
        }
        if (kind.equalsIgnoreCase("pepperoni")) {
            return new PepperoniDecorator(base);
        }
        if (kind.equalsIgnoreCase("mushrooms")) {
            return new MushroomDecorator(base);
        }
        return null;
    }

    public boolean addTopping(String kind) {
        Pizza wrapped = wrapWith(kind, current());
        if (wrapped == null) {
            return false;
        }
        if (layers.size() - 1 >= MAX_TOPPINGS) {
            return false;
        }
        layers.add(wrapped);
        return true;
    }

    public boolean removeLastTopping() {
        if (layers.size() <= 1) {
            return false;
        }
        layers.remove(layers.size() - 1);
        return true;
    }

    public double cost() {
        return current().cost();
    }

    public String description() {
        return current().description();
    }

    public int toppingCount() {
        return layers.size() - 1;
    }

    public String summary() {
        return String.format(java.util.Locale.US, "%s | $%.2f", description(), cost());
    }

    public int reset() {
        int removed = toppingCount();
        layers.clear();
        layers.add(new PlainPizza());
        return removed;
    }
}
