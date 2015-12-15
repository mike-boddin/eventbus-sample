package net.autorisiert.eventbus.publish;

import com.google.common.eventbus.EventBus;
import net.autorisiert.eventbus.event.SimpleEvent;

/**
 *
 * @author Mike Boddin
 */
public class Publisher {
    private final EventBus eventBus;

    public Publisher(EventBus eventBus) {
        this.eventBus = eventBus;
    }
    
    public void publishSimpleEvent(){
        eventBus.post(SimpleEvent.newInstance());
    }
    
}
