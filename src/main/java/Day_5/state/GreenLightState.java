package Day_5.state;


public class GreenLightState implements TrafficLightState {
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Green Light : All vehicles can go...");
        context.setState(new YellowLightState());
    }
}
