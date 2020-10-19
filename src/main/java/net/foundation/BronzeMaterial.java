package net.foundation;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class BronzeMaterial implements ToolMaterial {

    public static final BronzeMaterial INSTANCE = new BronzeMaterial();
    @Override
    public int getDurability() {
        return 300;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 7f;
    }

    @Override
    public float getAttackDamage() {
        return 2.5f;
    }

    @Override
    public int getMiningLevel() {
        return 1;
    }

    @Override
    public int getEnchantability() {
        return 12;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Foundation.INGOT_BRONZE);
    }
    
}
