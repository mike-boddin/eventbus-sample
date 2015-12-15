package net.autorisiert.eventbus.subscribe;

import com.google.common.eventbus.DeadEvent;
import com.google.common.eventbus.EventBus;
import com.google.common.eventbus.Subscribe;

/**
 *
 * @author Mike Boddin
 */
public class DeadEventListener extends AbstractEventListener{

    public DeadEventListener(EventBus eventBus) {
        super(eventBus);
    }

    @Subscribe
    public void handleDeadEvent(DeadEvent e){
        Object deadEvent = e.getEvent();
        System.out.println(String.format("[%s] recieved dead letterd event: %s", getSubscriberId(), deadEvent.toString()));
    }
}
