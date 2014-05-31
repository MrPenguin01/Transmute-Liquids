/**
 * Copyright (c) 2014 MrPenguin
 * All rights reserved.
 * 
 * This program and the accompanying materials are made available under the terms of the GNU Public License v3.0
 * which accompanies this distribution, and is available at http://www.gnu.org/licenses/gpl.html
 * 
 * This class was made by MrPenguin and is distributed as a part of the Transmute Liquids mod.
 * Transmute Liquids is a derivative work on Thaumcraft 4 (c) Azanor 2012.
 * http://www.minecraftforum.net/topic/2011841-thaumcraft-41114-updated-2052014/
 */
package com.mrpenguin.mods.transmuteliquids.research;

import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.StatCollector;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchItem;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class TLResearchItem extends ResearchItem{
	public TLResearchItem(String par1, String par2) {
		super(par1, par2);
	}
	
	public TLResearchItem(String par1, String par2, AspectList tags, int par3, int par4, int par5, ItemStack icon) {
		super(par1, par2, tags, par3, par4, par5, icon);
	}
	
	public TLResearchItem(String par1, String par2, AspectList tags, int par3, int par4, int par5, ResourceLocation icon) {
		super(par1, par2, tags, par3, par4, par5, icon);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public String getName() {
		return StatCollector.translateToLocal(key);
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public String getText() {
		return StatCollector.translateToLocal("[TL] ") + StatCollector.translateToLocal(key);
	}
}
