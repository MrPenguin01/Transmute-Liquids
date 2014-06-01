/*******************************************************************************
 * Copyright 2011-2014 by SirSengir
 * 
 * This work is licensed under a Creative Commons Attribution-NonCommercial-NoDerivs 3.0 Unported License.
 * 
 * To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-nd/3.0/.
 ******************************************************************************/
package forestry.core.config;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/**
 * Allows direct access to Forestry's items. Will be populated during
 * preInit and Init.
 *
 * Most items with the exception of bees do not care for damage values.
 *
 * Make sure to only reference it in postInit or later.
 *
 * @author SirSengir
 *
 */
public enum ForestryItem {

	fertilizerBio,
	fertilizerCompound,
	apatite,
	// Ingots
	ingotCopper,
	ingotTin,
	ingotBronze,
	// Tools
	wrench,
	pipette,
	bucketBiomass,
	vialEmpty,
	vialCatalyst,
	bucketBiofuel,
	// Crafting
	impregnatedCasing,
	sturdyCasing,
	hardenedCasing,
	craftingMaterial,
	// Rainmaker
	iodineCharge,
	// Gears
	gearBronze,
	gearCopper,
	gearTin,
	// Chipsets
	circuitboards,
	solderingIron,
	tubes,
	// Mail
	stamps,
	letters,
	catalogue,
	// mailIndicator,

	// Carpenter
	stickImpregnated,
	woodPulp,
	carton,
	crate,
	// Tools
	bronzePickaxe,
	brokenBronzePickaxe,
	kitPickaxe,
	bronzeShovel,
	brokenBronzeShovel,
	kitShovel,
	// Do not touch - contagious!
	tent,
	biomeFinder,
	// Moistener
	mouldyWheat,
	decayingWheat,
	mulch,
	// Peat
	peat,
	bituminousPeat,
	ash,
	// Bees
	beeQueenGE,
	beeDroneGE,
	beePrincessGE,
	beeLarvaeGE,
	beealyzer,
	imprinter,
	honeyDrop,
	scoop,
	beeswax,
	pollen,
	propolis,
	honeydew,
	royalJelly,
	honeyedSlice,
	ambrosia,
	honeyPot,
	phosphor,
	refractoryWax,
	waxCast,
	frameUntreated,
	frameImpregnated,
	frameProven,
	// Trees
	sapling,
	pollenFertile,
	treealyzer,
	grafter,
	grafterProven,
	// Butterflies
	butterflyGE,
	flutterlyzer,
	serumGE,
	caterpillarGE,
	researchNote,
	// Beverages
	beverage,
	infuser,
	// Naturalist's Armor
	naturalistHat,
	// Apiarist's Armor
	apiaristHat,
	apiaristChest,
	apiaristLegs,
	apiaristBoots,
	// Combs
	beeComb,
	// Fruits
	fruits,
	// Backpacks
	apiaristBackpack,
	lepidopteristBackpack,
	minerBackpack,
	diggerBackpack,
	foresterBackpack,
	hunterBackpack,
	builderBackpack,
	adventurerBackpack,
	// T2
	minerBackpackT2,
	diggerBackpackT2,
	foresterBackpackT2,
	hunterBackpackT2,
	builderBackpackT2,
	adventurerBackpackT2,
	// Capsules
	waxCapsule,
	waxCapsuleWater,
	waxCapsuleBiomass,
	waxCapsuleBiofuel,
	waxCapsuleOil,
	waxCapsuleFuel,
	waxCapsuleSeedOil,
	waxCapsuleHoney,
	waxCapsuleJuice,
	waxCapsuleIce,
	// Refractory Capsules
	refractoryEmpty,
	refractoryWater,
	refractoryBiomass,
	refractoryBiofuel,
	refractoryOil,
	refractoryFuel,
	refractoryLava,
	refractorySeedOil,
	refractoryHoney,
	refractoryJuice,
	refractoryIce,
	// Cans
	canWater,
	canEmpty,
	canBiomass,
	canBiofuel,
	canOil,
	canFuel,
	canLava,
	canSeedOil,
	canHoney,
	canJuice,
	canIce,
	// Crating
	cratedWood,
	cratedCobblestone,
	cratedDirt,
	cratedStone,
	cratedBrick,
	cratedCacti,
	cratedSand,
	cratedObsidian,
	cratedNetherrack,
	cratedSoulsand,
	cratedSandstone,
	cratedBogearth,
	cratedHumus,
	cratedNetherbrick,
	cratedPeat,
	cratedApatite,
	cratedFertilizer,
	cratedTin,
	cratedCopper,
	cratedBronze,
	cratedWheat,
	cratedMycelium,
	cratedMulch,
	cratedSilver,
	cratedBrass,
	cratedNikolite,
	cratedCookies,
	cratedHoneycombs,
	cratedBeeswax,
	cratedPollen,
	cratedPropolis,
	cratedHoneydew,
	cratedRoyalJelly,
	cratedCocoaComb,
	cratedRedstone,
	cratedLapis,
	cratedReeds,
	cratedClay,
	cratedGlowstone,
	cratedApples,
	cratedNetherwart,
	cratedResin,
	cratedRubber,
	cratedScrap,
	cratedUUM,
	cratedSimmeringCombs,
	cratedStringyCombs,
	cratedFrozenCombs,
	cratedDrippingCombs,
	cratedRefractoryWax,
	cratedPhosphor,
	cratedAsh,
	cratedCharcoal,
	cratedGravel,
	cratedCoal,
	cratedSeeds,
	cratedSaplings;
	private Item item;

	public void registerItem(Item item, String name) {
		this.item = item;
		item.setUnlocalizedName(name);
	}

	public boolean isItemEqual(ItemStack stack) {
		return stack != null && this.item == stack.getItem();
	}

	public boolean isItemEqual(Item i) {
		return i != null && this.item == i;
	}

	public Item item() {
		return item;
	}

	public ItemStack getItemStack() {
		return getItemStack(1, 0);
	}

	public ItemStack getItemStack(int qty) {
		return getItemStack(qty, 0);
	}

	public ItemStack getItemStack(int qty, int meta) {
		if (item == null)
			return null;
		return new ItemStack(item, qty, meta);
	}
}
