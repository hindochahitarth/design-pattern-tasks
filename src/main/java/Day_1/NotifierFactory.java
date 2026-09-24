package Day_1;

public class NotifierFactory {
    public static Notifier getNotifier(String channel){
        NotificationConfig config=NotificationConfig.getInstance();

        return switch (channel.toLowerCase()){
            case "email" -> new EmailNotifier(config);
            case "sms" -> new SmsNotifier(config);
            case "push" -> new PushNotifier(config);
            default -> throw new IllegalArgumentException("Unknonw ");
        };
    }
}
