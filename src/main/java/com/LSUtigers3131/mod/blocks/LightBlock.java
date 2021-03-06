package com.LSUtigers3131.mod.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class LightBlock extends BlockBase {

	public LightBlock(String name, Material material) 
	{
		super(name, material);
		setSoundType(SoundType.METAL);
		setLightLevel(1.0F);
		setLightOpacity(15);
		setHardness(3.0F);
		setResistance(15.0F);
		setHarvestLevel("pickaxe", 2);
	}
}