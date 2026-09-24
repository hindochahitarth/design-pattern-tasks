package org.demo;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SimpleSingleton first=SimpleSingleton.getInstance();
        SimpleSingleton second=SimpleSingleton.getInstance();

        System.out.println(first==second);
        first.print();
        second.print();

        NotificationConfig notificationConfigfirst=NotificationConfig.getInstance();
        NotificationConfig notificationConfigSecond=NotificationConfig.getInstance();

        System.out.println(notificationConfigfirst.getSetting("email"));
        notificationConfigSecond.getSetting("SMS");

        Notifier mail=NotifierFactory.getNotifier("email");
        Notifier sms=NotifierFactory.getNotifier("sms");

        mail.send("Welcome ","user@example.com");
        sms.send("Login code is ----","+1234567890");
    }
}