package net.foundation;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class CopperMaterial implements ToolMaterial {

    public static final CopperMaterial INSTANCE = new CopperMaterial();
    @Override
    public int getDurability() {
        return 160;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 4.5f;
    }

    @Override
    public float getAttackDamage() {
        return 0.8f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 16;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Foundation.INGOT_COPPER);
    }
    
}
