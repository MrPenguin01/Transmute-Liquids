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

import cpw.mods.fml.common.Loader;

public class ModCompatability {
	public static void buildcraft() {
		try {
			Buildcraft.thaumonomiconResearch();
		}
		catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
	
	public static void buildcraftForestry() {
		try {
			Buildcraft.thaumonomiconResearchForestry();
		}
		catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
	
	public static void forestry() {
		try {
			Forestry.thaumonomiconResearch();
		}
		catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
	
	public static void railcraft() {
		try{
			Railcraft.thaumonomiconResearch();
		}
		catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
	
	public static void railcraftForestry() {
		try {
			Railcraft.thaumonomiconResearchForestry();
		}
		catch(Exception e) {
			e.printStackTrace(System.err);
		}
	}
}
