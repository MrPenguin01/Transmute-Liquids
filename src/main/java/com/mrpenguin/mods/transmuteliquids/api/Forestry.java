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
import com.mrpenguin.mods.transmuteliquids.research.ThaumonomiconResearch;

public class Forestry extends com.mrpenguin.mods.transmuteliquids.lib.Forestry{
	public static void thaumonomiconResearch() {
		ResearchItem research;
		
		research = new TLResearchItem(TransmuteLiquids.transmuteWater, TransmuteLiquids.transmuteLiquids, new AspectList(), 0, 0, 1, TransmuteLiquids.waterBucket).setPages(TransmuteLiquids.waterPageText, TransmuteLiquids.waterBucketPageRecipe, waterWaxCapsulePageRecipe, waterRefractoryPageRecipe, waterCanPageRecipe).setSpecial().setParents(TransmuteLiquids.transmuteIron).registerResearchItem();
		
		research = new TLResearchItem(TransmuteLiquids.transmuteLava, TransmuteLiquids.transmuteLiquids, new AspectList(), 0, 2, 2, TransmuteLiquids.lavaBucket).setPages(TransmuteLiquids.lavaPageText, TransmuteLiquids.lavaBucketPageRecipe, lavaRefractoryPageRecipe, lavaCanPageRecipe).setConcealed().setSecondary().setParents(TransmuteLiquids.transmuteWater).registerResearchItem();
	
		research = new TLResearchItem(transmuteHoney, TransmuteLiquids.transmuteLiquids, new AspectList(), -2, 2, 0, honeyPot).setPages(honeyPageText, honeyPotPageRecipe, honeyWaxCapsulePageRecipe, honeyRefractoryPageRecipe, honeyCanPageRecipe).setConcealed().setSecondary().setParents(TransmuteLiquids.transmuteWater).registerResearchItem();
		
		research = new TLResearchItem(transmuteJuice, TransmuteLiquids.transmuteLiquids, new AspectList(), -3, 4, 2, canJuice).setPages(juicePageText, juiceWaxCapsulePageRecipe, juiceRefractoryPageRecipe, juiceCanPageRecipe).setConcealed().setParents(transmuteHoney).registerResearchItem();
		
		research = new TLResearchItem(transmuteSeedOil, TransmuteLiquids.transmuteLiquids, new AspectList(), 2, -2, 3, canSeedOil).setPages(seedOilPageText, seedOilWaxCapsulePageRecipe, seedOilRefractoryPageRecipe, seedOilCanPageRecipe).setConcealed().setSpecial().setParents(TransmuteLiquids.transmuteWater).registerResearchItem();
		
		research = new TLResearchItem(transmuteBiomass, TransmuteLiquids.transmuteLiquids, new AspectList(), 3, -4, 1, canBiomass).setPages(biomassPageText, biomassBucketPageRecipe, biomassWaxCapsulePageRecipe, biomassRefractoryPageRecipe, biomassCanPageRecipe).setConcealed().setParents(transmuteSeedOil).registerResearchItem();
		
		research = new TLResearchItem(transmuteBiofuel, TransmuteLiquids.transmuteLiquids, new AspectList(), 4, -6, 1, canBiofuel).setPages(biofuelPageText, biofuelBucketPageRecipe, biofuelWaxCapsulePageRecipe, biofuelRefractoryPageRecipe, biofuelCanPageRecipe).setConcealed().setParents(transmuteBiomass).registerResearchItem();		
	}
}
