package dev.sidgames.wmo.block;

import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Material;

public class SilverOre extends BlockBase {
    public SilverOre() {
        super(FabricBlockSettings.of(Material.METAL).hardness(5.0F).resistance(10.0F));
    }

}