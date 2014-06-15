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

import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

import com.mrpenguin.mods.transmuteliquids.lib.TransmuteLiquids;
import com.mrpenguin.mods.transmuteliquids.research.TLResearchItem;

public class Railcraft extends com.mrpenguin.mods.transmuteliquids.lib.Railcraft{
	public static void thaumonomiconResearch() {
		ResearchItem research;
		
		research = new TLResearchItem(transmuteCreosoteOil, TransmuteLiquids.transmuteLiquids, new AspectList(), -2, -2, 2, bottleCreosoteOil).setPages(creosoteOilPageText, creosoteOilBottlePageRecipe, creosoteOilBucketPageRecipe).setConcealed().setParents(TransmuteLiquids.transmuteWater).registerResearchItem();
	}
	
	public static void thaumonomiconResearchForestry() {
		ResearchItem research;
		
		research = new TLResearchItem(transmuteCreosoteOil, TransmuteLiquids.transmuteLiquids, new AspectList(), -2, -2, 2, bottleCreosoteOil).setPages(creosoteOilPageText, creosoteOilBottlePageRecipe, creosoteOilBucketPageRecipe, creosoteOilWaxCapsulePageRecipe, creosoteOilRefractoryPageRecipe, creosoteOilCanPageRecipe).setConcealed().setParents(TransmuteLiquids.transmuteWater).registerResearchItem();;
	}
}
