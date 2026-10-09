package com.example.ExamplePlugin;

import org.bukkit.plugin.java.JavaPlugin;

import com.example.ExamplePlugin.commands.ExampleCommand;

import dev.jorel.commandapi.CommandAPI;
import dev.jorel.commandapi.CommandAPIPaperConfig;

public class ExamplePlugin extends JavaPlugin {
    @Override
    public void onLoad() {
        CommandAPI.onLoad(new CommandAPIPaperConfig(this));
    }

    @Override 
    public void onEnable() {
        CommandAPI.onEnable();

        var pm = getServer().getPluginManager();
        
        new ExampleCommand().register();
    }

    @Override 
    public void onDisable() {
        CommandAPI.onDisable();
    }
}