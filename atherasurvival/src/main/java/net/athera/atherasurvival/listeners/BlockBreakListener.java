package net.athera.atherasurvival.listeners;

import org.bukkit.Difficulty;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

import net.athera.atherasurvival.Main;
import net.athera.atherasurvival.util.enums.ExhaustionTypes;

/**
 * BlockBreakListener
 * 
 * @see org.bukkit.event.player.BlockBreakEvent
 * @author Jan
 */
public class BlockBreakListener implements Listener {

	@EventHandler
	public void onBlockBreak(BlockBreakEvent e) {
		if (e.getPlayer().getWorld().getDifficulty() == Difficulty.PEACEFUL || !Main.getPlayer(e.getPlayer().getUniqueId()).getThirstMode(Main.getPlayer(e.getPlayer().getUniqueId()))) return;
		// Add exhaustion for blockbreaks
		Main.getPlayer(e.getPlayer().getUniqueId()).addExhaustion(Main.getPlayer(e.getPlayer().getUniqueId()), ExhaustionTypes.BREAK_BLOCK);
	}
}
