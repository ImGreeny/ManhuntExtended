package pw.greeny.manhuntextended.listener;

import org.bukkit.ChatColor;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerPreLoginEvent;
import pw.greeny.manhuntextended.ManhuntExtended;

public class MainListener implements Listener {

    private final ManhuntExtended plugin;

    public MainListener(ManhuntExtended plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerSendingRequest(AsyncPlayerPreLoginEvent e) {
        if (plugin.getGameManager().hasGameStarted()) {
            e.setKickMessage(ChatColor.RED + "Game has already started!");
            e.setLoginResult(AsyncPlayerPreLoginEvent.Result.KICK_OTHER);
        }
    }

}
