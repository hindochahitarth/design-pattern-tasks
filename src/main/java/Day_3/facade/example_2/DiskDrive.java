package Day_3.facade.example_2;

class DiskDrive {
    private boolean mounted = false;

    public String mount() {
        mounted = true;
        return "Disk: System drive mounted.";
    }

    public String unmount() {
        mounted = false;
        return "Disk: System drive unmounted.";
    }

    public boolean isMounted() {
        return mounted;
    }
}

