package hu.bandibandus10.joinleavee;

import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

public final class Main extends JavaPlugin implements Listener {

    @Override
    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
        System.out.println("JOINLEAVE --> Made by github.com/bandibandus10 OPEN SOURCE!");
        System.out.println("JOINLEAVE --> Version:" + getDescription().getVersion());

    }

    @Override
    public void onDisable() {
        System.out.println("JOINLEAVE --> disabling the plugin!");
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent event) {
        Player player = event.getPlayer();
        player.sendMessage(ChatColor.RED +"Welcome " + player.getName() + " to the server!");
    }
}
