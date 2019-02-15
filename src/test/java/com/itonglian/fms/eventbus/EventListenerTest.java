package com.itonglian.fms.eventbus;

import com.google.common.eventbus.EventBus;
import org.junit.Test;

import static org.junit.Assert.*;

public class EventListenerTest {

    @Test
    public void listen() {
        EventBus eventBus = new EventBus("test");
        EventListener listener = new EventListener();
        eventBus.register(listener);

        eventBus.post(new TestEvent(200));
        eventBus.post(new TestEvent(300));
        eventBus.post(new TestEvent(400));
        eventBus.post(new Integer(666));

        assertEquals(666,listener.getLastMessage());
    }

    @Test
    public void listenInt() {
    }
}