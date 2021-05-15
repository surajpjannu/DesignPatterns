package com.design.patterns.behavioural.mediator;

public interface IChatRoomMediator
{
    public void sendMessage(String msg, String userId);
 
    void addUser(User user);
}