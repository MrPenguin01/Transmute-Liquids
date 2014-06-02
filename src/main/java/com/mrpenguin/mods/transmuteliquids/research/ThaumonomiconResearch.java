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

import com.mrpenguin.mods.transmuteliquids.recipes.CrucibleRecipes;

import cpw.mods.fml.common.registry.LanguageRegistry;

public class ThaumonomiconResearch {
	
	public static void addResearchTab() {
		ResourceLocation background = new ResourceLocation("transmuteliquids:textures/gui/thaumonomiconBackground.png");
		ResearchCategories.registerCategory("Transmute Liquids", new ResourceLocation("transmuteliquids:textures/misc/transmuteLiquidsIcon.png"), background);
	}
	
	public static final String waterBucketText = "After being able to make more iron by using different aspects in the crucible, you try to do the same with liquids,"
			+ " after many attemps you finally are able to create water out of aspects. Now try to try it on other liquids...";
	
	public static final String lavaBucketText = "You're able to create water from the crucible but after doing some research you've been able to get lava as well!."
			+ "You might be able to create some custom liquids that have never been seen before...";
	
	public static void addResearch() {
		ResearchItem research;
		String text;
		
		text = "1";
		research = new TLResearchItem("Transmute Water", "Transmute Liquids", new AspectList(), 0, 0, 1, new ItemStack(Items.water_bucket)).setPages(new ResearchPage(waterBucketText), new ResearchPage(CrucibleRecipes.waterBucketRecipe)).setSpecial().setParents(new String[] { "TRANSIRON" }).registerResearchItem();
		
		text = "1";
		research = new TLResearchItem("Transmute Lava", "Transmute Liquids", new AspectList(), 0, 2, 1, new ItemStack(Items.lava_bucket)).setPages(new ResearchPage(lavaBucketText), new ResearchPage(CrucibleRecipes.lavaBucketRecipe)).setConcealed().setSecondary().setParents(new String[] { "Transmute Water" }).registerResearchItem();
	}
}
