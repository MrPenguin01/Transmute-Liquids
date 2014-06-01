package com.mrpenguin.mods.transmuteliquids.api;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.research.ResearchItem;
import thaumcraft.api.research.ResearchPage;

import com.mrpenguin.mods.transmuteliquids.recipes.CrucibleRecipes;
import com.mrpenguin.mods.transmuteliquids.research.TLResearchItem;
import com.mrpenguin.mods.transmuteliquids.research.ThaumonomiconResearch;

import forestry.core.config.ForestryItem;

public class Forestry {
	
	private static final String canHoneyText = "After using bees to generate some honey for you, you learn the uses of honey. Afterwards, you want to find out if it's possible to create honey after making water from aspects.";
	
	public static CrucibleRecipe potHoneyRecipe;
	
	public static CrucibleRecipe waxCapsuleWaterRecipe;
	public static CrucibleRecipe waxCapsuleHoneyRecipe;
	
	public static CrucibleRecipe refractoryWaterRecipe;
	public static CrucibleRecipe refractoryLavaRecipe;
	public static CrucibleRecipe refractoryHoneyRecipe;
	
	public static CrucibleRecipe canWaterRecipe;
	public static CrucibleRecipe canLavaRecipe;
	public static CrucibleRecipe canHoneyRecipe;
	
	private static AspectList canWaterAspectList = new AspectList().add(Aspect.WATER, 4).add(Aspect.EXCHANGE, 2);
	private static AspectList canLavaAspectList = new AspectList().add(Aspect.FIRE, 4).add(Aspect.EXCHANGE, 2);
	
	private static AspectList potHoneyAspectList = new AspectList().add(Aspect.CROP, 2).add(Aspect.EXCHANGE, 2);
	
	private static AspectList canHoneyAspectList = new AspectList().add(Aspect.CROP, 4).add(Aspect.EXCHANGE, 2);
	
	public static void crucibleRecipes() {
		
		potHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Honey", ForestryItem.honeyPot.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), potHoneyAspectList);
		
		waxCapsuleWaterRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Water", ForestryItem.waxCapsuleWater.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canWaterAspectList);
		waxCapsuleHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Honey", ForestryItem.waxCapsuleHoney.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canHoneyAspectList);
		
		refractoryWaterRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Water", ForestryItem.refractoryWater.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canWaterAspectList);
		refractoryLavaRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Lava", ForestryItem.refractoryLava.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canLavaAspectList);
		refractoryHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Honey", ForestryItem.refractoryHoney.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canHoneyAspectList);
		
		canWaterRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Water", ForestryItem.canWater.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canWaterAspectList);
		canLavaRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Lava", ForestryItem.canLava.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canLavaAspectList);
		canHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Tranmute Honey", ForestryItem.canHoney.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canHoneyAspectList);
	}
	
	public static void thaumonomiconResearch() {
		ResearchItem research;
		String text;
		
		text = "1";
		research = new TLResearchItem("Transmute Water", "ALCHEMY", new AspectList(), -1, 7, 1, new ItemStack(Items.water_bucket)).setPages(new ResearchPage(ThaumonomiconResearch.waterBucketText), new ResearchPage(CrucibleRecipes.waterBucketRecipe),
				new ResearchPage(waxCapsuleWaterRecipe), new ResearchPage(refractoryWaterRecipe), new ResearchPage(canWaterRecipe)).setConcealed().setSpecial().setParents(new String[] { "TRANSIRON" }).registerResearchItem();
		
		text = "1";
		research = new TLResearchItem("Transmute Lava", "ALCHEMY", new AspectList(), -1, 9, 2, new ItemStack(Items.lava_bucket)).setPages(new ResearchPage(ThaumonomiconResearch.lavaBucketText), new ResearchPage(CrucibleRecipes.lavaBucketRecipe),
				new ResearchPage(refractoryLavaRecipe), new ResearchPage(canLavaRecipe)).setConcealed().setSecondary().setParents(new String[] { "Transmute Water" }).registerResearchItem();
	
		text = "1";
		research = new TLResearchItem("Transmute Honey", "ALCHEMY", new AspectList(), -3, 9, 0, ForestryItem.honeyPot.getItemStack(1)).setPages(new ResearchPage(canHoneyText), new ResearchPage(potHoneyRecipe),
				new ResearchPage(waxCapsuleHoneyRecipe), new ResearchPage(refractoryHoneyRecipe), new ResearchPage(canHoneyRecipe)).setConcealed().setSecondary().setParents(new String[] { "Transmute Water" }).registerResearchItem();
	}
}
