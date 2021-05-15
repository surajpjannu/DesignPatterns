package com.design.patterns.behavioural.observer;

public interface Subject {

    void subscribe(Observer subscriber);

    void unsubscribe(Observer subscriber);

    void uploadVideo(String videoTitle);
}
