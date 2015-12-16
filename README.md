# eventbus-sample
A small application to understand ``com.google.common.eventbus.EventBus``

## Projectstructure

__net.autorisiert.eventbus__  

* ``Application``: the main class  
    Here are some Subscriber created and two events will be published
    
__net.autorisiert.eventbus.event__

* ``SimpleEvent``: A well known Event, which is consumed by ``Subscriber``

__net.autorisiert.eventbus.publish__

* ``Publisher``: A class to publish ``SimpleEvent``
 
__net.autorisiert.eventbus.subscribe__

* ``AbstractEventListener``: encapsulates the registration to the *EventBus*  
    also creates an unique *subscriberId* (which can be used for debugging purpose)
* ``DeadEventListener``: listens to all dead-lettered events
* ``Subscriber``: simple class to receive *SimpleEvent* objects