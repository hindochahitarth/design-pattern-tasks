package Day_3.facade.example_2;

class NetworkAdapter {
    private boolean connected = false;

    public String connect() {
        connected = true;
        return "Network: Connected.";
    }

    public String disconnect() {
        connected = false;
        return "Network: Disconnected.";
    }

    public boolean isConnected() {
        return connected;
    }
}
