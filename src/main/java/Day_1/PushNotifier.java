package Day_1;

public class PushNotifier implements Notifier{
    private final String apikey;

    public PushNotifier(NotificationConfig config){
        this.apikey=config.getSetting("push");
    }
    @Override
    public void send(String message, String recipient) {
        System.out.println("Push alert sent to " + recipient + " with " + apikey + ": " + message);

    }
}
