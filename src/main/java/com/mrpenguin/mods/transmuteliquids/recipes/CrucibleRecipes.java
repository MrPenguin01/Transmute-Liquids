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
package com.mrpenguin.mods.transmuteliquids.recipes;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;

public class CrucibleRecipes {
	
	private static final AspectList waterBucketCraftingAspects = new AspectList().add(Aspect.WATER, 4).add(Aspect.EXCHANGE, 2);
	private static final AspectList lavaBucketCraftingAspects = new AspectList().add(Aspect.FIRE, 4).add(Aspect.EXCHANGE, 2);
	public static CrucibleRecipe waterBucketRecipe;
	public static CrucibleRecipe lavaBucketRecipe;
	
	public static void add() {
		waterBucketRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Water", new ItemStack(Items.water_bucket), new ItemStack(Items.bucket), waterBucketCraftingAspects);
		lavaBucketRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Lava", new ItemStack(Items.lava_bucket), new ItemStack(Items.bucket), lavaBucketCraftingAspects);
	}
}
