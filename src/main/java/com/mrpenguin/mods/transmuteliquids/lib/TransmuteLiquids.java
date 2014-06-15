package com.mrpenguin.mods.transmuteliquids.lib;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import thaumcraft.api.ThaumcraftApi;
import thaumcraft.api.aspects.Aspect;
import thaumcraft.api.aspects.AspectList;
import thaumcraft.api.crafting.CrucibleRecipe;
import thaumcraft.api.research.ResearchPage;

public class TransmuteLiquids {
	public static final String transmuteLiquids = "Transmute Liquids";
	
	public static final String transmuteIron = "TRANSIRON";
	public static final String transmuteWater = "Transmute Water";
	public static final String transmuteLava = "Transmute Lava";
	
	public static final String waterText = "After being able to make more iron by using different aspects in the crucible, you try to do the same with liquids, after many attemps you finally are able to create water out of aspects. Now try to try it on other liquids...";
	
	public static final String lavaText = "You're able to create water from the crucible but after doing some research you've been able to get lava as well!. You might be able to create some custom liquids that have never been seen before...";
	
	public static final ItemStack bucket = new ItemStack(Items.bucket);
	public static final ItemStack glassBottle = new ItemStack(Items.glass_bottle);
	
	public static final ItemStack waterBucket = new ItemStack(Items.water_bucket);
	public static final ItemStack lavaBucket = new ItemStack(Items.lava_bucket);
	
	public static final AspectList waterAspectList = new AspectList().add(Aspect.WATER, 6).add(Aspect.EXCHANGE, 3);
	public static final AspectList lavaAspectList = new AspectList().add(Aspect.FIRE, 6).add(Aspect.EARTH, 4).add(Aspect.EXCHANGE, 3);

	public static final CrucibleRecipe waterBucketRecipe = ThaumcraftApi.addCrucibleRecipe(transmuteWater, waterBucket, bucket, waterAspectList);
	
	public static final CrucibleRecipe lavaBucketRecipe = ThaumcraftApi.addCrucibleRecipe(transmuteLava, lavaBucket, bucket, lavaAspectList);
	
	public static final ResearchPage waterPageText = new ResearchPage(waterText);
	public static final ResearchPage waterBucketPageRecipe = new ResearchPage(waterBucketRecipe);
	
	public static final ResearchPage lavaPageText = new ResearchPage(lavaText);
	public static final ResearchPage lavaBucketPageRecipe = new ResearchPage(lavaBucketRecipe);
}
