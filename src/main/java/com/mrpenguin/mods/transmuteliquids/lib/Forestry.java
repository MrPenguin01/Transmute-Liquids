package com.mrpenguin.mods.transmuteliquids.lib;

import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.research.ResearchPage;
import cpw.mods.fml.common.registry.GameRegistry;

public class Forestry {
	public static final String Forestry = "Forestry";
	public static final String transmuteHoney = "Transmute Honey";
	public static final String transmuteJuice = "Transmute Juice";
	public static final String transmuteSeedOil = "Transmute Seed Oil";
	public static final String transmuteBiomass = "Transmute Biomass";
	public static final String transmuteBiofuel = "Transmute Ethanol";
	
	public static final String honeyText = "After using bees to generate some honey for you, you learn the uses of honey. Afterwards, you want to find out if it's possible to create honey after making water from aspects.";
    public static final String juiceText = "After making honey from aspects, you work on some fruits and create some Juice. Numerous failed attempts later you finally create some Juice from aspects.";
    public static final String seedOilText = "You found an alternative fuel source composed mostly of seeds and you decide this could be better then Oil due to its ease of mass producing. After plenty of tries you finally got some seed oil from aspects.";
    public static final String biomassText = "While working with saplings you discovered a new fuel source and can mass produce this fuel using saplings. After many unsuccessful attemps you finally have created your first millibuckets of Biomass from aspects.";
	public static final String biofuelText = "You finally figured out that you can refine Biomass for a more efficient fuel source that can also be mass produced. You decide to see if you can create it from aspects also, and you were very successful.";
	
	//ItemStacks for empty fluid containers
	public static final ItemStack waxCapsule = GameRegistry.findItemStack(Forestry, "waxCapsule", 1);
	public static final ItemStack refractoryEmpty = GameRegistry.findItemStack(Forestry, "refractoryEmpty", 1);
	public static final ItemStack canEmpty = GameRegistry.findItemStack(Forestry, "canEmpty", 1);
	
	//ItemStacks for water containers
	public static final ItemStack waxCapsuleWater = GameRegistry.findItemStack(Forestry, "waxCapsuleWater", 1);
	public static final ItemStack refractoryWater = GameRegistry.findItemStack(Forestry, "refractoryWater", 1);
	public static final ItemStack canWater = GameRegistry.findItemStack(Forestry, "waterCan", 1);
	
	//ItemStacks for lava containers
	public static final ItemStack refractoryLava = GameRegistry.findItemStack(Forestry, "refractoryLava", 1);
	public static final ItemStack canLava = GameRegistry.findItemStack(Forestry, "canLava", 1);
	
	//ItemStacks for honey containers
	public static final ItemStack honeyPot = GameRegistry.findItemStack(Forestry, "honeyPot", 1);
	public static final ItemStack waxCapsuleHoney = GameRegistry.findItemStack(Forestry, "waxCapsuleHoney", 1);
	public static final ItemStack refractoryHoney = GameRegistry.findItemStack(Forestry, "refractoryHoney", 1);
	public static final ItemStack canHoney = GameRegistry.findItemStack(Forestry, "canHoney", 1);
	
	//ItemStacks for juice containers
	public static final ItemStack waxCapsuleJuice = GameRegistry.findItemStack(Forestry, "waxCapsuleJuice", 1);
	public static final ItemStack refractoryJuice = GameRegistry.findItemStack(Forestry, "refractoryJuice", 1);
	public static final ItemStack canJuice = GameRegistry.findItemStack(Forestry, "canJuice", 1);
	
	//ItemStacks for seed oil containers
	public static final ItemStack waxCapsuleSeedOil = GameRegistry.findItemStack(Forestry, "waxCapsuleSeedOil", 1);
	public static final ItemStack refractorySeedOil = GameRegistry.findItemStack(Forestry, "refractorySeedOil", 1);
	public static final ItemStack canSeedOil = GameRegistry.findItemStack(Forestry, "canSeedOil", 1);
	
	//ItemStacks for biomass containers
	public static final ItemStack bucketBiomass = GameRegistry.findItemStack(Forestry, "bucketBiomass", 1);
	public static final ItemStack waxCapsuleBiomass = GameRegistry.findItemStack(Forestry, "waxCapsuleBiomass", 1);
	public static final ItemStack refractoryBiomass = GameRegistry.findItemStack(Forestry, "refractoryBiomass", 1);
	public static final ItemStack canBiomass = GameRegistry.findItemStack(Forestry, "biomassCan", 1);
	
