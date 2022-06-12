package net.athera.atherasurvival.core;

import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

import net.athera.atherasurvival.Main;
import net.athera.atherasurvival.listeners.BlockBreakListener;
import net.athera.atherasurvival.listeners.EntityDamageByEntityListener;
import net.athera.atherasurvival.listeners.PlayerDeathListener;
import net.athera.atherasurvival.listeners.PlayerInteractListener;
import net.athera.atherasurvival.listeners.PlayerItemConsumeListener;
import net.athera.atherasurvival.listeners.PlayerJoinListener;
import net.athera.atherasurvival.listeners.PlayerMoveListener;

/**
 * Centrally registers all events of the plugin
 * 
 * @author Jan
 */
public class ListenerController {
	
	public ListenerController() {
		registerListener(new BlockBreakListener());
		registerListener(new EntityDamageByEntityListener());
		registerListener(new PlayerInteractListener());
		registerListener(new PlayerItemConsumeListener());
		registerListener(new PlayerJoinListener());
		registerListener(new PlayerMoveListener());
		registerListener(new PlayerDeathListener());
	}
	
	/**
	 * Registers an listener
	 * @param listener Listener to be registered
	 */
	private void registerListener(Listener listener) {
		Bukkit.getServer().getPluginManager().registerEvents(listener, Main.getInstance());
	}
}
