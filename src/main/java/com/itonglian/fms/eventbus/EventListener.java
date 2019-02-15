package com.itonglian.fms.eventbus;

import com.google.common.eventbus.Subscribe;

public class EventListener {
    public int lastMessage = 0;

    @Subscribe
    public void listen(TestEvent event) {
        lastMessage = event.getMessage();
        System.out.println("Message:"+lastMessage);
    }
    @Subscribe
    public void listenInt(Integer event) {
        lastMessage = event;
        System.out.println("Message:"+event);
    }


    public int getLastMessage() {
        return lastMessage;
    }

}
