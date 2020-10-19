package net.foundation;

import net.minecraft.item.HoeItem;
import net.minecraft.item.ToolMaterial;

public class FoundationHoe extends HoeItem {
    public FoundationHoe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}