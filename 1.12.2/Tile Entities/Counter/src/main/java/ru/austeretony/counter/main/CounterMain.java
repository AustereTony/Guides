package ru.austeretony.counter.main;

import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.austeretony.counter.main.tab.TabTiles;
import ru.austeretony.counter.proxy.CommonProxy;

@Mod(modid = CounterMain.MODID, name = CounterMain.NAME, version = CounterMain.VERSION)
public class CounterMain {
	
    public static final String 
    MODID = "counter",
    NAME = "Counter",
    VERSION = "1.0";

    private static Logger logger;
    
	@Instance(CounterMain.MODID)
	public static CounterMain instance;	
    
    @SidedProxy(clientSide = "ru.austeretony.counter.proxy.ClientProxy", serverSide = "ru.austeretony.counter.proxy.CommonProxy")
    public static CommonProxy proxy;
    
	public static final CreativeTabs TILES = new TabTiles(CreativeTabs.getNextID(), "tab_tiles");
    
    public CounterMain() {
    	
    	this.instance = this;    	
    }

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	
        logger = event.getModLog();
        
    	this.proxy.preInit(event);    	  	
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    	this.proxy.init(event); 	    
    }
    
    public static Logger logger() {
    	
    	return logger;
    }
}
