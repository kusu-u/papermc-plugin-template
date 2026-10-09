package com.example.ExamplePlugin.commands;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import dev.jorel.commandapi.executors.CommandArguments;
import dev.jorel.commandapi.executors.CommandExecutor;
import net.kyori.adventure.text.Component;

public class HelloWorldCommand implements CommandExecutor {
    public HelloWorldCommand() {}

    @Override
    public void run(CommandSender sender, CommandArguments args) {
        Bukkit.broadcast(Component.text("Hello world!"));
    }
}