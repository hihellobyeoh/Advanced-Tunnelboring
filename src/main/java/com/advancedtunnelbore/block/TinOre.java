package com.advancedtunnelbore.block;

import java.util.Random;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class TinOre extends Block {

	protected TinOre(Material p_i45394_1_) {
		super(p_i45394_1_);
	}
	
	@Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(MyBlocks.tinOre);
    }

}