package com.design.patterns.behavioural.command.concretecomponent;

import com.design.patterns.behavioural.command.component.FileSystemReceiver;

public class UnixFileSystemReceiver implements FileSystemReceiver {
    @Override
    public void open() {
        System.out.println("UNIX : File open");
    }

    @Override
    public void write() {

        System.out.println("UNIX : File write");
    }

    @Override
    public void close() {

        System.out.println("UNIX : File close");
    }
}
