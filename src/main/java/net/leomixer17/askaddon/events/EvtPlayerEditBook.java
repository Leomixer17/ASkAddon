package net.leomixer17.askaddon.events;

import ch.njol.skript.lang.Literal;
import ch.njol.skript.lang.SkriptEvent;
import ch.njol.skript.lang.SkriptParser.ParseResult;
import org.bukkit.event.Event;
import org.bukkit.event.player.PlayerEditBookEvent;

import javax.annotation.Nullable;

public class EvtPlayerEditBook extends SkriptEvent {
	
	@Override
	public String toString(@Nullable Event event, boolean arg1)
	{
		return null;
	}
	
	@Override
	public boolean check(Event event)
	{
		return (event instanceof PlayerEditBookEvent);
	}
	
	@Override
	public boolean init(Literal<?>[] arg0, int i, ParseResult arg2)
	{
		return true;
	}
	
}