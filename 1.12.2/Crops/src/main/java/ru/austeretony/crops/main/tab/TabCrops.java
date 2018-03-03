package ru.austeretony.crops.main.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import ru.austeretony.crops.main.ItemsRegistry;

public class TabCrops extends CreativeTabs {

	public TabCrops(int index, String label) {
		
		super(index, label);
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(ItemsRegistry.CORN);
	}
}
