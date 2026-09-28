package Day_2.example2;

import java.util.ArrayList;
import java.util.List;

class Pizza {
    private final String size;
    private final String crust;
    private final String sauce;
    private final String cheese;
    private final List<String> toppings;

    Pizza(PizzaBuilder builder) {
        this.size = builder.size;
        this.crust = builder.crust;
        this.sauce = builder.sauce;
        this.cheese = builder.cheese;
        this.toppings = new ArrayList<>(builder.toppings);
    }

    String render() {
        return "Pizza{size='" + size
                + "', crust='" + crust
                + "', sauce='" + sauce
                + "', cheese='" + cheese
                + "', toppings=[" + String.join(", ", toppings) + "]}";
    }
}