package Day_3.facade;

public class MixedRestaurant implements Hotel{

    @Override
    public Menus getMenus() {
        return new MixedMenu();
    }
}
