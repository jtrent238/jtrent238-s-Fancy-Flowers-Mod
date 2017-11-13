package com.jtrent238.jtrent238flowers;

import com.jtrent238.jtrent238flowers.blocks.BlockModFlower;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;

public class BlockLoader {

	public static Block flower_anemone;
	public static Block flower_aster;
	public static Block flower_blue;
	public static Block flower_blue_2;
	public static Block flower_dandelion;
	public static Block flower_darkbloom;
	public static Block flower_fire;
	public static Block flower_herb;
	public static Block flower_hyacinth;
	public static Block flower_ice;
	public static Block flower_marigold;
	public static Block flower_pinkrose;
	public static Block flower_pinkrosebush;
	public static Block flower_purple;
	public static Block flower_purpletulip;
	public static Block flower_redallium;
	public static Block flower_rose;
	public static Block flower_yellowtulip;
	
	
	
	
	/**
	 * Load Blocks.
	 */
	public static void loadBlocks() {
		
		flower_anemone = new BlockModFlower(0).setBlockName("flower_anemone");
		flower_aster = new BlockModFlower(1).setBlockName("flower_aster");
		flower_blue = new BlockModFlower(2).setBlockName("flower_blue");
		flower_blue_2 = new BlockModFlower(3).setBlockName("flower_blue_2");
		flower_dandelion = new BlockModFlower(4).setBlockName("flower_dandelion");
		flower_darkbloom = new BlockModFlower(5).setBlockName("flower_darkbloom");
		flower_fire = new BlockModFlower(6).setBlockName("flower_fire");
		flower_herb = new BlockModFlower(7).setBlockName("flower_herb");
		flower_hyacinth = new BlockModFlower(8).setBlockName("flower_hyacinth");
		flower_ice = new BlockModFlower(9).setBlockName("flower_ice");
		flower_marigold = new BlockModFlower(10).setBlockName("flower_marigold");
		flower_pinkrose = new BlockModFlower(11).setBlockName("flower_pinkrose");
		flower_pinkrosebush = new BlockModFlower(12).setBlockName("flower_pinkrosebush");
		flower_purple = new BlockModFlower(13).setBlockName("flower_purple");
		flower_purpletulip = new BlockModFlower(14).setBlockName("flower_purpletulip");
		flower_redallium = new BlockModFlower(15).setBlockName("flower_redallium");
		flower_rose = new BlockModFlower(16).setBlockName("flower_rose");
		flower_yellowtulip = new BlockModFlower(17).setBlockName("flower_yellowtulip");
		
		
		registerBlocks();
	}

	/**
	 * Register Blocks.
	 */
	private static void registerBlocks(){
		
		GameRegistry.registerBlock(flower_anemone, "flower_anemone");
		GameRegistry.registerBlock(flower_aster, "flower_aster");
		GameRegistry.registerBlock(flower_blue, "flower_blue");
		GameRegistry.registerBlock(flower_blue_2, "flower_blue_2");
		GameRegistry.registerBlock(flower_dandelion, "flower_dandelion");
		GameRegistry.registerBlock(flower_darkbloom, "flower_darkbloom");
		GameRegistry.registerBlock(flower_fire, "flower_fire");
		GameRegistry.registerBlock(flower_herb, "flower_herb");
		GameRegistry.registerBlock(flower_hyacinth, "flower_hyacinth");
		GameRegistry.registerBlock(flower_ice, "flower_ice");
		GameRegistry.registerBlock(flower_marigold, "flower_marigold");
		GameRegistry.registerBlock(flower_pinkrose, "flower_pinkrose");
		GameRegistry.registerBlock(flower_pinkrosebush, "flower_pinkrosebush");
		GameRegistry.registerBlock(flower_purple, "flower_purple");
		GameRegistry.registerBlock(flower_purpletulip, "flower_purpletulip");
		GameRegistry.registerBlock(flower_redallium, "flower_redallium");
		GameRegistry.registerBlock(flower_rose, "naflower_roseme");
		GameRegistry.registerBlock(flower_yellowtulip, "flower_yellowtulip");

	}
	
	
}
