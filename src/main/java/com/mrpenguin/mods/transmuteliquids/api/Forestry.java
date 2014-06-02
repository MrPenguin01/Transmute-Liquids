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
	private static final String canBiomassText = "While working with saplings you discovered a new fuel source and can mass produce this fuel using saplings. After many unsuccessful attemps you finally have created your first millibuckets of Biomass from aspects.";
	private static final String canBiofuelText = "You finally figured out that you can refine Biomass for a more efficient fuel source that can also be mass produced. You decide to see if you can create it from aspects also, and you were very successful.";
	
	public static CrucibleRecipe potHoneyRecipe;
	
	public static CrucibleRecipe waxCapsuleWaterRecipe;
	public static CrucibleRecipe waxCapsuleHoneyRecipe;
	public static CrucibleRecipe waxCapsuleBiofuelRecipe;
	public static CrucibleRecipe waxCapsuleBiomassRecipe;
   public static CrucibleRecipe waxCapsuleJuiceRecipe;
	
	public static CrucibleRecipe refractoryWaterRecipe;
	public static CrucibleRecipe refractoryLavaRecipe;
	public static CrucibleRecipe refractoryHoneyRecipe;
	public static CrucibleRecipe refractoryBiofuelRecipe;
	public static CrucibleRecipe refractoryBiomassRecipe;
   public static CrucibleRecipe refractoryJuiceRecipe;
	
	public static CrucibleRecipe canWaterRecipe;
	public static CrucibleRecipe canLavaRecipe;
	public static CrucibleRecipe canHoneyRecipe;
	public static CrucibleRecipe canBiofuelRecipe;
	public static CrucibleRecipe canBiomassRecipe;
   public static CrucibleRecipe canJuiceRecipe;
	
	private static AspectList canWaterAspectList = new AspectList().add(Aspect.WATER, 4).add(Aspect.EXCHANGE, 2);
	private static AspectList canLavaAspectList = new AspectList().add(Aspect.FIRE, 4).add(Aspect.EXCHANGE, 2);
	
	private static AspectList potHoneyAspectList = new AspectList().add(Aspect.CROP, 2).add(Aspect.EXCHANGE, 2);
	
	private static AspectList canHoneyAspectList = new AspectList().add(Aspect.CROP, 4).add(Aspect.EXCHANGE, 2);
	private static AspectList canBiomassAspectList = new AspectList().add(Aspect.PLANT, 4).add(Aspect.EXCHANGE, 2);
	private static AspectList canBiofuelAspectList = new AspectList().add(Aspect.PLANT, 4).add(Aspect.EXCHANGE, 2).add(Aspect.TOOL, 2);
   private static AspectList canJuiceAspectList = new AspectList().add(Aspect.CROP, 4).add(Aspect.EXCHANGE, 2);
	
	public static void crucibleRecipes() {
		
		potHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Honey", ForestryItem.honeyPot.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), potHoneyAspectList);
		
		waxCapsuleWaterRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Water", ForestryItem.waxCapsuleWater.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canWaterAspectList);
		waxCapsuleHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Honey", ForestryItem.waxCapsuleHoney.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canHoneyAspectList);
		waxCapsuleBiomassRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biomass", ForestryItem.waxCapsuleBiomass.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canBiomassAspectList);
		waxCapsuleBiofuelRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biofuel", ForestryItem.waxCapsuleBiofuel.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canBiofuelAspectList);
		
		refractoryWaterRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Water", ForestryItem.refractoryWater.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canWaterAspectList);
		refractoryLavaRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Lava", ForestryItem.refractoryLava.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canLavaAspectList);
		refractoryHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Honey", ForestryItem.refractoryHoney.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canHoneyAspectList);
		refractoryBiomassRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biomass", ForestryItem.refractoryBiomass.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canBiomassAspectList);
		refractoryBiofuelRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biofuel", ForestryItem.refractoryBiofuel.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canBiofuelAspectList);
		
		canWaterRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Water", ForestryItem.canWater.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canWaterAspectList);
		canLavaRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Lava", ForestryItem.canLava.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canLavaAspectList);
		canHoneyRecipe = ThaumcraftApi.addCrucibleRecipe("Tranmute Honey", ForestryItem.canHoney.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canHoneyAspectList);
		canBiomassRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biomass", ForestryItem.canBiomass.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canBiomassAspectList);
		canBiofuelRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Biofuel", ForestryItem.canBiofuel.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canBiofuelAspectList);
	}
	
	public static void thaumonomiconResearch() {
		ResearchItem research;
		String text;
		
		text = "1";
		research = new TLResearchItem("Transmute Water", "Transmute Liquids", new AspectList(), 0, 0, 1, new ItemStack(Items.water_bucket)).setPages(new ResearchPage(ThaumonomiconResearch.waterBucketText), new ResearchPage(CrucibleRecipes.waterBucketRecipe),
				new ResearchPage(waxCapsuleWaterRecipe), new ResearchPage(refractoryWaterRecipe), new ResearchPage(canWaterRecipe)).setSpecial().setParents(new String[] { "TRANSIRON" }).registerResearchItem();
		
		text = "1";
		research = new TLResearchItem("Transmute Lava", "Transmute Liquids", new AspectList(), 0, 2, 2, new ItemStack(Items.lava_bucket)).setPages(new ResearchPage(ThaumonomiconResearch.lavaBucketText), new ResearchPage(CrucibleRecipes.lavaBucketRecipe),
				new ResearchPage(refractoryLavaRecipe), new ResearchPage(canLavaRecipe)).setConcealed().setSecondary().setParents(new String[] { "Transmute Water" }).registerResearchItem();
	
		text = "1";
		research = new TLResearchItem("Transmute Honey", "Transmute Liquids", new AspectList(), -2, 2, 0, ForestryItem.honeyPot.getItemStack(1)).setPages(new ResearchPage(canHoneyText), new ResearchPage(potHoneyRecipe),
				new ResearchPage(waxCapsuleHoneyRecipe), new ResearchPage(refractoryHoneyRecipe), new ResearchPage(canHoneyRecipe)).setConcealed().setSecondary().setParents(new String[] { "Transmute Water" }).registerResearchItem();
		
		text = "1";
		research = new TLResearchItem("Transmute Biomass", "Transmute Liquids", new AspectList(), 2, 2, 2, ForestryItem.canBiomass.getItemStack(1)).setPages(new ResearchPage(canBiomassText), new ResearchPage(waxCapsuleBiomassRecipe),
				new ResearchPage(refractoryBiomassRecipe), new ResearchPage(canBiomassRecipe)).setConcealed().setParents(new String[] { "Transmute Water" }).registerResearchItem();
		
		text = "1";
		research = new TLResearchItem("Transmute Biofuel", "Transmute Liquids", new AspectList(), 3, 4, 3, ForestryItem.canBiofuel.getItemStack(1)).setPages(new ResearchPage(canBiofuelText), new ResearchPage(waxCapsuleBiofuelRecipe),
				new ResearchPage(refractoryBiofuelRecipe), new ResearchPage(canBiofuelRecipe)).setConcealed().setSpecial().setParents(new String[] { "Transmute Biomass" }).registerResearchItem();
	}
	
	public static void thaumonomiconResearchBuidcraft() {
		ResearchItem research;
		String text;
		
		text = "1";
		research = new TLResearchItem("Transmute Water", "Transmute Liquids", new AspectList(), 0, 0, 1, new ItemStack(Items.water_bucket)).setPages(new ResearchPage(ThaumonomiconResearch.waterBucketText), new ResearchPage(CrucibleRecipes.waterBucketRecipe),
				new ResearchPage(waxCapsuleWaterRecipe), new ResearchPage(refractoryWaterRecipe), new ResearchPage(canWaterRecipe)).setSpecial().setParents(new String[] { "TRANSIRON" }).registerResearchItem();
		
		text = "1";
		research = new TLResearchItem("Transmute Lava", "Transmute Liquids", new AspectList(), 0, 2, 2, new ItemStack(Items.lava_bucket)).setPages(new ResearchPage(ThaumonomiconResearch.lavaBucketText), new ResearchPage(CrucibleRecipes.lavaBucketRecipe),
				new ResearchPage(refractoryLavaRecipe), new ResearchPage(canLavaRecipe)).setConcealed().setSecondary().setParents(new String[] { "Transmute Water" }).registerResearchItem();
	
		text = "1";
		research = new TLResearchItem("Transmute Honey", "Transmute Liquids", new AspectList(), -2, 2, 0, ForestryItem.honeyPot.getItemStack(1)).setPages(new ResearchPage(canHoneyText), new ResearchPage(potHoneyRecipe),
				new ResearchPage(waxCapsuleHoneyRecipe), new ResearchPage(refractoryHoneyRecipe), new ResearchPage(canHoneyRecipe)).setConcealed().setSecondary().setParents(new String[] { "Transmute Water" }).registerResearchItem();
		
		text = "1";
		research = new TLResearchItem("Transmute Biomass", "Transmute Liquids", new AspectList(), 4, 1, 2, ForestryItem.canBiomass.getItemStack(1)).setPages(new ResearchPage(canBiomassText), new ResearchPage(waxCapsuleBiomassRecipe),
				new ResearchPage(refractoryBiomassRecipe), new ResearchPage(canBiomassRecipe)).setConcealed().setParents(new String[] { "Transmute Oil" }).registerResearchItem();
		
		text = "1";
		research = new TLResearchItem("Transmute Biofuel", "Transmute Liquids", new AspectList(), 5, 4, 3, ForestryItem.canBiofuel.getItemStack(1)).setPages(new ResearchPage(canBiofuelText), new ResearchPage(waxCapsuleBiofuelRecipe),
				new ResearchPage(refractoryBiofuelRecipe), new ResearchPage(canBiofuelRecipe)).setConcealed().setSpecial().setParents(new String[] { "Transmute Biomass" }).registerResearchItem();
	}
}
