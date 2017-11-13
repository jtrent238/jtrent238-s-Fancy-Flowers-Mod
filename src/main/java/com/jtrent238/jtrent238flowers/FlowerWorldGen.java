package com.jtrent238.jtrent238flowers;

import java.util.Random;

import cpw.mods.fml.common.IWorldGenerator;
import net.minecraft.block.Block;
import net.minecraft.world.World;
import net.minecraft.world.chunk.IChunkProvider;
import net.minecraft.world.gen.feature.WorldGenFlowers;
import net.minecraft.world.gen.feature.WorldGenerator;

public class FlowerWorldGen extends WorldGenerator implements IWorldGenerator
{
    private Block field_150552_a;
    private int field_150551_b;
    private static final String __OBFID = "CL_00000410";

    public FlowerWorldGen(Block p_i45452_1_)
    {
        this.field_150552_a = p_i45452_1_;
    }

    public void func_150550_a(Block p_150550_1_, int p_150550_2_)
    {
        this.field_150552_a = p_150550_1_;
        this.field_150551_b = p_150550_2_;
    }

    public boolean generate(World p_76484_1_, Random p_76484_2_, int p_76484_3_, int p_76484_4_, int p_76484_5_)
    {
        for (int l = 0; l < 64; ++l)
        {
            int i1 = p_76484_3_ + p_76484_2_.nextInt(8) - p_76484_2_.nextInt(8);
            int j1 = p_76484_4_ + p_76484_2_.nextInt(4) - p_76484_2_.nextInt(4);
            int k1 = p_76484_5_ + p_76484_2_.nextInt(8) - p_76484_2_.nextInt(8);

            if (p_76484_1_.isAirBlock(i1, j1, k1) && (!p_76484_1_.provider.hasNoSky || j1 < 255) && this.field_150552_a.canBlockStay(p_76484_1_, i1, j1, k1))
            {
                p_76484_1_.setBlock(i1, j1, k1, this.field_150552_a, this.field_150551_b, 2);
            }
        }

        return true;
    }

	@Override
	public void generate(Random randomGenerator, int chunkX, int chunkZ, World world, IChunkProvider chunkGenerator,
			IChunkProvider chunkProvider) {

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
			(new WorldGenFlowers(BlockLoader.flower_yellowtulip)).generate(world, randomGenerator, l6, i11, l14);}
	}
	
}