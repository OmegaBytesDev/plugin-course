package me.gtoidz.myplugin;

import org.bukkit.plugin.java.JavaPlugin;

public class MyPlugin extends JavaPlugin {

  @Override
  public void onEnable(){
    Bukkit.getConsoleSender().sendMessage("MyPlugin has been enabled!");
  }

  @Override
  public void onDisable(){
    Bukkit.getConsoleSender().sendMessage("MyPlugin has been disabled!");
  }
  
}
