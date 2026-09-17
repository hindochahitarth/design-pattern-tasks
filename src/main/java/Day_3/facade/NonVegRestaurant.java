package Day_3.facade;

public class NonVegRestaurant implements Hotel{

    @Override
    public Menus getMenus() {
        return new NonVegMenu();
    }
}
