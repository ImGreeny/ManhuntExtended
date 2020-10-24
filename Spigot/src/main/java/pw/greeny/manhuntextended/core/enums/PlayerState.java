package pw.greeny.manhuntextended.core.enums;

import org.bukkit.ChatColor;

public enum PlayerState {

    ALIVE(0, "Alive", ChatColor.GREEN),
    DEAD(1, "Dead", ChatColor.RED),
    SPECTATOR(2, "Spectator", ChatColor.GRAY),
    WAITING(3, "Waiting", ChatColor.GOLD);

    private int id;
    private String name;
    private ChatColor color;

    PlayerState(int id, String name, ChatColor color) {
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
