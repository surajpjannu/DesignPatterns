package com.design.patterns.behavioural.command.concretecommand;

import com.design.patterns.behavioural.command.command.FileSystemCommand;
import com.design.patterns.behavioural.command.component.FileSystemReceiver;

public class WriteFileSystemCommand implements FileSystemCommand {

    private FileSystemReceiver fileSystemReceiver;

    public WriteFileSystemCommand(FileSystemReceiver unixFileSystemReceiver) {
        this.fileSystemReceiver = unixFileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.write();
    }
}
