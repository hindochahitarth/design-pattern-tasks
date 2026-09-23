package Day_3.facade.example_2;
class ComputerFacade {
    private PowerSupply powerSupply=new PowerSupply();
    private DiskDrive diskDrive=new DiskDrive();
    private NetworkAdapter networkAdapter=new NetworkAdapter();
    private int startups=0;
    public ComputerFacade() {}

    public String[] startComputer() {
        startups++;
        return new String[]{
                "--- Starting computer ---",powerSupply.turnOn(),
                diskDrive.mount(),
                networkAdapter.connect(),
                "--- Computer ready. ---"
        };

    }

    public String[] shutDown() {
        return new String[]{
                "--- Shutting down computer ---",networkAdapter.disconnect(), diskDrive.unmount(),
                powerSupply.turnOff(),

                "--- Computer off. ---"
        };
    }

    public String setNetwork(boolean connected) {
        return connected ? networkAdapter.connect():networkAdapter.disconnect();

    }

    public String setDisk(boolean mounted) {
        return mounted ? diskDrive.mount():diskDrive.unmount();
    }

    public boolean powerOn() {
        return powerSupply.isOn();
    }

    public boolean diskMounted() {
        return diskDrive.isMounted();

    }

    public boolean networkConnected() {
        return networkAdapter.isConnected();
    }

    public int startupCount() {
        return startups;

    }
}

