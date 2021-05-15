package com.design.patterns.behavioural.observer;

public class Youtube {
    public static void main(String[] args) {
        Channel channel = new Channel();

        Observer subscriber1 = new Subscriber("subscriber1");
        Observer subscriber2 = new Subscriber("subscriber2");
        Observer subscriber3 = new Subscriber("subscriber3");
        Observer subscriber4 = new Subscriber("subscriber4");
        Observer subscriber5 = new Subscriber("subscriber5");

        channel.subscribe(subscriber1);
        channel.subscribe(subscriber2);
        channel.subscribe(subscriber3);
        channel.subscribe(subscriber4);
        channel.subscribe(subscriber5);


        channel.unsubscribe(subscriber3);

        channel.uploadVideo("Design Pattern Tutorial!");
    }
}
