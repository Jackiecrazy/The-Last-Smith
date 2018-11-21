package net.langball.lastsmith;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid=Last_worker.MODID, name=Last_worker.NAME, version=Last_worker.VERSION, dependencies="required-after:flammpfeil.slashblade@[mc1.12-r15,);after:patchouli;")
public class Last_worker {
	public static final String MODID = "lastsmith";
    public static final String NAME = "The Last Smith";
    public static final String VERSION = "1.1.4";
    
	@Instance(Last_worker.MODID)
	    public static Last_worker instance;
	    
	@SidedProxy(clientSide = "net.langball.lastsmith.ClientProxy",serverSide = "net.langball.lastsmith.CommonProxy")
 public static CommonProxy proxy; 
	 
	   
	@EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.init(event);

    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        proxy.postInit(event);
    }
}   