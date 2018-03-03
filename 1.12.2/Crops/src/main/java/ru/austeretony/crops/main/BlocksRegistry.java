package ru.austeretony.crops.main;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.austeretony.crops.block.BlockCropCorn;

public class BlocksRegistry {

	public static final Block
	CROP_CORN = new BlockCropCorn("crop_corn");
	
	public static void register() {
		
		setBlockRegister(CROP_CORN);
	}
	
    @SideOnly(Side.CLIENT)
    public static void registerRender() {}
    
    private static void setBlockRegister(Block block) {
    	
        ForgeRegistries.BLOCKS.register(block);        
    }
    
    private static void setItemBlockRegister(Block block) {
    	
        ForgeRegistries.ITEMS.register(new ItemBlock(block).setRegistryName(block.getRegistryName()));
    }
    
    @SideOnly(Side.CLIENT)
    private static void setItemBlockRender(Block block) {
    	
    	ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));
    }
}