	//ItemStacks for biofuel containers
	public static final ItemStack bucketBiofuel = GameRegistry.findItemStack(Forestry, "bucketBiofuel", 1);
	public static final ItemStack waxCapsuleBiofuel = GameRegistry.findItemStack(Forestry, "waxCapsuleBiofuel", 1);
	public static final ItemStack refractoryBiofuel = GameRegistry.findItemStack(Forestry, "refractoryBiofuel", 1);
	public static final ItemStack canBiofuel = GameRegistry.findItemStack(Forestry, "biofuelCan", 1);
	
	public static final AspectList honeyAspectList1 = new AspectList().add(Aspect.CROP, 4).add(Aspect.EXCHANGE, 3);//AspectList for most honey containers
	public static final AspectList honeyAspectList2 = new AspectList().add(Aspect.CROP, 6).add(Aspect.EXCHANGE, 3);//AspectList for potHoney
	public static final AspectList juiceAspectList = new AspectList().add(Aspect.CROP, 6).add(Aspect.EXCHANGE, 3);//AspectList for juice containers
	public static final AspectList seedOilAspectList = new AspectList().add(Aspect.PLANT, 6).add(Aspect.EXCHANGE, 3);//AspectList for seed oil containers
	public static final AspectList biomassAspectList = new AspectList().add(Aspect.PLANT, 6).add(Aspect.TOOL, 4).add(Aspect.EXCHANGE, 3);//AspectList for biomass containers
	public static final AspectList biofuelAspectList = new AspectList().add(Aspect.PLANT, 8).add(Aspect.TOOL, 6).add(Aspect.EXCHANGE, 3);//AspectList for biofuel containers
	
	//CrucibleRecipes for water (Forestry)
	public static final CrucibleRecipe waterWaxCapsule = ThaumcraftApi.addCrucibleRecipe(TransmuteLiquids.transmuteWater, waxCapsuleWater, waxCapsule, TransmuteLiquids.waterAspectList);
	public static final CrucibleRecipe waterRefractory = ThaumcraftApi.addCrucibleRecipe(TransmuteLiquids.transmuteWater, refractoryWater, refractoryEmpty, TransmuteLiquids.waterAspectList);
	public static final CrucibleRecipe waterCan = ThaumcraftApi.addCrucibleRecipe(TransmuteLiquids.transmuteWater, canWater, canEmpty, TransmuteLiquids.waterAspectList);
	
	//CrucibleRecipes for lava (Forestry)
	public static final CrucibleRecipe lavaRefractory = ThaumcraftApi.addCrucibleRecipe(TransmuteLiquids.transmuteLava, refractoryLava, refractoryEmpty, TransmuteLiquids.lavaAspectList);
	public static final CrucibleRecipe lavaCan = ThaumcraftApi.addCrucibleRecipe(TransmuteLiquids.transmuteWater, canLava, canEmpty, TransmuteLiquids.lavaAspectList);
	
	//CrucibleRecipes for honey
	public static final CrucibleRecipe potHoney = ThaumcraftApi.addCrucibleRecipe(transmuteHoney, honeyPot, waxCapsule, honeyAspectList1);
	public static final CrucibleRecipe honeyWaxCapsule = ThaumcraftApi.addCrucibleRecipe(transmuteHoney, waxCapsuleHoney, waxCapsule, honeyAspectList2);
	public static final CrucibleRecipe honeyRefractory = ThaumcraftApi.addCrucibleRecipe(transmuteHoney, refractoryHoney, refractoryEmpty, honeyAspectList2);
	public static final CrucibleRecipe honeyCan = ThaumcraftApi.addCrucibleRecipe(transmuteHoney, canHoney, canEmpty, honeyAspectList2);
	
	//CrucibleRecipes for juice
	public static final CrucibleRecipe juiceWaxCapsule = ThaumcraftApi.addCrucibleRecipe(transmuteJuice, waxCapsuleJuice, waxCapsule, juiceAspectList);
	public static final CrucibleRecipe juiceRefractory = ThaumcraftApi.addCrucibleRecipe(transmuteJuice, waxCapsuleJuice, refractoryEmpty, juiceAspectList);
	public static final CrucibleRecipe juiceCan = ThaumcraftApi.addCrucibleRecipe(transmuteJuice, canJuice, canEmpty, juiceAspectList);
	
	//CrucibleRecipes for seed oil
	public static final CrucibleRecipe seedOilWaxCapsule = ThaumcraftApi.addCrucibleRecipe(transmuteSeedOil, waxCapsuleSeedOil, waxCapsule, seedOilAspectList);
	public static final CrucibleRecipe seedOilRefractory = ThaumcraftApi.addCrucibleRecipe(transmuteSeedOil, refractorySeedOil, refractoryEmpty, seedOilAspectList);
	public static final CrucibleRecipe seedOilCan = ThaumcraftApi.addCrucibleRecipe(transmuteSeedOil, canSeedOil, canEmpty, seedOilAspectList);
	
