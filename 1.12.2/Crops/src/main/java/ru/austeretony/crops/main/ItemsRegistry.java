package ru.austeretony.crops.main;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import ru.austeretony.crops.items.ItemCorn;
import ru.austeretony.crops.items.ItemCornSeeds;

public class ItemsRegistry {

	public static final Item
	CORN_SEED = new ItemCornSeeds("corn_seed").setCreativeTab(CropsMain.CROPS),
	CORN = new ItemCorn("corn", 2, 0.6F, false).setCreativeTab(CropsMain.CROPS);
	
    public static void register() {
    	
        setItemRegister(CORN_SEED);
        setItemRegister(CORN);
    }

    @SideOnly(Side.CLIENT)
    public static void registerRender() {
    	   
    	setItemRender(CORN_SEED);
    	setItemRender(CORN);
    }

    private static void setItemRegister(Item item) {
    	
        ForgeRegistries.ITEMS.register(item); 
    }

    @SideOnly(Side.CLIENT)
    private static void setItemRender(Item item) {
    	
    	ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(new ResourceLocation(CropsMain.MODID, item.getUnlocalizedName().substring(5)), "inventory"));
    }
}
