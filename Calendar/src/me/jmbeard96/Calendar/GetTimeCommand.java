package me.jmbeard96.Calendar;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class GetTimeCommand implements CommandExecutor{

	public enum Months{
		JANUARY,
		FEBRUARY,
		MARCH,
		APRIL,
		MAY,
		JUNE,
		JULY,
		AUGUST,
		SEPTEMBER,
		OCTOBER,
		NOVEMBER,
		DECEMBER
	}
	
	public Months assignMonth(int day) {
		Months month;
		if(day <= 31) {
			
		}
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player)sender;
			
			long ticks = p.getWorld().getFullTime();
			
			boolean isLeapYear;
			
			int year;
			int month;
			int day = (int) (ticks / 24000);
			int hour = (int) (ticks % 24000 * 24);
			int minute = (int) (((ticks % 24000 * 24) - hour) * 60);
			
			if(year % 4 == 0 && year % 100 == 0 && year % 400 == 0) {
				isLeapYear = true;
			}
			else if(year % 4 == 0 && year % 100 == 0 && year % 400 != 0) {
				isLeapYear = false;
			}
			else if(year % 4 == 0 && year % 100 != 0) {
				isLeapYear = true;
			}
			else if(year % 4 != 0) {
				isLeapYear = false;
			}
			
			
			
			
		}
		
		return false;
	}

}
