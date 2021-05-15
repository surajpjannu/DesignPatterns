package com.design.patterns.behavioural.observer;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Subscriber implements Observer {

    private String name;

    @Override
    public void upload(String title) {
        System.out.println(name + " CheckOut the Uploaded video ...  " + title);
    }
}
