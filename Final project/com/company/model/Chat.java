package com.company.model;

import java.util.ArrayList;

public class Chat {

    Person sender ;
    Person receiver;
    ArrayList<String> chat_list = new ArrayList<>() ;
    Boolean Block=false;

    public Person getSender() {
        return sender;
    }

    public Person getReceiver() {
        return receiver;
    }

    public ArrayList<String> getChat_list() {
        return chat_list;
    }

    public void setBlock(Boolean block) {
        Block = block;
    }
}
