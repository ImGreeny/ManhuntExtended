package pw.greeny.manhuntextended.core.managers;

import pw.greeny.manhuntextended.ManhuntExtended;
import pw.greeny.manhuntextended.game.managers.ConfigManager;
import pw.greeny.manhuntextended.game.managers.PlayersManager;
import pw.greeny.manhuntextended.game.managers.WorldsManager;

public class GameManager {

    private final ManhuntExtended plugin;
    private WorldsManager worldsManager;
    private PlayersManager playersManager;
    private ConfigManager configManager;

    public GameManager(ManhuntExtended plugin) {
        this.plugin = plugin;
        playersManager = new PlayersManager(plugin);
        worldsManager = new WorldsManager(plugin);
        configManager = new ConfigManager(plugin);
    }

    public WorldsManager getWorldsManager() {
        return worldsManager;
    }

    public PlayersManager getPlayersManager() {
        return playersManager;
    }

    public ConfigManager getConfigManager() {
        return configManager;
    }
}
