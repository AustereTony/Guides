package ru.austeretony.counter.main.tab;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import ru.austeretony.counter.main.BlocksRegistry;

public class TabTiles extends CreativeTabs {

	public TabTiles(int index, String label) {
		
		super(index, label);
	}

	@Override
	public ItemStack getTabIconItem() {
		
		return new ItemStack(Item.getItemFromBlock(BlocksRegistry.COUNTER));
	}
}
