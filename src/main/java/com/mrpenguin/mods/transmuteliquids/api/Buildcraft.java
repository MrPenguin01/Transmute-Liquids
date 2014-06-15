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
package com.mrpenguin.mods.transmuteliquids.api;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

import com.mrpenguin.mods.transmuteliquids.lib.TransmuteLiquids;
import com.mrpenguin.mods.transmuteliquids.research.TLResearchItem;

import cpw.mods.fml.common.registry.GameRegistry;

public class Buildcraft extends com.mrpenguin.mods.transmuteliquids.lib.Buildcraft{
	
	public static void thaumonomiconResearch() {
		ResearchItem research;
		
		research = new TLResearchItem(transmuteOil, TransmuteLiquids.transmuteLiquids, new AspectList(), 2, 2, 2, bucketOil).setPages(oilPageText, oilBucketPageRecipe).setConcealed().setSecondary().setParents(TransmuteLiquids.transmuteWater).registerResearchItem();
		
		research = new TLResearchItem(transmuteFuel, TransmuteLiquids.transmuteLiquids, new AspectList(), 3, 4, 3, bucketFuel).setPages(fuelPageText, fuelBucketPageRecipe).setConcealed().setSpecial().setParents(transmuteOil).registerResearchItem();
	}
	
	public static void thaumonomiconResearchForestry() {
		ResearchItem research;

		research = new TLResearchItem(transmuteOil, TransmuteLiquids.transmuteLiquids, new AspectList(), 2, 2, 2, bucketOil).setPages(oilPageText, oilBucketPageRecipe, oilWaxCapsulePageRecipe, oilRefractoryPageRecipe, oilCanPageRecipe).setConcealed().setParents(TransmuteLiquids.transmuteWater).registerResearchItem();

		research = new TLResearchItem(transmuteFuel, TransmuteLiquids.transmuteLiquids, new AspectList(), 3, 4, 3, bucketFuel).setPages(fuelPageText, fuelBucketPageRecipe, fuelWaxCapsulePageRecipe, fuelRefractoryPageRecipe, fuelCanPageRecipe).setConcealed().setSpecial().setParents(transmuteOil).registerResearchItem();
	}
}
