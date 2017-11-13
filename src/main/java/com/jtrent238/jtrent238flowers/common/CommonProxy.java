package com.jtrent238.jtrent238flowers.common;

import com.jtrent238.jtrent238flowers.Main;

import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLServerStartingEvent;
import cpw.mods.fml.common.network.IGuiHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.world.World;

public class CommonProxy{
	
	
	private static final String modid = Main.MODID;
	private String owner;

	public void init(FMLInitializationEvent e) {
	    
		}
	
	@EventHandler
	public void serverLoad(FMLServerStartingEvent event)
	{
	    
	}

	
}
