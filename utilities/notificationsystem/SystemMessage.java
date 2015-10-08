package com.example.michael.datastructure.utilities.notificationsystem;

/**
 * Abstract class that describe a single message.
 * It uses {@link Dispatcher} class to notify all subscribed
 * to a particular message classes.
 * @author  Michael Gulenko. Created on 09/06/2015
 */
public abstract class SystemMessage
{
    /**
     * Unique message identifier. Can't be < 1.
     */
    public final int ID;

    /**
     * Constructs SystemMessage object with specified messgae identifier
     * @param messageId - unique message identifier. can't be < 1
     */
    public SystemMessage(int messageId)
    {
        assert(messageId > 0);
        ID = messageId;
    }

    /**
     * Returns a message id
     * @return - message id
     */
    public int getId()
    {
        return ID;
    }


}


