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

import net.minecraftforge.common.MinecraftForge;

import com.mrpenguin.mods.transmuteliquids.api.ModCompatability;
import com.mrpenguin.mods.transmuteliquids.api.Railcraft;
import com.mrpenguin.mods.transmuteliquids.client.CapeEventHandler;
import com.mrpenguin.mods.transmuteliquids.lib.Buildcraft;
import com.mrpenguin.mods.transmuteliquids.lib.Forestry;
import com.mrpenguin.mods.transmuteliquids.lib.Reference;
import com.mrpenguin.mods.transmuteliquids.proxy.CommonProxy;
import com.mrpenguin.mods.transmuteliquids.research.ThaumonomiconResearch;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.relauncher.Side;

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
		
		if(event.getSide() == Side.CLIENT) {
			MinecraftForge.EVENT_BUS.register(new CapeEventHandler());
		}
		
		System.out.println("[TL] Transmute Liquids : Successful Init");
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		
		ThaumonomiconResearch.addResearchTab();
		
		if(Loader.isModLoaded(Railcraft.Railcraft) && Loader.isModLoaded(Forestry.Forestry)) {
			ModCompatability.railcraftForestry();
			System.out.println("[TL] Transmute Liquids : Successfully Loaded Railcraft and Forestry Addon");
		}else if(Loader.isModLoaded(Railcraft.Railcraft)) {
			ModCompatability.railcraft();
			System.out.println("[TL] Transmute Liquids : Successfully Loaded Railcraft Addon");
		}
		
		if(Loader.isModLoaded(Forestry.Forestry)) {
			ModCompatability.forestry();
			System.out.println("[TL] Transmute Liquids : Successfully Loaded Forestry Addon");
		}
		
		if(Loader.isModLoaded(Buildcraft.buildcraftEnergy) && Loader.isModLoaded(Forestry.Forestry)) {
			ModCompatability.buildcraftForestry();
			System.out.println("[TL] Transmute Liquids : Successfully Loaded Buildcraft and Forestry Addon");
		}else if(Loader.isModLoaded(Buildcraft.buildcraftEnergy)){
			ModCompatability.buildcraft();
			System.out.println("[TL] Transmute Liquids : Successfully Loaded Buildcraft Addon");
		}
		
		System.out.println("[TL] Transmute Liquids : Successful PostInit");
	}
	
}
