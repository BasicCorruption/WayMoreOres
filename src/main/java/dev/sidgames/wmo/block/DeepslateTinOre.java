package dev.sidgames.wmo.block;

import dev.sidgames.wmo.BlockLoader;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;

public class DeepslateTinOre extends BlockBase {
    public DeepslateTinOre() {
        super(FabricBlockSettings.copy(BlockLoader.TIN_ORE));
    }

}