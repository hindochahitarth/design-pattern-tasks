package Day_5.state;

public class Main {
    public static void main(String[] args) {
        TrafficLightContext trafficLightContext=new TrafficLightContext();
        for(int i=0;i<8;i++){
            trafficLightContext.changeLight();
            System.out.println();
        }
    }
}
