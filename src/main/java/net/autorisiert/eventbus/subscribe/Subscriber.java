package net.autorisiert.eventbus.subscribe;

import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;
import net.autorisiert.eventbus.event.SimpleEvent;

/**
 *
 * @author Mike Boddin
 */
public class Subscriber extends AbstractEventListener{
    
    public Subscriber(EventBus eventBus) {
        super(eventBus);
    }
    
    @Subscribe
    public void handleSimpleEvent(SimpleEvent e){
        System.out.println(String.format("[%s] recieved SimpleEvent: %s", getSubscriberId(), e.getEventName()));
    }
    
}
