package com.design.patterns.behavioural.mediator;

public abstract class User
{
    private IChatRoomMediator mediator;
     
    private String id;
    private String name;
     
    public User(IChatRoomMediator room, String id, String name){
        this.mediator = room;
        this.name = name;
        this.id = id;
    }
     
    public abstract void send(String msg, String userId);
    public abstract void receive(String msg);
 
    public IChatRoomMediator getMediator() {
        return mediator;
    }
 
    public String getId() {
        return id;
    }
 
    public String getName() {
        return name;
    }
}