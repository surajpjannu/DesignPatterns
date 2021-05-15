package com.design.patterns.behavioural.command.concretecomponent;

import com.design.patterns.behavioural.command.component.FileSystemReceiver;

public class WindowsFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void open() {
        System.out.println("WINDOWS : File open");
    }

    @Override
    public void write() {

        System.out.println("WINDOWS : File write");
    }

    @Override
    public void close() {

        System.out.println("WINDOWS : File close");
    }
}
