package com.design.patterns.behavioural.command;

import com.design.patterns.behavioural.command.concretecommand.CloseFileSystemCommand;
import com.design.patterns.behavioural.command.concretecommand.OpenFileSystemCommand;
import com.design.patterns.behavioural.command.concretecommand.WriteFileSystemCommand;
import com.design.patterns.behavioural.command.concretecomponent.UnixFileSystemReceiver;
import com.design.patterns.behavioural.command.concretecomponent.WindowsFileSystemReceiver;

public class Client {
    public static void main(String[] args) {
        //1. Windows FileSystem
        WindowsFileSystemReceiver windowsFileSystemReceiver = new WindowsFileSystemReceiver();

        new OpenFileSystemCommand(windowsFileSystemReceiver).execute();
        new WriteFileSystemCommand(windowsFileSystemReceiver).execute();
        new CloseFileSystemCommand(windowsFileSystemReceiver).execute();

        //2. Unix FileSystem
        UnixFileSystemReceiver unixFileSystemReceiver = new UnixFileSystemReceiver();

        new OpenFileSystemCommand(unixFileSystemReceiver).execute();
        new WriteFileSystemCommand(unixFileSystemReceiver).execute();
        new CloseFileSystemCommand(unixFileSystemReceiver).execute();
    }
}
