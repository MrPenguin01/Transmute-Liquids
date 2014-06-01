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
package com.mrpenguin.mods.transmuteliquids;

import com.mrpenguin.mods.transmuteliquids.api.Buildcraft;
import com.mrpenguin.mods.transmuteliquids.api.ModCompatability;
import com.mrpenguin.mods.transmuteliquids.lib.Reference;
import com.mrpenguin.mods.transmuteliquids.proxy.CommonProxy;
import com.mrpenguin.mods.transmuteliquids.recipes.CrucibleRecipes;
import com.mrpenguin.mods.transmuteliquids.research.ThaumonomiconResearch;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, dependencies = "required-after:Thaumcraft;")
public class TransmuteLiquids {
	
	@SidedProxy(clientSide = "com.mrpenguin.mods.transmuteliquids.proxy.ClientProxy", serverSide = "com.mrpenguin.mods.transmuteliquids.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Instance(Reference.MOD_ID)
	public static TransmuteLiquids instance;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println("[TL] Transmute Liquids : Successful PreInit");
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event) {
		System.out.println("[TL] Transmute Liquids : Successful Init");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		CrucibleRecipes.add();
		
		if(Loader.isModLoaded("Forestry") && Loader.isModLoaded("BuildCraft|Energy")) {
			ModCompatability.forestry();
			ModCompatability.buildcraftForestry();
			System.out.println("[TL] Forestry and Buildcraft Addons Loaded");
		}else{
			if(Loader.isModLoaded("Forestry")) {
				ModCompatability.forestry();
				System.out.println("[TL] Forestry Addon Loaded");
			}else{
				ThaumonomiconResearch.addResearch();
			}
			if(Loader.isModLoaded("BuildCraft|Energy")) {
				ModCompatability.buildcraft();
				System.out.println("[TL] Buildcraft Addon Loaded");
			}
		}
		
		System.out.println("[TL] Transmute Liquids : Successful PostInit");
	}
	
}
