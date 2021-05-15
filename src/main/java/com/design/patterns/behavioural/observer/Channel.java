package com.design.patterns.behavioural.observer;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class Channel implements Subject {
    private List<Observer> subscribers = new ArrayList<>();

    @Override
    public void subscribe(Observer subscriber) {
        subscribers.add(subscriber);
    }
    @Override
    public void unsubscribe(Observer subscriber) {
        subscribers.remove(subscriber);
    }
    @Override
    public void uploadVideo(String videoTitle) {
        System.out.println(videoTitle + " Video uploaded....");
        notifyVideoUpload(videoTitle);
    }

    private void notifyVideoUpload(String videoTitle) {
        subscribers.parallelStream().forEach(subscriber -> subscriber.upload(videoTitle));
    }
}
