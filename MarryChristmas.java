package marrychristmasplugin.marrychristmasplugin;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

class MarryChristmas implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (command.getName().equalsIgnoreCase("modules")) {
            if (sender instanceof Player) {
                Player player = (Player) sender;
                player.sendMessage("Вы подключены к локализации!");
            } else {

                sender.sendMessage("Команду /modules можно использовать только в игре!");
            }
            return true;
        }
        return false;
    }
}
