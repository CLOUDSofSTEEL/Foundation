package net.foundation.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.foundation.Foundation;
import net.minecraft.world.biome.GenerationSettings;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.DefaultBiomeFeatures;

@Mixin(DefaultBiomeFeatures.class)
public class FoundationOreGenMixin {
  @Inject(method = "addDefaultOres(Lnet/minecraft/world/biome/GenerationSettings$Builder;)V", at = @At("TAIL"))
    private static void addDefaultOres(GenerationSettings.Builder builder, CallbackInfo ci)
    {
    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, Foundation.ORE_COPPER_OVERWORLD);
    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, Foundation.ORE_TIN_OVERWORLD);
    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, Foundation.ORE_SILVER_OVERWORLD);
    builder.feature(GenerationStep.Feature.UNDERGROUND_ORES, Foundation.ORE_ALUMINUM_OVERWORLD);
    }
  
}