package Day_3.facade;

public class HotelKeeperImplementation implements HotelKeeper{
    @Override
    public VegMenu getVegMenu() {
        VegRestaurant v=new VegRestaurant();
        VegMenu vegMenu=(VegMenu) v.getMenus();
        return vegMenu;
    }

    @Override
    public NonVegMenu getNonVegMenu() {
        NonVegRestaurant nonVegRestaurant=new NonVegRestaurant();
        NonVegMenu nonVegMenu=(NonVegMenu) nonVegRestaurant.getMenus();
        return nonVegMenu;
    }

    @Override
    public MixedMenu getMixedMenu() {
        MixedRestaurant mixedRestaurant=new MixedRestaurant();
        MixedMenu mixedMenu=(MixedMenu) mixedRestaurant.getMenus();
        return mixedMenu;
    }
}
