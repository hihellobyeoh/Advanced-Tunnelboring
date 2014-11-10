package com.advancedtunnelbore.blocks;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class TitaniumOre extends Block {

	protected TitaniumOre(Material p_i45394_1_) {
		super(p_i45394_1_);
	
	}
	@Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(MyBlocks.titaniumOre);
    }

}
