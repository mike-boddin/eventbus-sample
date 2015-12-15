package net.autorisiert.eventbus;

import com.google.common.eventbus.EventBus;
import net.autorisiert.eventbus.publish.Publisher;
import net.autorisiert.eventbus.subscribe.DeadEventListener;
import net.autorisiert.eventbus.subscribe.Subscriber;

/**
 *
 * @author Mike Boddin
 */
public class Application {
    
    private static final int SUBSCRIBER_COUNT = 10;
    private static final EventBus EVENT_BUS = new EventBus();
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=0; i<SUBSCRIBER_COUNT; i++){
            Subscriber subscriber = new Subscriber(eventBus());
        }
        DeadEventListener deadEventListener = new DeadEventListener(eventBus());
        Publisher publisher = new Publisher(eventBus());
        publisher.publishSimpleEvent();
        Object o = new Object();
        System.out.println("created Object: " + o.toString());
        eventBus().post(o);
    }
    
    public static EventBus eventBus(){
        return EVENT_BUS;
    }
    
}
