package dev.sidgames.wmo.world.feature;

import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.PlacedFeature;
import net.minecraft.world.gen.feature.PlacedFeatures;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;

public class WMOPlacedFeatures {
    public static final RegistryEntry<PlacedFeature> BAUXITE_ORE_PLACED = PlacedFeatures.register("bauxite_ore_placed",
            WMOConfiguredFeatures.BAUXITE_ORE, WMOOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
    public static final RegistryEntry<PlacedFeature> LEAD_ORE_PLACED = PlacedFeatures.register("lead_ore_placed",
            WMOConfiguredFeatures.LEAD_ORE, WMOOreFeatures.modifiersWithCount(7,
                    HeightRangePlacementModifier.trapezoid(YOffset.aboveBottom(-80), YOffset.aboveBottom(80))));
}
