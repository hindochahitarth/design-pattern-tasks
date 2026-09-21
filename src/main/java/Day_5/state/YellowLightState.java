package Day_5.state;

public class YellowLightState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Yellow Light : All vehicles should prepare to stop");
        context.setState(new RedLightState());
    }
}
