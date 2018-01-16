package me.gtoidz.myplugin;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class MyPlugin extends JavaPlugin {

  @Override
  public void onEnable(){
    Bukkit.getConsoleSender().sendMessage("MyPlugin has been enabled!");
  }

  @Override
  public void onDisable(){
    Bukkit.getConsoleSender().sendMessage("MyPlugin has been disabled!");
  }
  
  @Override
  public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args){
    Player player = (Player) sender;
    if(cmd.getName().equalsIgnoreCase("cmd"){
      player.sendMessage("Hello!");
    }
    return false;
  }
  
}
