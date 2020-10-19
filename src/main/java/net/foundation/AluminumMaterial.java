package net.foundation;

import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

public class AluminumMaterial implements ToolMaterial {

    public static final AluminumMaterial INSTANCE = new AluminumMaterial();
    @Override
    public int getDurability() {
        return 120;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return 3f;
    }

    @Override
    public float getAttackDamage() {
        return 1;
    }

    @Override
    public int getMiningLevel() {
        return 0;
    }

    @Override
    public int getEnchantability() {
        return 10;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return Ingredient.ofItems(Foundation.INGOT_ALUMINUM);
    }
    
}
