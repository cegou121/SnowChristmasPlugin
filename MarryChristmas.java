package marrychristmasplugin.marrychristmasplugin;

import org.bukkit.Bukkit;
import org.bukkit.Effect;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class SnowchristmasPlugin implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("snow")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                if (player.hasPermission("snowplugin.use")) {
                    startSnowEffect(player);
                    return true;
                } else {
                    player.sendMessage("You don't have permission to use this command.");
                    return false;
                }
            } else {
                sender.sendMessage("This command can only be executed by a player.");
                return false;
            }
        }
        return false;
    }

    private void startSnowEffect(Player player) {
        player.getWorld().playEffect(player.getLocation(), Effect.SNOW_SHOVEL, 1);
        player.getWorld().playEffect(player.getLocation(), Effect.SNOWBALL_BREAK, 8);
        player.getWorld().playEffect(player.getLocation(), Effect.SNOWBALL_BREAK, 9);
    }
}


public class SnowPluginExample {
    public static void main(String[] args) {
        
        Bukkit.getPluginCommand("snow").setExecutor(new SnowPlugin());
    }
}
