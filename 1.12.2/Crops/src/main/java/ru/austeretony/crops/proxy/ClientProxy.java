package ru.austeretony.crops.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.austeretony.crops.main.BlocksRegistry;
import ru.austeretony.crops.main.ItemsRegistry;

public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    	super.preInit(event);    	
    	
    	BlocksRegistry.registerRender();
    	ItemsRegistry.registerRender();
    }

    public void init(FMLInitializationEvent event) {

    	super.init(event);   	    	
    }
}
