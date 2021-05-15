package com.design.patterns.behavioural.command.concretecommand;

import com.design.patterns.behavioural.command.command.FileSystemCommand;
import com.design.patterns.behavioural.command.component.FileSystemReceiver;

public class CloseFileSystemCommand implements FileSystemCommand {

    private FileSystemReceiver fileSystemReceiver;

    public CloseFileSystemCommand(FileSystemReceiver unixFileSystemReceiver) {
        this.fileSystemReceiver = unixFileSystemReceiver;
    }

    @Override
    public void execute() {
        fileSystemReceiver.close();
    }
}
