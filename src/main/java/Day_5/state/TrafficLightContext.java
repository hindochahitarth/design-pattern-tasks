package Day_5.state;

public class TrafficLightContext {
    private TrafficLightState currentState;

    public TrafficLightContext(){

        this.currentState=new RedLightState();
    }
    public void setState(TrafficLightState state){

        this.currentState=state;
    }
    public void changeLight(){
        currentState.handleRequest(this);

    }
}
