package Day_2.example2;


import java.util.ArrayList;
import java.util.List;

class PizzaBuilder{
    final String size;
    String crust="regular";
    String sauce="tomato";
    String cheese="mozzarella";
    List<String> toppings = new ArrayList<String>();

    public PizzaBuilder(String size){
        this.size=size;
    }
    PizzaBuilder setCrust(String value){
        crust=value;
        return this;
    }
    PizzaBuilder setSauce(String value){
        sauce=value;
        return this;
    }
    PizzaBuilder setCheese(String value){
        cheese=value;
        return this;
    }
    PizzaBuilder addTopping(String value){
        toppings.add(value);
        return this;
    }
    public Pizza build(){
        return new Pizza(this);
    }
}

