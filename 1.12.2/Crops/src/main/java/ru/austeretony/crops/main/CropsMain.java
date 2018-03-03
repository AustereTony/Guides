package ru.austeretony.crops.main;

import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import ru.austeretony.crops.main.tab.TabCrops;
import ru.austeretony.crops.proxy.CommonProxy;

@Mod(modid = CropsMain.MODID, name = CropsMain.NAME, version = CropsMain.VERSION)
public class CropsMain {
	
    public static final String 
    MODID = "crops",
    NAME = "Crops",
    VERSION = "1.0";

    private static Logger logger;
    
	@Instance(CropsMain.MODID)
	public static CropsMain instance;	
    
    @SidedProxy(clientSide = "ru.austeretony.crops.proxy.ClientProxy", serverSide = "ru.austeretony.crops.proxy.CommonProxy")
    public static CommonProxy proxy;
    
	public static final CreativeTabs CROPS = new TabCrops(CreativeTabs.getNextID(), "tab_crops");
    
    public CropsMain() {
    	
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
