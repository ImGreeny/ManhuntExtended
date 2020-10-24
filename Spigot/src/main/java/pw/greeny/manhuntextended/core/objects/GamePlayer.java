package pw.greeny.manhuntextended.core.objects;

import org.bukkit.Location;
import org.bukkit.entity.Player;
import pw.greeny.manhuntextended.core.enums.PlayerRole;
import pw.greeny.manhuntextended.core.enums.PlayerState;

import java.util.UUID;

public class GamePlayer {

    private final Player player;
    private PlayerRole role;
    private PlayerState state;

    public GamePlayer(Player player) {
        this.player = player;
        this.role = PlayerRole.UNDEFINED;
        this.state = PlayerState.WAITING;
    }

    public GamePlayer(Player player, PlayerState state) {
        this.player = player;
        this.role = PlayerRole.UNDEFINED;
        this.state = state;
    }

    public GamePlayer(Player player, PlayerRole role) {
        this.player = player;
        this.role = role;
        this.state = PlayerState.WAITING;
    }

    public GamePlayer(Player player, PlayerRole role, PlayerState state) {
        this.player = player;
        this.role = role;
        this.state = state;
    }

    public Player getPlayer() {
        return player;
    }

    public PlayerRole getRole() {
        return role;
    }

    public PlayerState getState() {
        return state;
    }


    public void setRole(PlayerRole role) {
        this.role = role;
    }

    public void setState(PlayerState state) {
        this.state = state;
    }


    public Boolean isDead() {
        return state == PlayerState.DEAD;
    }

    public Boolean isAlive() {
        return state == PlayerState.ALIVE;
    }

    public Boolean isHunter() {
        return role == PlayerRole.HUNTER;
    }

    public Boolean isHunted() {
        return role == PlayerRole.HUNTED;
    }

    public Boolean isSpectator() {
        return role == PlayerRole.SPECTATOR;
    }

    public Boolean isSpectator(Boolean checkOnState) {
        if (checkOnState) {
            return state == PlayerState.SPECTATOR;
        }
        return role == PlayerRole.SPECTATOR;
    }

    // Wrapper (To make things easier)

    public String getDisplayName() {
        return player.getDisplayName();
    }

    public String getName() {
        return player.getName();
    }

    public UUID getUniqueUUID() {
        return player.getUniqueId();
    }

    public UUID getUUID() {
        return player.getUniqueId();
    }

    public void teleport(Location loc) {
        player.teleport(loc);
    }

}
