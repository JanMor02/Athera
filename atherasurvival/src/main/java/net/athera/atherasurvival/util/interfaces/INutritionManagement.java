package net.athera.atherasurvival.util.interfaces;

import org.bukkit.potion.PotionEffect;

import net.athera.atherasurvival.util.Baseplayer;
import net.athera.atherasurvival.util.enums.Qualities;
import net.athera.atherasurvival.util.enums.ExhaustionTypes;


public interface INutritionManagement {

	public void drink(Baseplayer bp, Qualities drink, PotionEffect effect);
	
	public void toggleThirstMode(Baseplayer bp);
	
	public boolean getThirstMode(Baseplayer bp);

	public void addExhaustion(Baseplayer bp, ExhaustionTypes exhaustion);
	public double getExhaustion(Baseplayer bp);

	public int getDrinkPoints(Baseplayer bp);
	public int getSaturation(Baseplayer bp);
	
	public void resetAfterDeath(Baseplayer bp);
}
