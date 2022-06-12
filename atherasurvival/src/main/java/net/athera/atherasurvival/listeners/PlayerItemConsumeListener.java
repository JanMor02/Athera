package net.athera.atherasurvival.listeners;

import org.bukkit.Difficulty;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerItemConsumeEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

import net.athera.atherasurvival.Main;
import net.athera.atherasurvival.util.Baseplayer;
import net.athera.atherasurvival.util.DrinkItems;
import net.athera.atherasurvival.util.enums.Qualities;

/**
 * PlayerItemConsumeListener
 * 
 * @see org.bukkit.event.player.PlayerItemConsumeEvent
 * @author Jan
 */
public class PlayerItemConsumeListener implements Listener {

	@EventHandler
	public void onPlayerConsume(PlayerItemConsumeEvent e) {
		Baseplayer bp = Main.getPlayer(e.getPlayer().getUniqueId());

		if (bp.getPlayer().getWorld().getDifficulty() == Difficulty.PEACEFUL || !bp.getThirstMode(bp)) return;
		if (e.getItem().getType() == Material.POTION) {
			if (DrinkItems.lores.contains(e.getItem().getItemMeta().getLore().get(0))) {
				String lore = e.getItem().getItemMeta().getLore().get(0).split(" ")[2].replaceAll("ùc", "").replaceAll("ùa", "");
				System.out.println("var quality: " + lore);
	

				// Salty
				if (lore.contains("Salzig")) {
					bp.drink(bp, Qualities.SALTY_WATER, new PotionEffect(PotionEffectType.HUNGER, 600, 1));
					// Dirty
				} else if (lore.contains("Schmutzig")) {
					bp.drink(bp, Qualities.DIRTY_WATER, new PotionEffect(PotionEffectType.CONFUSION, 100, 1));
					// Boiled
				} else if (lore.contains("Abgekocht")) {
					bp.drink(bp, Qualities.BOILED_WATER, null);
					// Pure
				} else if (lore.contains("Rein")) {
					bp.drink(bp, Qualities.PURE_WATER, new PotionEffect(PotionEffectType.REGENERATION, 100, 1));
				}
			}
		}
	}
}
