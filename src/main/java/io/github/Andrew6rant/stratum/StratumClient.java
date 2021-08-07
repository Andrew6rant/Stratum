package io.github.Andrew6rant.stratum;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.minecraft.block.Block;
import net.minecraft.client.render.RenderLayer;

import static io.github.Andrew6rant.stratum.Stratum.*;

public class StratumClient implements ClientModInitializer {
    public static void registerTranslucent(Block block) {
        BlockRenderLayerMap.INSTANCE.putBlock(block, RenderLayer.getTranslucent());
    }

    @Override
    public void onInitializeClient() {
        registerTranslucent(DACITE_COPPER_ORE);
        registerTranslucent(DIABASE_COPPER_ORE);
        registerTranslucent(PEGMATITE_COPPER_ORE);
        registerTranslucent(PUMICE_COPPER_ORE);
    }
}
