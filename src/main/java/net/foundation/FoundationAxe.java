package net.foundation;

import net.minecraft.item.AxeItem;
import net.minecraft.item.ToolMaterial;

public class FoundationAxe extends AxeItem {
    public FoundationAxe(ToolMaterial material, int attackDamage, float attackSpeed, Settings settings) {
        super(material, attackDamage, attackSpeed, settings);
    }
}