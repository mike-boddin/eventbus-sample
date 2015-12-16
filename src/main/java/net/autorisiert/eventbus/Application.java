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
        //create some subscriber
        for(int i=0; i<SUBSCRIBER_COUNT; i++){
            Subscriber subscriber = new Subscriber(eventBus());
        }
        //create a subscriber for dead lettered events
        new DeadEventListener(eventBus());
        //create a publisher
        Publisher publisher = new Publisher(eventBus());
        //publish an event
        publisher.publishSimpleEvent();
        //create another event, which will be dead-lettered
        Object o = new Object();
        System.out.println("created Object: " + o.toString());
        //... and post it
        eventBus().post(o);
    }
    
    public static EventBus eventBus(){
        return EVENT_BUS;
    }
    
}