	//CrucibleRecipes for biomass
	public static final CrucibleRecipe biomassBucket = ThaumcraftApi.addCrucibleRecipe(transmuteBiomass, bucketBiomass, TransmuteLiquids.bucket, biomassAspectList);
	public static final CrucibleRecipe biomassWaxCapsule = ThaumcraftApi.addCrucibleRecipe(transmuteBiomass, waxCapsuleBiomass, waxCapsule, biomassAspectList);
	public static final CrucibleRecipe biomassRefractory = ThaumcraftApi.addCrucibleRecipe(transmuteBiomass, refractoryBiomass, refractoryEmpty, biomassAspectList);
	public static final CrucibleRecipe biomassCan = ThaumcraftApi.addCrucibleRecipe(transmuteBiomass, canBiomass, canEmpty, biomassAspectList);
	
	//CrucibleRecipes for biofuel
	public static final CrucibleRecipe biofuelBucket = ThaumcraftApi.addCrucibleRecipe(transmuteBiofuel, bucketBiofuel, TransmuteLiquids.bucket, biofuelAspectList);
	public static final CrucibleRecipe biofuelWaxCapsule = ThaumcraftApi.addCrucibleRecipe(transmuteBiofuel, waxCapsuleBiofuel, waxCapsule, biofuelAspectList);
	public static final CrucibleRecipe biofuelRefractory = ThaumcraftApi.addCrucibleRecipe(transmuteBiofuel, refractoryBiofuel, refractoryEmpty, biofuelAspectList);
	public static final CrucibleRecipe biofuelCan = ThaumcraftApi.addCrucibleRecipe(transmuteBiofuel, canBiofuel, canEmpty, biofuelAspectList);
	
	//ResearchPages for water (Forestry)
	public static final ResearchPage waterWaxCapsulePageRecipe = new ResearchPage(waterWaxCapsule);
	public static final ResearchPage waterRefractoryPageRecipe = new ResearchPage(waterRefractory);
	public static final ResearchPage waterCanPageRecipe = new ResearchPage(waterCan);
	
	//ResearchPages for lava (Forestry)
	public static final ResearchPage lavaRefractoryPageRecipe = new ResearchPage(lavaRefractory);
	public static final ResearchPage lavaCanPageRecipe = new ResearchPage(lavaCan);
	
	//ResearchPage for honey
	public static final ResearchPage honeyPageText = new ResearchPage(honeyText);
	public static final ResearchPage honeyPotPageRecipe = new ResearchPage(potHoney);
	public static final ResearchPage honeyWaxCapsulePageRecipe = new ResearchPage(honeyWaxCapsule);
	public static final ResearchPage honeyRefractoryPageRecipe = new ResearchPage(honeyRefractory);
	public static final ResearchPage honeyCanPageRecipe = new ResearchPage(honeyCan);
	
	//ResearchPage for juice
	public static final ResearchPage juicePageText = new ResearchPage(juiceText);
	public static final ResearchPage juiceWaxCapsulePageRecipe = new ResearchPage(juiceWaxCapsule);
	public static final ResearchPage juiceRefractoryPageRecipe = new ResearchPage(juiceRefractory);
	public static final ResearchPage juiceCanPageRecipe = new ResearchPage(juiceCan);
	
	//ResearchPage for seed oil
	public static final ResearchPage seedOilPageText = new ResearchPage(seedOilText);
	public static final ResearchPage seedOilWaxCapsulePageRecipe = new ResearchPage(seedOilWaxCapsule);
	public static final ResearchPage seedOilRefractoryPageRecipe = new ResearchPage(seedOilRefractory);
	public static final ResearchPage seedOilCanPageRecipe = new ResearchPage(seedOilCan);
	
	//ResearchPage for biomass
	public static final ResearchPage biomassPageText = new ResearchPage(biomassText);
	public static final ResearchPage biomassBucketPageRecipe = new ResearchPage(biomassBucket);
	public static final ResearchPage biomassWaxCapsulePageRecipe = new ResearchPage(biomassWaxCapsule);
	public static final ResearchPage biomassRefractoryPageRecipe = new ResearchPage(biomassRefractory);
	public static final ResearchPage biomassCanPageRecipe = new ResearchPage(biomassCan);
	
	//ResearchPage for biofuel
	public static final ResearchPage biofuelPageText = new ResearchPage(biofuelText);
	public static final ResearchPage biofuelBucketPageRecipe = new ResearchPage(biofuelBucket);
	public static final ResearchPage biofuelWaxCapsulePageRecipe = new ResearchPage(biofuelWaxCapsule);
	public static final ResearchPage biofuelRefractoryPageRecipe = new ResearchPage(biofuelRefractory);
	public static final ResearchPage biofuelCanPageRecipe = new ResearchPage(biofuelCan);
}
