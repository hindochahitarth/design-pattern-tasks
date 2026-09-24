package Day_1;

public class EmailNotifier implements Notifier{
    private final String smtpServer;
    public EmailNotifier(NotificationConfig config){
        this.smtpServer=config.getSetting("email");
    }
    @Override
    public void send(String message, String recipient) {
        System.out.println("Email sent to "+recipient+"via "+smtpServer+" - "+message);

    }
}