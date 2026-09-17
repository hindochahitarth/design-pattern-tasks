package Day_3.facade;

public class Main {
    public static void main(String[] args) {
        HotelKeeper keeper=new HotelKeeperImplementation();

        VegMenu vegMenu=keeper.getVegMenu();
        NonVegMenu nonVegMenu=keeper.getNonVegMenu();
        MixedMenu mixedMenu=keeper.getMixedMenu();

        vegMenu.showMenu();
        nonVegMenu.showMenu();
        mixedMenu.showMenu();
    }
}
