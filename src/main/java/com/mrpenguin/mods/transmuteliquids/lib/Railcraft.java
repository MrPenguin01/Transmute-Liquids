package com.mrpenguin.mods.transmuteliquids.lib;

import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.research.ResearchPage;
import cpw.mods.fml.common.registry.GameRegistry;

public class Railcraft {
	public static final String Railcraft = "Railcraft";
	
	public static final String transmuteCreosoteOil = "Transmute Creosote Oil";
	
	public static final String creosoteOilText = "After discovering that you can smelt coal to make Creosote Oil, you attempted to create some using different aspects.";
	
	public static final ItemStack bottleCreosoteOil = GameRegistry.findItemStack(Railcraft, "fluid.creosote.bottle", 1);
	public static final ItemStack bucketCreosoteOil = GameRegistry.findItemStack(Railcraft, "fluid.creosote.bucket", 1);
	public static final ItemStack waxCapsuleCreosoteOil = GameRegistry.findItemStack(Railcraft, "fluid.creosote.wax", 1);
	public static final ItemStack refractoryCreosoteOil = GameRegistry.findItemStack(Railcraft, "fluid.creosote.refactory", 1);
	public static final ItemStack canCreosoteOil = GameRegistry.findItemStack(Railcraft, "fluid.creosote.can", 1);
	
	public static final AspectList creosoteOilAspectList1 = new AspectList().add(Aspect.FIRE, 8).add(Aspect.ENERGY, 8).add(Aspect.TOOL, 3).add(Aspect.EXCHANGE, 3);
	public static final AspectList creosoteOilAspectList2 = new AspectList().add(Aspect.FIRE, 4).add(Aspect.ENERGY, 4).add(Aspect.TOOL, 1).add(Aspect.EXCHANGE, 3);

	public static final CrucibleRecipe creosoteOilBottle = ThaumcraftApi.addCrucibleRecipe(transmuteCreosoteOil, bottleCreosoteOil, TransmuteLiquids.glassBottle, creosoteOilAspectList2);
	public static final CrucibleRecipe creosoteOilBucket = ThaumcraftApi.addCrucibleRecipe(transmuteCreosoteOil, bucketCreosoteOil, TransmuteLiquids.bucket, creosoteOilAspectList1);
	public static final CrucibleRecipe creosoteOilWaxCapsule = ThaumcraftApi.addCrucibleRecipe(transmuteCreosoteOil, waxCapsuleCreosoteOil, Forestry.waxCapsule, creosoteOilAspectList1);
	public static final CrucibleRecipe creosoteOilRefractory = ThaumcraftApi.addCrucibleRecipe(transmuteCreosoteOil, refractoryCreosoteOil, Forestry.refractoryEmpty, creosoteOilAspectList1);
	public static final CrucibleRecipe creosoteOilCan = ThaumcraftApi.addCrucibleRecipe(transmuteCreosoteOil, canCreosoteOil, Forestry.canEmpty, creosoteOilAspectList1);

	public static final ResearchPage creosoteOilPageText = new ResearchPage(creosoteOilText);
	public static final ResearchPage creosoteOilBottlePageRecipe = new ResearchPage(creosoteOilBottle);
	public static final ResearchPage creosoteOilBucketPageRecipe = new ResearchPage(creosoteOilBucket);
	public static final ResearchPage creosoteOilWaxCapsulePageRecipe = new ResearchPage(creosoteOilWaxCapsule);
	public static final ResearchPage creosoteOilRefractoryPageRecipe = new ResearchPage(creosoteOilRefractory);
	public static final ResearchPage creosoteOilCanPageRecipe = new ResearchPage(creosoteOilCan);
}
