package pw.greeny.manhuntextended.core.enums;

import org.bukkit.ChatColor;

public enum PlayerRole {

    HUNTER(0, "Hunter", ChatColor.DARK_RED),
    HUNTED(1, "Hunted", ChatColor.BLUE),
    SPECTATOR(2, "Spectator", ChatColor.GRAY),
    UNDEFINED(3, "Not Choosed", ChatColor.GOLD);

    private int id;
    private String name;
    private ChatColor color;

    PlayerRole(int id, String name, ChatColor color) {
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
