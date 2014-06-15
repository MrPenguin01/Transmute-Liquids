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

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ResourceLocation;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchCategories;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

import com.mrpenguin.mods.transmuteliquids.lib.TransmuteLiquids;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class ThaumonomiconResearch extends TransmuteLiquids{
	
	public static void addResearchTab() {
		ResourceLocation background = new ResourceLocation("transmuteliquids:textures/gui/thaumonomiconBackground.png");
		ResearchCategories.registerCategory("Transmute Liquids", new ResourceLocation("transmuteliquids:textures/misc/transmuteLiquidsIcon.png"), background);
	}
	
	public static void addResearch() {
		ResearchItem research;
		
		research = new TLResearchItem(transmuteWater, transmuteLiquids, new AspectList(), 0, 0, 1, waterBucket).setPages(waterPageText, waterBucketPageRecipe).setSpecial().setParents(transmuteIron).registerResearchItem();
		
		research = new TLResearchItem(transmuteLava, transmuteLiquids, new AspectList(), 0, 2, 2, lavaBucket).setPages(lavaPageText, lavaBucketPageRecipe).setConcealed().setSecondary().setParents(transmuteWater).registerResearchItem();
	}
}
