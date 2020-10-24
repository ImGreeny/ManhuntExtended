package pw.greeny.manhuntextended.game.enums;

import org.bukkit.ChatColor;

public enum GameState {

    LOBBY(0, "Lobby", ChatColor.GOLD),;

    private int id;
    private String name;
    private ChatColor color;

    GameState(int id, String name, ChatColor color) {
        this.id = id;
        this.name = name;
        this.color = color;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ChatColor getColor() {
        return color;
    }
}
