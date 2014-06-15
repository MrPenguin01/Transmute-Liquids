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

<<<<<<< HEAD
public class Forestry extends com.mrpenguin.mods.transmuteliquids.lib.Forestry{
=======
import forestry.core.config.ForestryItem;

public class Forestry {
	
	private static final String canHoneyText = "After using bees to generate some honey for you, you learn the uses of honey. Afterwards, you want to find out if it's possible to create honey after making water from aspects.";
	private static final String canBiomassText = "While working with saplings you discovered a new fuel source and can mass produce this fuel using saplings. After many unsuccessful attemps you finally have created your first millibuckets of Biomass from aspects.";
	private static final String canBiofuelText = "You finally figured out that you can refine Biomass for a more efficient fuel source that can also be mass produced. You decide to see if you can create it from aspects also, and you were very successful.";
    private static final String canJuiceText = "After making honey from aspects, you work on some fruits and create some Juice. Numerous failed attempts later you finally create some Juice from aspects.";
   private static final String canSeedOilText = "You found an alternative fuel source composed mostly of seeds and you decide this could be better then Oil due to its ease of mass producing. After plenty of tries you finally got some seed oil from aspects.";
	
	public static CrucibleRecipe potHoneyRecipe;
	
	public static CrucibleRecipe waxCapsuleWaterRecipe;
	public static CrucibleRecipe waxCapsuleHoneyRecipe;
	public static CrucibleRecipe waxCapsuleBiofuelRecipe;
	public static CrucibleRecipe waxCapsuleBiomassRecipe;
    public static CrucibleRecipe waxCapsuleJuiceRecipe;
    public static CrucibleRecipe waxCapsuleSeedOilRecipe;
	
	public static CrucibleRecipe refractoryWaterRecipe;
	public static CrucibleRecipe refractoryLavaRecipe;
	public static CrucibleRecipe refractoryHoneyRecipe;
	public static CrucibleRecipe refractoryBiofuelRecipe;
	public static CrucibleRecipe refractoryBiomassRecipe;
   public static CrucibleRecipe refractoryJuiceRecipe;
   public static CrucibleRecipe refractorySeedOilRecipe;
	
	public static CrucibleRecipe canWaterRecipe;
	public static CrucibleRecipe canLavaRecipe;
	public static CrucibleRecipe canHoneyRecipe;
	public static CrucibleRecipe canBiofuelRecipe;
	public static CrucibleRecipe canBiomassRecipe;
    public static CrucibleRecipe canJuiceRecipe;
    public static CrucibleRecipe canSeedOilRecipe;
	
	private static AspectList canWaterAspectList = new AspectList().add(Aspect.WATER, 4).add(Aspect.EXCHANGE, 2);
	private static AspectList canLavaAspectList = new AspectList().add(Aspect.FIRE, 4).add(Aspect.EXCHANGE, 2);
	
	private static AspectList potHoneyAspectList = new AspectList().add(Aspect.CROP, 2).add(Aspect.EXCHANGE, 2);
	
	private static AspectList canHoneyAspectList = new AspectList().add(Aspect.CROP, 4).add(Aspect.EXCHANGE, 2);
	private static AspectList canBiomassAspectList = new AspectList().add(Aspect.PLANT, 4).add(Aspect.EXCHANGE, 2).add(Aspect.TOOL, 2);
	private static AspectList canBiofuelAspectList = new AspectList().add(Aspect.PLANT, 4).add(Aspect.EXCHANGE, 2).add(Aspect.TOOL, 4);
    private static AspectList canJuiceAspectList = new AspectList().add(Aspect.CROP, 4).add(Aspect.EXCHANGE, 2);
    private static AspectList canSeedOilAspectList = new AspectList().add(Aspect.PLANT, 4).add(Aspect.EXCHANGE, 2);
	
	public static void crucibleRecipes() {
		
		potHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Honey", ForestryItem.honeyPot.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), potHoneyAspectList);
		
		waxCapsuleWaterRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Water", ForestryItem.waxCapsuleWater.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canWaterAspectList);
		waxCapsuleHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Honey", ForestryItem.waxCapsuleHoney.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canHoneyAspectList);
		waxCapsuleBiomassRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biomass", ForestryItem.waxCapsuleBiomass.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canBiomassAspectList);
		waxCapsuleBiofuelRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biofuel", ForestryItem.waxCapsuleBiofuel.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canBiofuelAspectList);
		waxCapsuleJuiceRecipe = ThaumcraftApi.addCrucibleRecipe("Transute Juice", ForestryItem.waxCapsuleJuice.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canJuiceAspectList);
           waxCapsuleSeedOilRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Seed Oil", Forestry.waxCapsuleSeedOil.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canSeedOilAspectList);
		
		refractoryWaterRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Water", ForestryItem.refractoryWater.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canWaterAspectList);
		refractoryLavaRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Lava", ForestryItem.refractoryLava.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canLavaAspectList);
		refractoryHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Honey", ForestryItem.refractoryHoney.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canHoneyAspectList);
		refractoryBiomassRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biomass", ForestryItem.refractoryBiomass.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canBiomassAspectList);
		refractoryBiofuelRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biofuel", ForestryItem.refractoryBiofuel.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canBiofuelAspectList);
		refractoryJuiceRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Juice", ForestryItem.refractoryJuice.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canJuiceAspectList);
           refractorySeedOilRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Seed Oil", ForestryItem.refractorySeedOil.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canSeedOilAspect);
		
		canWaterRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Water", ForestryItem.canWater.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canWaterAspectList);
		canLavaRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Lava", ForestryItem.canLava.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canLavaAspectList);
		canHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Tranmute Honey", ForestryItem.canHoney.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canHoneyAspectList);
		canBiomassRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biomass", ForestryItem.canBiomass.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canBiomassAspectList);
		canBiofuelRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biofuel", ForestryItem.canBiofuel.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canBiofuelAspectList);
		canJuiceRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Juice", ForestryItem.canJuice.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canJuiceAspectList);
           canSeedOilRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Seed Oil", ForestryItem.canSeedOil.getItemStack(1), ForestryItem.canEmpty.getItemStack(1),  canSeedOilAspectList);
	}
	
>>>>>>> 986842ab4324411c7fd95601b091d6f3c019bb19
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
