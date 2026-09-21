package Day_5.state;

public class RedLightState implements TrafficLightState{
    @Override
    public void handleRequest(TrafficLightContext context) {
        System.out.println("Red Light : All vehicles must stop ...");
        context.setState(new GreenLightState());

    }
}
