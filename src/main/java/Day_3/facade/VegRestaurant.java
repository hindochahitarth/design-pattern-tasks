package Day_3.facade;

public class VegRestaurant implements Hotel{

    @Override
    public Menus getMenus() {
        return new VegMenu();
    }
}
