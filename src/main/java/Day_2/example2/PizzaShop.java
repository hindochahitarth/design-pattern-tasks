package Day_2.example2;

import java.util.ArrayList;
import java.util.List;

class PizzaShop {
    private PizzaBuilder draft = null;
    private final PizzaDirector director = new PizzaDirector();
    private final List<Pizza> built = new ArrayList<>();

    public PizzaShop() {
    }

    private boolean knownSize(String size) {
        return size.equals("small") || size.equals("medium") || size.equals("large");
    }

    public boolean startCustom(String size) {
        if (!knownSize(size)) {
            return false;
        }
        draft = new PizzaBuilder(size);
        return true;
    }

    public boolean crust(String value) {
        if (draft == null) {
            return false;
        }
        draft.setCrust(value);
        return true;
    }

    public boolean sauce(String value) {
        if (draft == null) {
            return false;
        }
        draft.setSauce(value);
        return true;
    }

    public boolean cheese(String value) {
        if (draft == null) {
            return false;
        }
        draft.setCheese(value);
        return true;
    }

    public boolean addTopping(String value) {
        if (draft == null) {
            return false;
        }
        draft.addTopping(value);
        return true;
    }

    public String buildCustom() {
        if (draft == null) {
            return "ERROR: no pizza started";
        }
        Pizza pizza = draft.build();
        built.add(pizza);
        return pizza.render();
    }

    public String order(String recipe, String size) {
        if (!recipe.equals("margherita") && !recipe.equals("pepperoni")
                && !recipe.equals("veggie")) {
            return "ERROR: unknown recipe";
        }
        if (!knownSize(size)) {
            return "ERROR: unknown size";
        }
        Pizza pizza;
        if (recipe.equals("margherita")) {
            pizza = director.buildMargherita(size);
        } else if (recipe.equals("pepperoni")) {
            pizza = director.buildPepperoni(size);
        } else {
            pizza = director.buildVeggie(size);
        }
        built.add(pizza);
        return pizza.render();
    }

    public String rendered(int index) {
        if (index < 0 || index >= built.size()) {
            return "ERROR: no such pizza";
        }
        return built.get(index).render();
    }

    public int builtCount() {
        return built.size();
    }
}