package io.github.Andrew6rant.stratum;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Stratum implements ModInitializer {

	public static final ItemGroup IGNEOUS = FabricItemGroupBuilder.build(
			new Identifier("stratum", "igneous"),
			() -> new ItemStack(Stratum.DACITE));

	public static final ItemGroup ORES = FabricItemGroupBuilder.build(
			new Identifier("stratum", "ores"),
			() -> new ItemStack(Stratum.DACITE_COPPER_ORE));

	public static void registerBlock(String blockName, Block block, ItemGroup group) {
		Registry.register(Registry.BLOCK, new Identifier("stratum", blockName), block);
		Registry.register(Registry.ITEM, new Identifier("stratum", blockName), new BlockItem(block, new FabricItemSettings().group(group)));
	}

	public static final Block DACITE = new Block(FabricBlockSettings.copyOf(Blocks.STONE));
	public static final Block DIABASE = new Block(FabricBlockSettings.copyOf(Blocks.STONE));
	public static final Block PEGMATITE = new Block(FabricBlockSettings.copyOf(Blocks.STONE));
	public static final Block PUMICE = new Block(FabricBlockSettings.copyOf(Blocks.STONE));

	public static final Block DACITE_COPPER_ORE = new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE));
	public static final Block DIABASE_COPPER_ORE = new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE));
	public static final Block PEGMATITE_COPPER_ORE = new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE));
	public static final Block PUMICE_COPPER_ORE = new Block(FabricBlockSettings.copyOf(Blocks.COPPER_ORE));

	@Override
	public void onInitialize() {
		registerBlock(Names.DACITE, DACITE, IGNEOUS);
		registerBlock(Names.DIABASE, DIABASE, IGNEOUS);
		registerBlock(Names.PEGMATITE, PEGMATITE, IGNEOUS);
		registerBlock(Names.PUMICE, PUMICE, IGNEOUS);

		registerBlock(Names.DACITE_COPPER_ORE, DACITE_COPPER_ORE, ORES);
		registerBlock(Names.DIABASE_COPPER_ORE, DIABASE_COPPER_ORE, ORES);
		registerBlock(Names.PEGMATITE_COPPER_ORE, PEGMATITE_COPPER_ORE, ORES);
		registerBlock(Names.PUMICE_COPPER_ORE, PUMICE_COPPER_ORE, ORES);
	}
}
