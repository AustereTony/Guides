package ru.austeretony.crops.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.austeretony.crops.main.BlocksRegistry;
import ru.austeretony.crops.main.ItemsRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    	
    	BlocksRegistry.register();
    	ItemsRegistry.register();
    }

    public void init(FMLInitializationEvent event) {}
}
