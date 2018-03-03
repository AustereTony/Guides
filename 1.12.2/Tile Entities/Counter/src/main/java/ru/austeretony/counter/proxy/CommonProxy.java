package ru.austeretony.counter.proxy;

import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.austeretony.counter.main.BlocksRegistry;

public class CommonProxy {

    public void preInit(FMLPreInitializationEvent event) {
    	
    	BlocksRegistry.register();
    }

    public void init(FMLInitializationEvent event) {}
}
