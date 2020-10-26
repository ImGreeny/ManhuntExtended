package pw.greeny.manhuntextended;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pw.greeny.manhuntextended.core.managers.GameManager;
import pw.greeny.manhuntextended.listener.ConfigListener;
import pw.greeny.manhuntextended.listener.LobbyListener;
import pw.greeny.manhuntextended.listener.MainListener;

import java.util.logging.Level;

public final class ManhuntExtended extends JavaPlugin {

    private ManhuntExtended instance;
    private GameManager gameManager;

    @Override
    public void onEnable() {
        Bukkit.getLogger().log(Level.INFO, "Loading ManhuntExtended...");

        this.instance = this;

        gameManager = new GameManager(this);

        Bukkit.getPluginManager().registerEvents(new MainListener(this), this);
        Bukkit.getPluginManager().registerEvents(new LobbyListener(this), this);
        Bukkit.getPluginManager().registerEvents(new ConfigListener(this), this);

        Bukkit.getLogger().log(Level.INFO, "ManhuntExtended loaded!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public ManhuntExtended getInstance() {
        return instance;
    }

    public GameManager getGameManager() {
        return gameManager;
    }
}
