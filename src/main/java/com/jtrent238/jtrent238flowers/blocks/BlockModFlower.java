package com.jtrent238.jtrent238flowers.blocks;

import java.util.List;
import java.util.Random;

import com.jtrent238.jtrent238flowers.BlockLoader;
import com.jtrent238.jtrent238flowers.Main;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.IIcon;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraftforge.common.EnumPlantType;

public class BlockModFlower  extends BlockBush
{
    public static final String[][] field_149860_M = new String[][] {{"flower_anemone"}, {"flower_aster"}, {"flower_blue"}, {"flower_blue_2"}, {"flower_dandelion"}, {"flower_darkbloom"}, {"flower_fire"}, {"flower_herb"}, {"flower_hyacinth"}, {"flower_ice"}, {"flower_marigold"}, {"flower_pinkrose"}, {"flower_pinkrosebush"}, {"flower_purple"}, {"flower_purpletulip"}, {"flower_redallium"}, {"flower_rose"}, {"flower_yellowtulip"}, {"flower_cockscomb_5"} , {"flower_cockscomb_4"} , {"flower_cockscomb_3"} , {"flower_cockscomb_2"} , {"flower_cockscomb_1"} , {"flower_morningglory"} , {"flower_pansy_4"} , {"flower_pansy_3"} , {"flower_pansy_2"} , {"flower_pansy_1"} , {"flower_laceleaf"} , {"flower_marigold"} , {"flower_aquilegia"} , {"flower_africandasiy"} };
    public static final String[] field_149859_a = new String[] {};
    public static final String[] field_149858_b = new String[] {};
   
    @SideOnly(Side.CLIENT)
    private IIcon[] field_149861_N;
    private int field_149862_O;
    private static final String __OBFID = "CL_00000246";

    public BlockModFlower(int p_i2173_1_)
    {
        super(Material.plants);
        this.field_149862_O = p_i2173_1_;
        this.setCreativeTab(Main.FlowerModCTab);
        this.setBlockTextureName("epicproportionsmod:" + field_149860_M);
        this.enableStats = true;
    }

    /**
     * Gets the block's texture. Args: side, meta
     */
    @SideOnly(Side.CLIENT)
    public IIcon getIcon(int p_149691_1_, int p_149691_2_)
    {
        if (p_149691_2_ >= this.field_149861_N.length)
        {
            p_149691_2_ = 0;
        }

        return this.field_149861_N[p_149691_2_];
    }

    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister p_149651_1_)
    {
        this.field_149861_N = new IIcon[field_149860_M[this.field_149862_O].length];

        for (int i = 0; i < this.field_149861_N.length; ++i)
        {
            this.field_149861_N[i] = p_149651_1_.registerIcon(field_149860_M[this.field_149862_O][i]);
        }
    }

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int p_149692_1_)
    {
        return p_149692_1_;
    }

    /**
     * returns a list of blocks with the same ID, but different meta (eg: wood returns 4 blocks)
     */
    @SideOnly(Side.CLIENT)
    public void getSubBlocks(Item p_149666_1_, CreativeTabs p_149666_2_, List p_149666_3_)
    {
        for (int i = 0; i < this.field_149861_N.length; ++i)
        {
            p_149666_3_.add(new ItemStack(p_149666_1_, 1, i));
        }
    }

    public static BlockFlower func_149857_e(String p_149857_0_)
    {
        String[] astring = field_149858_b;
        int i = astring.length;
        int j;
        String s1;

        for (j = 0; j < i; ++j)
        {
            s1 = astring[j];

        }

        astring = field_149859_a;
        i = astring.length;

        for (j = 0; j < i; ++j)
        {
            s1 = astring[j];

        }

        return null;
    }

    public static int func_149856_f(String p_149856_0_)
    {
        int i;

        for (i = 0; i < field_149858_b.length; ++i)
        {
            if (field_149858_b[i].equals(p_149856_0_))
            {
                return i;
            }
        }

        for (i = 0; i < field_149859_a.length; ++i)
        {
            if (field_149859_a[i].equals(p_149856_0_))
            {
                return i;
            }
        }

        return 0;
    }
    
    @Override
    public EnumPlantType getPlantType (IBlockAccess world, int x, int y, int z)
    {
        return EnumPlantType.Plains;
    }

    @Override
    public Block getPlant (IBlockAccess world, int x, int y, int z)
    {
        return this;
    }
    
    public void generateSurface(World world, java.util.Random randomGenerator, int chunkX, int chunkZ) {
		for (int i = 0; i < 20; i++) {
			int l6 = chunkX + randomGenerator.nextInt(16) + 8;
			int i11 = randomGenerator.nextInt(128);
			int l14 = chunkZ + randomGenerator.nextInt(16) + 8;
			(new WorldGenFlowers(BlockLoader.flower_anemone)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_aster)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_blue)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_blue_2)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_dandelion)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_darkbloom)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_fire)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_herb)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_hyacinth)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_ice)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_marigold)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_pinkrose)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_pinkrosebush)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_purple)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_purpletulip)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_redallium)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_redallium)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_rose)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_yellowtulip)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_cockscomb_5)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_cockscomb_4)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_cockscomb_3)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_cockscomb_2)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_cockscomb_1)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_morningglory)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_pansy_4)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_pansy_3)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_pansy_2)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_pansy_1)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_laceleaf)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_marigold)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_aquilegia)).generate(world, randomGenerator, l6, i11, l14);
			(new WorldGenFlowers(BlockLoader.flower_africandasiy)).generate(world, randomGenerator, l6, i11, l14);}
	}
}
