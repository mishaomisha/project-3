package com.company.model;

public class Block {

    Person receiver;
    Person sender;
    Boolean Block=false;

    public Block(){

    }

    public Person getReceiver() {
        return receiver;
    }

    public void setReceiver(Person receiver) {
        this.receiver = receiver;
    }

    public Person getSender() {
        return sender;
    }

    public void setSender(Person sender) {
        this.sender = sender;
    }

    public Boolean getBlock() {
        return Block;
    }

    public void setBlock(Boolean block) {
        Block = block;
    }
}
