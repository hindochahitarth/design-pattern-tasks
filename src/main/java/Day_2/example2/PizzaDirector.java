package Day_2.example2;
class PizzaDirector{
    Pizza buildMargherita(String size){
        return new PizzaBuilder(size)
                .setCrust("regular")
                .setSauce("tomato")
                .setCheese("mozzarella")
                .addTopping("basil")
                .build();
    }
    Pizza buildPepperoni(String size){
        return new PizzaBuilder(size)
                .setCrust("thin")
                .setSauce("tomato")
                .setCheese("mozzarella")
                .addTopping("pepperoni")
                .addTopping("olives")
                .build();
    }
    Pizza buildVeggie(String size){
        return new PizzaBuilder(size)
                .setCrust("whole wheat")
                .setSauce("pesto")
                .setCheese("gouda")
                .addTopping("mushrooms")
                .addTopping("peppers")
                .addTopping("onions")
                .addTopping("olives")
                .build();
    }
}

