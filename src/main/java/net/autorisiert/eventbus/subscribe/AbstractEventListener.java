package net.autorisiert.eventbus.subscribe;

import com.google.common.eventbus.EventBus;
import java.util.UUID;
import javax.annotation.PostConstruct;

/**
 *
 * @author Mike Boddin
 */
public abstract class AbstractEventListener {
    private final EventBus eventBus;
    private final String subscriberId;

    public AbstractEventListener(EventBus eventBus) {
        this.eventBus = eventBus;
        this.subscriberId = UUID.randomUUID().toString();
        init();
    }
    
    @PostConstruct
    private void init(){
        this.eventBus.register(this);
    }
    
    public String getSubscriberId() {
        return subscriberId;
    }
    
}
