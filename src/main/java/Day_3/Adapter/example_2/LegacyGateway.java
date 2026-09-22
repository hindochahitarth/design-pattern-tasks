package Day_3.Adapter.example_2;

class LegacyGateway {
    private int calls = 0;

    public String makeCharge(int cents, String reference, boolean capture) {
        calls++;
        return "Legacy -> " + reference + ": " + cents
                + " cents (capture=" + capture + ")";
    }

    public int callCount() {
        return calls;
    }
}

