package net.foundation;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class TinMaterial implements ToolMaterial {

    public static final TinMaterial INSTANCE = new TinMaterial();
    @Override
    public int getDurability() {
        return 210;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 5f;
    }

    @Override
    public float getAttackDamage() {
        return 1;
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
        return Ingredient.ofItems(Foundation.INGOT_TIN);
    }
    
}
