package com.jtrent238.jtrent238flowers;


import java.util.Random;

import com.jtrent238.jtrent238flowers.common.CommonProxy;

import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.eventhandler.EventPriority;
import cpw.mods.fml.common.network.NetworkRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.crash.CrashReportCategory;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.minecraftforge.common.ChestGenHooks;
import net.minecraftforge.common.MinecraftForge;

@Mod(modid=Main.MODID, name=Main.MODNAME, version=(Main.MODVERSION))

public class Main
{

	
	@SidedProxy(clientSide="com.jtrent238.jtrent238flowers.client.ClientProxy", serverSide="com.jtrent238.jtrent238flowers.common.CommonProxy")
	public static CommonProxy proxy;
	
	
	
	public static final String MODID = "jtrent238flowers";

	@Instance(MODID)
    public static Main instance;


	/** This is used to keep track of GUIs that we make*/
	private static int modGuiIndex = 0;
	
	public static final String MODVERSION = "1.0.0.0";
	public static final String MODNAME = "jtrent238's Fancy Flower Mod";
	public static final String MODAUTHOR = "jtrent238";
	public static final String MC = "1.7.10";

	
	/** Set our custom inventory Gui index to the next available Gui index */
	public static final int GUI_ITEM_INV = modGuiIndex++;
	
	@ForgeSubscribe(priority = EventPriority.NORMAL)
    public void eventHandler(RenderGameOverlayEvent event) {

	}
	
	
@Mod.EventHandler
public void preInit(FMLPreInitializationEvent event)
{
	
	
}



@Mod.EventHandler
public void init(FMLInitializationEvent event)
{
	proxy.init(event);
	// register CommonProxy as our GuiHandler
	
	//ItemLoader.LoadItems();
	BlockLoader.loadBlocks();
	//Recipes.registerRecpies();
	//EntityLoader.LoadEntitys();
	//OreDict.addores();
	//Achievements.loadAchievements();
	//Stats.RegisterStats();

	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_anemone), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_aster), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_blue), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_blue_2), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_dandelion), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_darkbloom), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_fire), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_herb), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_hyacinth), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_ice), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_marigold), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_pinkrose), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_pinkrosebush), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_purple), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_purpletulip), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_redallium), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_rose), 0);
	GameRegistry.registerWorldGenerator(new FlowerWorldGen(BlockLoader.flower_yellowtulip), 0);

}


public static CreativeTabs FlowerModCTab = new CreativeTabs("FlowerModCTab")

{
	public Item getTabIconItem() {

		return new ItemStack(Blocks.red_flower).getItem();
	}
	public boolean hasSearchBar(){
		return false;
	}
			/*
	@SideOnly(Side.CLIENT)
	public String getBackgroundImageName() 
	{
		return "FlowerMod.png";
	}
			 */
	/*
	@SideOnly(Side.CLIENT)
	public boolean drawInForegroundOfTab() 
	{
		return false;
	}
	*/
	}
	
;









@Mod.EventHandler
public void postInit(FMLPostInitializationEvent event) {
	{
		
	    //Recipes.registerRecpies();

	    
	}
	
	
}




					
}
