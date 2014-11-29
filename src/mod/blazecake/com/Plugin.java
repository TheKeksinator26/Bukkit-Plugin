package mod.blazecake.com;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class Plugin extends JavaPlugin {
	
	@Override
	public boolean onCommand(CommandSender sender, Command cmd,	String label, String[] args) {

		//Umwandlung Sender -> Player
		Player p = null;
		if(sender instanceof Player){
			p = (Player) sender;
		}
		
		//Kommando "TEST"
		if(cmd.getName().equalsIgnoreCase("test")){
			
			if(p != null){
				String version = this.getDescription().getVersion();
				@SuppressWarnings("unused")
				String name = this.getDescription().getName();
				String mainauthor = this.getDescription().getAuthors().get(0);
				
				for(int i = 0; i < this.getDescription().getAuthors().size(); i++){
					
				}
					
				
				p.sendMessage(ChatColor.RED + "Hallo, " + p.getDisplayName());
				p.sendMessage(ChatColor.GREEN + "[BlazeCraft] Geladen.");
				p.sendMessage("Version; " + version);
				p.sendMessage("Eine Idee von: " + mainauthor);
				
				
				
			} else {
				sender.sendMessage(ChatColor.GREEN + "[BlazeCraft] Geladen.");
				return true;
			}
		}
		
		
		return false;
	}
	}


