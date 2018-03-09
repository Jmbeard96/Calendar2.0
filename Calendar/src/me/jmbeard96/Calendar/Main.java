package me.jmbeard96.Calendar;

import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin {

	@Override
	public void onEnable() {
		System.out.println(this.getServer().getWorld("world").getFullTime());
		
		
	}
	
	@Override
	public void onDisable() {
		
	}
}
