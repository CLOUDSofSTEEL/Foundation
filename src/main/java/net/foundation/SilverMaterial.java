package net.foundation;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class SilverMaterial implements ToolMaterial {

    public static final SilverMaterial INSTANCE = new SilverMaterial();
    @Override
    public int getDurability() {
        return 800;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 8f;
    }

    @Override
    public float getAttackDamage() {
        return 2.5f;
    }

    @Override
    public int getMiningLevel() {
        return 2;
    }

    @Override
    public int getEnchantability() {
        return 20;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Foundation.INGOT_SILVER);
    }
    
}
