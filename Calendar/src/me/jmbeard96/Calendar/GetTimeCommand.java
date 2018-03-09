package me.jmbeard96.Calendar;

import java.time.Month;

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
	
	public Months assignMonth(int day, boolean isLeapYear) {
		Months month;
		if(day <= 31) {
			month = Month.JANUARY;
		}
		else if(day > 31 && day <=)
	}
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd, String arg, String[] args) {
		
		if(sender instanceof Player) {
			Player p = (Player)sender;
			
			double ticks = p.getWorld().getFullTime();
			
			boolean isLeapYear;
			
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
			
			double day = Math.floor(ticks / 24000);
			double year = Math.floor(day / 365.25);
			double dayOfYear = Math.floor(((day / 365.25) - year) * 365.25);
			Month month = assignMonth(dayOfYear, isLeapYear);
			double hour = Math.floor((ticks / 24000) - day) * 24);
			double minute = Math.floor(((((ticks / 24000) - day) * 24) - hour) * 60);
			double second = Math.floor(((((((ticks / 24000) - day) * 24) - hour) * 60) - minute) * 60);
			
			
			
			
			
			
		}
		
		return false;
	}

}
