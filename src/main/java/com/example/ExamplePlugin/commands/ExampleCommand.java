package com.example.ExamplePlugin.commands;

import dev.jorel.commandapi.CommandAPICommand;

public class ExampleCommand{
    private final CommandAPICommand command;

    public ExampleCommand() {
        command = new CommandAPICommand("example")
            .withSubcommand(new CommandAPICommand("hw")
                .withPermission("example.op")
                .executes(new HelloWorldCommand())
            );
    }
  
    public void register() {
        command.register();
    }
}
