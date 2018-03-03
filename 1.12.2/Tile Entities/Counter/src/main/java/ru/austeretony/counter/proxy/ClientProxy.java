package ru.austeretony.counter.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.austeretony.counter.main.BlocksRegistry;

public class ClientProxy extends CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {

    	super.preInit(event);    	
    	
    	BlocksRegistry.registerRender();
    }

    public void init(FMLInitializationEvent event) {

    	super.init(event);   	    	
    }
}
