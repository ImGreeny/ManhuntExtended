package pw.greeny.manhuntextended;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import pw.greeny.manhuntextended.core.managers.GameManager;

import java.util.logging.Level;

public final class ManhuntExtended extends JavaPlugin {

    private ManhuntExtended instance;
    private GameManager gameManager;

    @Override
    public void onEnable() {
        Bukkit.getLogger().log(Level.INFO, "Loading ManhuntExtended...");

        this.instance = this;

        gameManager = new GameManager(this);

        Bukkit.getLogger().log(Level.INFO, "ManhuntExtended loaded!");
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public ManhuntExtended getInstance() {
        return instance;
    }
}
