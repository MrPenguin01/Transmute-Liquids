package com.mrpenguin.mods.transmuteliquids.api;

import cpw.mods.fml.common.Loader;

public class ModCompatability {
	public static void buildcraft() {
		try {
			Buildcraft.crucibleRecipes();
			Buildcraft.thaumonomiconResearch();
		}
		catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
	
	public static void forestry() {
		try {
			Forestry.crucibleRecipes();
			Forestry.thaumonomiconResearch();
		}
		catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
	
	public static void buildcraftForestry() {
		try{
			Buildcraft.crucibleRecipes();
			Buildcraft.crucibleRecipesForestry();
			Buildcraft.thaumonomiconResearchForestry();
		}
		catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
