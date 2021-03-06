package net.leomixer17.askaddon.conditions;

import ch.njol.skript.lang.Condition;
import ch.njol.skript.lang.Expression;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import ch.njol.util.Kleenean;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.potion.PotionEffectType;
import org.eclipse.jdt.annotation.Nullable;

public class CondHasPotionEffect extends Condition {

    private Expression<Player> player;
    private Expression<PotionEffectType> effect;
    private boolean b;

    @SuppressWarnings("unchecked")
    @Override
    public boolean init(Expression<?>[] exprs, int i, Kleenean arg2, ParseResult arg3)
    {
        this.player = (Expression<Player>) exprs[0];
        this.effect = (Expression<PotionEffectType>) exprs[1];
        this.b = i == 0;
        return true;
    }

    @Override
    public String toString(@Nullable Event e, boolean arg1)
    {
        return "player has potion effect";
    }

    @Override
    public boolean check(Event e)
    {
        return this.b ? this.player.getSingle(e).hasPotionEffect(this.effect.getSingle(e)) : !this.player.getSingle(e).hasPotionEffect(this.effect.getSingle(e));
    }

}
