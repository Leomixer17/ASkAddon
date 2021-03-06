package net.leomixer17.askaddon.effects;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import org.bukkit.boss.BossBar;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;

public class EffAddPlayerToBossBar extends Effect implements Listener {

    private Expression<BossBar> bar;
    private Expression<Player> player;

    protected void execute(Event event)
    {
        ((BossBar) this.bar.getSingle(event)).addPlayer((Player) this.player.getSingle(event));
    }

    public String toString(Event event, boolean b)
    {
        return "Add Player to Boss Bar";
    }

    @SuppressWarnings("unchecked")
    public boolean init(Expression<?>[] exprs, int i, Kleenean kleenean, ParseResult parseResult)
    {
        this.bar = (Expression<BossBar>) exprs[1];
        this.player = (Expression<Player>) exprs[0];
        return true;
    }

}