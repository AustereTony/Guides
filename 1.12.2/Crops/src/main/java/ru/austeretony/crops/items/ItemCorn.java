package ru.austeretony.crops.items;

import net.minecraft.item.ItemFood;

public class ItemCorn extends ItemFood {

    public ItemCorn(String name, int hungerPointsRestoration, float staturationPointsRestoration, boolean isSuitableForWolves) {
  		
    	super(hungerPointsRestoration, staturationPointsRestoration, isSuitableForWolves);
    	
	    this.setUnlocalizedName(name);
	    this.setRegistryName(name);
	}
}
