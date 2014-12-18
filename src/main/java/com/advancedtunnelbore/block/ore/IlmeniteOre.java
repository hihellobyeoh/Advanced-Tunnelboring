package com.advancedtunnelbore.block.ore;

import java.util.Random;

import com.advancedtunnelbore.block.ATBBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;

public class IlmeniteOre extends Block {

	protected IlmeniteOre(Material p_i45394_1_) {
		super(p_i45394_1_);
	}
	
	@Override
    public Item getItemDropped(int metadata, Random random, int fortune) {
        return Item.getItemFromBlock(ATBOres.ilmeniteOre);
    }

}