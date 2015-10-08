package com.example.michael.datastructure.utilities.notificationsystem;

/**
 * Abstract class that describes a subscriber.
 * @author  Michael Gulenko. Created on 09/06/2015
 */
public abstract class Subscriber
{
    /**
     * Subscribes to receive specified message
     * @param messageId - message identification that is used for subscription
     */
    public void subscribe(int messageId)
    {
        Dispatcher.getInstance().subscribe(messageId, this);
    }

    /**
     * Unsubscribes from receiving specified message
     * @param messageId - message identification that is use to unsubscribe
     */
    public void unsubscribe(int messageId)
    {
        Dispatcher.getInstance().unsubscribe(messageId, this);
    }

    /**
     * Gets invoked to receive a message
     * @param message - received message. Never null.
     */
    public abstract void onNotify(SystemMessage message);

}
