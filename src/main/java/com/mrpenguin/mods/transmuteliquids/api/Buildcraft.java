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
import buildcraft.BuildCraftEnergy;

import com.mrpenguin.mods.transmuteliquids.research.TLResearchItem;

import forestry.core.config.ForestryItem;

public class Buildcraft {
	
	private static AspectList oilBucketAspectList = new AspectList().add(Aspect.LIFE, 4).add(Aspect.EXCHANGE, 2);
	private static AspectList canOilAspectList = new AspectList().add(Aspect.LIFE, 4).add(Aspect.EXCHANGE, 2);
	private static AspectList fuelBucketAspectList = new AspectList().add(Aspect.LIFE, 4).add(Aspect.EXCHANGE, 2).add(Aspect.TOOL, 2);
	private static AspectList canFuelAspectList = new AspectList().add(Aspect.LIFE, 4).add(Aspect.EXCHANGE, 2).add(Aspect.TOOL, 2);
	public static CrucibleRecipe oilBucketRecipe;
	public static CrucibleRecipe waxCapsuleOilRecipe;
	public static CrucibleRecipe refractoryOilRecipe;
	public static CrucibleRecipe canOilRecipe;
	
	public static CrucibleRecipe fuelBucketRecipe;
	public static CrucibleRecipe waxCapsuleFuelRecipe;
	public static CrucibleRecipe refractoryFuelRecipe;
	public static CrucibleRecipe canFuelRecipe;
	
	private static final String oilBucketText = "After finding out all the uses of oil in the industrial side of Minecraft, you decided that you need to find a way to create oil from using different aspects."
			+ "Maybe you could use this research to find a way to create fuel also...";
	
	private static final String fuelBucketText = "You finally unlocked the sercets of fuel and can create fuel using aspects, as of oil and fuel you might have reached the peak of your knowledge...";
	
	public static void crucibleRecipes() {
		oilBucketRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Oil", new ItemStack(BuildCraftEnergy.bucketOil, 1), new ItemStack(Items.bucket, 1), oilBucketAspectList);
		fuelBucketRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Fuel", new ItemStack(BuildCraftEnergy.bucketFuel, 1), new ItemStack(Items.bucket, 1),  fuelBucketAspectList);
	}
	
	public static void thaumonomiconResearch() {
		ResearchItem research;
		String text;
		
		research = new TLResearchItem("Transmute Oil", "Transmute Liquids", new AspectList(), 2, 2, 2, new ItemStack(BuildCraftEnergy.bucketOil)).setPages(new ResearchPage(oilBucketText), new ResearchPage(oilBucketRecipe)).setConcealed().setSecondary().setParents(new String[] { "Transmute Water" }).registerResearchItem();
		research = new TLResearchItem("Transmute Fuel", "Transmute Liquids", new AspectList(), 3, 4, 3, new ItemStack(BuildCraftEnergy.bucketFuel)).setPages(new ResearchPage(fuelBucketText), new ResearchPage(fuelBucketRecipe)).setConcealed().setSpecial().setParents(new String[] { "Transmute Oil" }).registerResearchItem();
	}
	
	public static void crucibleRecipesForestry() {
		waxCapsuleOilRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Oil", ForestryItem.waxCapsuleOil.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canOilAspectList);
		refractoryOilRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Oil", ForestryItem.refractoryOil.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canOilAspectList);
		canOilRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Oil", ForestryItem.canOil.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), oilBucketAspectList);
		
		waxCapsuleFuelRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Fuel", ForestryItem.waxCapsuleFuel.getItemStack(1), ForestryItem.waxCapsule.getItemStack(1), canFuelAspectList);
		refractoryFuelRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Fuel", ForestryItem.refractoryFuel.getItemStack(1), ForestryItem.refractoryEmpty.getItemStack(1), canFuelAspectList);
		canFuelRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Fuel", ForestryItem.canFuel.getItemStack(1), ForestryItem.canEmpty.getItemStack(1), canFuelAspectList);
	}
	
	public static void thaumonomiconResearchForestry() {
		ResearchItem research;
		String text;
		
		text = "1";
		research = new TLResearchItem("Transmute Oil", "Transmute Liquids", new AspectList(), 2, 2, 2, new ItemStack(BuildCraftEnergy.bucketOil)).setPages(new ResearchPage(oilBucketText), new ResearchPage(oilBucketRecipe),
				new ResearchPage(waxCapsuleOilRecipe), new ResearchPage(refractoryOilRecipe), new ResearchPage(canOilRecipe)).setConcealed().setParents(new String[] { "Transmute Water" }).registerResearchItem();
		text = "1";
		research = new TLResearchItem("Transmute Fuel", "Transmute Liquids", new AspectList(), 3, 4, 3, new ItemStack(BuildCraftEnergy.bucketFuel)).setPages(new ResearchPage(fuelBucketText), new ResearchPage(fuelBucketRecipe),
				new ResearchPage(waxCapsuleFuelRecipe), new ResearchPage(refractoryFuelRecipe), new ResearchPage(canFuelRecipe)).setConcealed().setSpecial().setParents(new String[] { "Transmute Oil" }).registerResearchItem();
	}
}
