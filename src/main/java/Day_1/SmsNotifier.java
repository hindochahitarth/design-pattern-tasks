package org.demo;

public class SmsNotifier implements Notifier{
    private final String gateway;

    public SmsNotifier(NotificationConfig config){
        this.gateway=config.getSetting("sms");
    }
    @Override
    public void send(String message, String recipient) {
        System.out.println("SMS sent to " + recipient + " via " + gateway + ": " + message);

    }
}
