package org.demo;

import java.util.HashMap;
import java.util.Map;

public class NotificationConfig {
    private static final NotificationConfig INSTANCE=new NotificationConfig();

    private final Map<String,String> setting=new HashMap<>();

    private NotificationConfig(){
        System.out.println("Reading Configurations.... ");
        setting.put("email","://example.com");
        setting.put("sms","https://gateway.com");
        setting.put("push","firebase-key");
    }
    public static NotificationConfig getInstance(){
        return INSTANCE;
    }
    public String getSetting(String key){
        return setting.get(key);
    }
}
