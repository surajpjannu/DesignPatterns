package com.design.patterns.behavioural.memento;

import java.util.ArrayList;
import java.util.List;

public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state) {
        mementoList.add(state);
    }

    public Memento undo() {
        int size = mementoList.size() - 1;
        Memento memento = mementoList.get(size);
        mementoList.remove(size);
        return memento;
    }
}