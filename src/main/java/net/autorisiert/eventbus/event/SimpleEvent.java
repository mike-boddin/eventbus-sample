package net.autorisiert.eventbus.event;

import java.util.UUID;

/**
 *
 * @author Mike Boddin
 */
public class SimpleEvent {
    private final String eventName;
    
    private SimpleEvent(){
        this.eventName = UUID.randomUUID().toString();
    }
    
    public static SimpleEvent newInstance(){
        return new SimpleEvent();
    }

    public String getEventName() {
        return eventName;
    }
    
}
