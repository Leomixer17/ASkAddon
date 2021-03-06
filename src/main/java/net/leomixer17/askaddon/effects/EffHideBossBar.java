package net.leomixer17.askaddon.effects;

import ch.njol.skript.lang.Effect;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import org.bukkit.boss.BossBar;
import org.bukkit.event.Event;
import org.bukkit.event.Listener;

public class EffHideBossBar extends Effect implements Listener {

    private Expression<BossBar> bar;

    protected void execute(Event event)
    {
        ((BossBar) this.bar.getSingle(event)).setVisible(false);
    }

    public String toString(Event event, boolean b)
    {
        return "Hide Boss Bar";
    }

    @SuppressWarnings("unchecked")
    @Override
    public boolean init(Expression<?>[] exprs, int i, Kleenean kleenean, ParseResult parseResult)
    {
        this.bar = (Expression<BossBar>) exprs[0];
        return true;
    }

}