package ru.austeretony.counter.main;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.austeretony.counter.block.BlockCounter;

public class BlocksRegistry {

	public static final Block
	COUNTER = new BlockCounter("counter", Material.ROCK, 5.0F, 5.0F, SoundType.STONE).setCreativeTab(CounterMain.TILES);
	
	public static void register() {
		
		setBlockRegister(COUNTER);
		setItemBlockRegister(COUNTER);
        GameRegistry.registerTileEntity(((BlockCounter) COUNTER).getTileEntityClass(), COUNTER.getRegistryName().toString());
	}
	
    @SideOnly(Side.CLIENT)
    public static void registerRender() {
    	
    	setItemBlockRender(COUNTER);
    }
    
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
