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

public class Buildcraft {
	
	private static AspectList oilBucketAspectList = new AspectList().add(Aspect.LIFE, 4).add(Aspect.EXCHANGE, 2);
	public static CrucibleRecipe oilBucketRecipe;
	
	private static final String oilBucketText = "After finding out all the uses of oil in the industrial side of Minecraft, you decided that you need to find a way to create oil from using different aspects."
			+ "Maybe you could use this research to find a way to create fuel also...";
	
	public static void crucibleRecipes() {
		oilBucketRecipe = ThaumcraftApi.addCrucibleRecipe("Transmute Oil", new ItemStack(BuildCraftEnergy.bucketOil, 1), new ItemStack(Items.bucket, 1), oilBucketAspectList);
	}
	
	public static void thaumonomiconResearch() {
		ResearchItem research;
		String text;
		
		research = new TLResearchItem("Transmute Oil", "ALCHEMY", new AspectList(), 2, 8, 0, new ItemStack(BuildCraftEnergy.bucketOil)).setPages(new ResearchPage(oilBucketText), new ResearchPage(oilBucketRecipe)).setConcealed().setSecondary().setParents(new String[] { "Transmute Water" }).registerResearchItem();
	}
}