package Day_3.facade.example_2;

class FacadeDriver {
    private final ComputerFacade facade;

    public FacadeDriver() {
        facade = new ComputerFacade();
    }

    public String[] startComputer() {
        return facade.startComputer();
    }

    public String[] shutDown() {
        return facade.shutDown();
    }

    public String setNetwork(boolean connected) {
        return facade.setNetwork(connected);
    }

    public String setDisk(boolean mounted) {
        return facade.setDisk(mounted);
    }

    public boolean powerOn() {
        return facade.powerOn();
    }

    public boolean diskMounted() {
        return facade.diskMounted();
    }

    public boolean networkConnected() {
        return facade.networkConnected();
    }

    public int startupCount() {
        return facade.startupCount();
    }
}
