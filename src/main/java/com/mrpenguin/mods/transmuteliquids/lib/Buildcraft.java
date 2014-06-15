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
package com.mrpenguin.mods.transmuteliquids.lib;

import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.research.ResearchPage;
import cpw.mods.fml.common.registry.GameRegistry;

public class Buildcraft {
	public static final String buildcraftEnergy = "BuildCraft|Energy";
	
	public static final String transmuteOil = "Transmute Oil";
	public static final String transmuteFuel = "Transmute Fuel";
	
	public static final String oilBucketText = "After finding out all the uses of oil in the industrial side of Minecraft, you decided that you need to find a way to create oil from using different aspects. Maybe you could use this research to find a way to create fuel also...";
	
	public static final String fuelBucketText = "You finally unlocked the sercets of fuel and can create fuel using aspects, as of oil and fuel you might have reached the peak of your knowledge...";
	
	//ItemStacks for oil containers
	public static final ItemStack bucketOil = GameRegistry.findItemStack(buildcraftEnergy, "bucketOil", 1);
	public static final ItemStack waxCapsuleOil = GameRegistry.findItemStack(Forestry.Forestry, "waxCapsuleOil", 1);
	public static final ItemStack refractoryOil = GameRegistry.findItemStack(Forestry.Forestry, "refractoryOil", 1);
	public static final ItemStack canOil = GameRegistry.findItemStack(Forestry.Forestry, "canOil", 1);
	
	//ItemStacks for fuel containers
	public static final ItemStack bucketFuel = GameRegistry.findItemStack(buildcraftEnergy, "bucketFuel", 1);
	public static final ItemStack waxCapsuleFuel = GameRegistry.findItemStack(Forestry.Forestry, "waxCapsuleFuel", 1);
	public static final ItemStack refractoryFuel = GameRegistry.findItemStack(Forestry.Forestry, "refractoryFuel", 1);
	public static final ItemStack canFuel = GameRegistry.findItemStack(Forestry.Forestry, "canFuel", 1);
	
	public static final AspectList oilAspectList = new AspectList().add(Aspect.LIFE, 6).add(Aspect.EXCHANGE, 3);//AspectList for oil
	public static final AspectList fuelAspectList = new AspectList().add(Aspect.LIFE, 6).add(Aspect.TOOL, 4).add(Aspect.EXCHANGE, 3);//AspectList for fuel
	
	public static final CrucibleRecipe oilBucket = ThaumcraftApi.addCrucibleRecipe(transmuteOil, bucketOil, TransmuteLiquids.bucket, oilAspectList);
	public static final CrucibleRecipe oilWaxCapsule = ThaumcraftApi.addCrucibleRecipe(transmuteOil, waxCapsuleOil, Forestry.waxCapsule, oilAspectList);
	public static final CrucibleRecipe oilRefractory = ThaumcraftApi.addCrucibleRecipe(transmuteOil, refractoryOil, Forestry.refractoryEmpty, oilAspectList);
	public static final CrucibleRecipe oilCan = ThaumcraftApi.addCrucibleRecipe(transmuteOil, canOil, Forestry.canEmpty, oilAspectList);
	
	public static final CrucibleRecipe fuelBucket = ThaumcraftApi.addCrucibleRecipe(transmuteFuel, bucketFuel, TransmuteLiquids.bucket, fuelAspectList);
	public static final CrucibleRecipe fuelWaxCapsule = ThaumcraftApi.addCrucibleRecipe(transmuteFuel, waxCapsuleFuel, Forestry.waxCapsule, fuelAspectList);
	public static final CrucibleRecipe fuelRefractory = ThaumcraftApi.addCrucibleRecipe(transmuteFuel, refractoryFuel, Forestry.refractoryEmpty, fuelAspectList);
	public static final CrucibleRecipe fuelCan = ThaumcraftApi.addCrucibleRecipe(transmuteFuel, canFuel, Forestry.canEmpty, fuelAspectList);
	
	//ResearchPages for the oil research
	public static final ResearchPage oilPageText = new ResearchPage(oilBucketText);
	public static final ResearchPage oilBucketPageRecipe = new ResearchPage(oilBucket);
	public static final ResearchPage oilWaxCapsulePageRecipe = new ResearchPage(oilWaxCapsule);
	public static final ResearchPage oilRefractoryPageRecipe = new ResearchPage(oilRefractory);
	public static final ResearchPage oilCanPageRecipe = new ResearchPage(oilCan);
	
	//ResearchPages for the fuel research
	public static final ResearchPage fuelPageText = new ResearchPage(fuelBucketText);
	public static final ResearchPage fuelBucketPageRecipe = new ResearchPage(fuelBucket);
	public static final ResearchPage fuelWaxCapsulePageRecipe = new ResearchPage(fuelWaxCapsule);
	public static final ResearchPage fuelRefractoryPageRecipe = new ResearchPage(fuelRefractory);
	public static final ResearchPage fuelCanPageRecipe = new ResearchPage(fuelCan);
}
