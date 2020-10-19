package net.foundation;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;
import net.minecraft.item.Item.Settings;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.RangeDecoratorConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;

public class Foundation implements ModInitializer {
    //CreativeTab
    public static final ItemGroup CreativeTab = FabricItemGroupBuilder.build(
        new Identifier("foundation", "creative_tab"),
        () -> new ItemStack(Foundation.INGOT_COPPER));
 
    //Blocks
        //Ores
    public static final Block ORE_COPPER = new Block(FabricBlockSettings.of(Material.STONE).hardness(2.5f));
    public static final Block ORE_TIN = new Block(FabricBlockSettings.of(Material.STONE).hardness(2f));
    public static final Block ORE_SILVER = new Block(FabricBlockSettings.of(Material.STONE).hardness(3f));
    public static final Block ORE_ALUMINUM = new Block(FabricBlockSettings.of(Material.STONE).hardness(2f));
        //WorldGen
    public static ConfiguredFeature<?, ?> ORE_COPPER_OVERWORLD = Feature.ORE
        .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
         Foundation.ORE_COPPER.getDefaultState(),
         8))//Amount per vein
        .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
        0, //Bottom Offset
        24, //Min y level
        64))) //Max Y Level
        .spreadHorizontally()
        .repeat(16); //Number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_TIN_OVERWORLD = Feature.ORE
        .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
         Foundation.ORE_TIN.getDefaultState(),
         6))//Amount per vein
        .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
        0, //Bottom Offset
        20, //Min y level
        56))) //Max Y Level
        .spreadHorizontally()
        .repeat(12); //Number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_SILVER_OVERWORLD = Feature.ORE
        .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
         Foundation.ORE_SILVER.getDefaultState(),
         4))//aAmount per vein
        .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
        0, //Bottom Offset
        12, //Min y level
        40))) //Max Y Level
        .spreadHorizontally()
        .repeat(8); //Number of veins per chunk
    public static ConfiguredFeature<?, ?> ORE_ALUMINUM_OVERWORLD = Feature.ORE
        .configure(new OreFeatureConfig(OreFeatureConfig.Rules.BASE_STONE_OVERWORLD,
         Foundation.ORE_ALUMINUM.getDefaultState(),
         8))//amount per vein
        .decorate(Decorator.RANGE.configure(new RangeDecoratorConfig(
        0, //Bottom Offset
        12, //Min y level
        72))) //Max Y Level
        .spreadHorizontally()
        .repeat(18); //Number of veins per chunk
    
    //Ingots, Nuggets
    public static final Item INGOT_COPPER = new Item(new Settings().group(CreativeTab));
    public static final Item INGOT_TIN = new Item(new Settings().group(CreativeTab));
    public static final Item INGOT_BRONZE = new Item(new Settings().group(CreativeTab));
    public static final Item INGOT_SILVER = new Item(new Settings().group(CreativeTab));
    public static final Item INGOT_ALUMINUM = new Item(new Settings().group(CreativeTab));
    public static final Item NUGGET_COPPER = new Item(new Settings().group(CreativeTab));
    public static final Item NUGGET_TIN = new Item(new Settings().group(CreativeTab));
    public static final Item NUGGET_BRONZE = new Item(new Settings().group(CreativeTab));
    public static final Item NUGGET_SILVER = new Item(new Settings().group(CreativeTab));
    public static final Item NUGGET_ALUMINUM = new Item(new Settings().group(CreativeTab));

    //Pickaxes
    public static ToolItem COPPER_PICKAXE = new FoundationPickaxe(CopperMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(CreativeTab));
    public static ToolItem TIN_PICKAXE = new FoundationPickaxe(TinMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(CreativeTab));
    public static ToolItem BRONZE_PICKAXE = new FoundationPickaxe(BronzeMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(CreativeTab));
    public static ToolItem SILVER_PICKAXE = new FoundationPickaxe(SilverMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(CreativeTab));
    public static ToolItem ALUMINUM_PICKAXE = new FoundationPickaxe(AluminumMaterial.INSTANCE, 1, -2.8f, new Item.Settings().group(CreativeTab));

    //Axes
    public static ToolItem COPPER_AXE = new FoundationAxe(CopperMaterial.INSTANCE, 7,-3.2f, new Item.Settings().group(CreativeTab));
    public static ToolItem TIN_AXE = new FoundationAxe(TinMaterial.INSTANCE, 7,-3.2f, new Item.Settings().group(CreativeTab));
    public static ToolItem BRONZE_AXE = new FoundationAxe(BronzeMaterial.INSTANCE, 7,-3.2f, new Item.Settings().group(CreativeTab));
    public static ToolItem SILVER_AXE = new FoundationAxe(SilverMaterial.INSTANCE, 7,-3.2f, new Item.Settings().group(CreativeTab));
    public static ToolItem ALUMINUM_AXE = new FoundationAxe(AluminumMaterial.INSTANCE, 7,-3.2f, new Item.Settings().group(CreativeTab));

    //Shovels
    public static ToolItem COPPER_SHOVEL = new ShovelItem(CopperMaterial.INSTANCE, 1.5f, -3.0f, new Item.Settings().group(CreativeTab));
    public static ToolItem TIN_SHOVEL = new ShovelItem(TinMaterial.INSTANCE, 1.5f, -3.0f, new Item.Settings().group(CreativeTab));
    public static ToolItem BRONZE_SHOVEL = new ShovelItem(BronzeMaterial.INSTANCE, 1.5f, -3.0f, new Item.Settings().group(CreativeTab));
    public static ToolItem SILVER_SHOVEL = new ShovelItem(SilverMaterial.INSTANCE, 1.5f, -3.0f, new Item.Settings().group(CreativeTab));
    public static ToolItem ALUMINUM_SHOVEL = new ShovelItem(AluminumMaterial.INSTANCE, 1.5f, -3.0f, new Item.Settings().group(CreativeTab));

    //Hoes
    public static ToolItem COPPER_HOE = new FoundationHoe(CopperMaterial.INSTANCE, 7, -3.2f, new Item.Settings().group(CreativeTab));
    public static ToolItem TIN_HOE = new FoundationHoe(TinMaterial.INSTANCE, 7, -3.2f, new Item.Settings().group(CreativeTab));
    public static ToolItem BRONZE_HOE = new FoundationHoe(BronzeMaterial.INSTANCE, 7, -3.2f, new Item.Settings().group(CreativeTab));
    public static ToolItem SILVER_HOE = new FoundationHoe(SilverMaterial.INSTANCE, 7, -3.2f, new Item.Settings().group(CreativeTab));
    public static ToolItem ALUMINUM_HOE = new FoundationHoe(AluminumMaterial.INSTANCE, 7, -3.2f, new Item.Settings().group(CreativeTab));

    //Swords
   public static ToolItem COPPER_SWORD = new SwordItem(CopperMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(CreativeTab));
   public static ToolItem TIN_SWORD = new SwordItem(TinMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(CreativeTab));
   public static ToolItem BRONZE_SWORD = new SwordItem(BronzeMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(CreativeTab));
   public static ToolItem SILVER_SWORD = new SwordItem(SilverMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(CreativeTab));
   public static ToolItem ALUMINUM_SWORD = new SwordItem(AluminumMaterial.INSTANCE, 3, -2.4f, new Item.Settings().group(CreativeTab));


    @Override
    public void onInitialize(){
        //Block
        Registry.register(Registry.BLOCK, new Identifier("foundation", "copper_ore"), ORE_COPPER);
        Registry.register(Registry.BLOCK, new Identifier("foundation", "tin_ore"), ORE_TIN);
        Registry.register(Registry.BLOCK, new Identifier("foundation", "silver_ore"), ORE_SILVER);
        Registry.register(Registry.BLOCK, new Identifier("foundation", "aluminum_ore"), ORE_ALUMINUM);

        //WorldGen
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("foundation", "ore_copper_overworld"), ORE_COPPER_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("foundation", "ore_tin_overworld"), ORE_TIN_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("foundation", "ore_silver_overworld"), ORE_SILVER_OVERWORLD);
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier("foundation", "ore_aluminum_overworld"), ORE_ALUMINUM_OVERWORLD);

        //Block Items
        Registry.register(Registry.ITEM, new Identifier("foundation", "copper_ore"), new BlockItem(ORE_COPPER, new Item.Settings().group(CreativeTab)));
        Registry.register(Registry.ITEM, new Identifier("foundation", "tin_ore"), new BlockItem(ORE_TIN, new Item.Settings().group(CreativeTab)));
        Registry.register(Registry.ITEM, new Identifier("foundation", "silver_ore"), new BlockItem(ORE_SILVER, new Item.Settings().group(CreativeTab)));
        Registry.register(Registry.ITEM, new Identifier("foundation", "aluminum_ore"), new BlockItem(ORE_ALUMINUM, new Item.Settings().group(CreativeTab)));

        //Ingots
        Registry.register(Registry.ITEM, new Identifier("foundation", "copper_ingot"), INGOT_COPPER);
        Registry.register(Registry.ITEM, new Identifier("foundation", "tin_ingot"), INGOT_TIN);
        Registry.register(Registry.ITEM, new Identifier("foundation", "bronze_ingot"), INGOT_BRONZE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "silver_ingot"), INGOT_SILVER);
        Registry.register(Registry.ITEM, new Identifier("foundation", "aluminum_ingot"), INGOT_ALUMINUM);

        //Nuggets
        Registry.register(Registry.ITEM, new Identifier("foundation", "copper_nugget"), NUGGET_COPPER);
        Registry.register(Registry.ITEM, new Identifier("foundation", "tin_nugget"), NUGGET_TIN);
        Registry.register(Registry.ITEM, new Identifier("foundation", "bronze_nugget"), NUGGET_BRONZE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "silver_nugget"), NUGGET_SILVER);
        Registry.register(Registry.ITEM, new Identifier("foundation", "aluminum_nugget"), NUGGET_ALUMINUM);

        //Pickaxes
        Registry.register(Registry.ITEM, new Identifier("foundation", "copper_pickaxe"), COPPER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "tin_pickaxe"), TIN_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "bronze_pickaxe"), BRONZE_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "silver_pickaxe"), SILVER_PICKAXE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "aluminum_pickaxe"), ALUMINUM_PICKAXE);

        //Axes
        Registry.register(Registry.ITEM, new Identifier("foundation", "copper_axe"), COPPER_AXE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "tin_axe"), TIN_AXE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "bronze_axe"), BRONZE_AXE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "silver_axe"), SILVER_AXE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "aluminum_axe"), ALUMINUM_AXE);

        //Shovels
        Registry.register(Registry.ITEM, new Identifier("foundation", "copper_shovel"), COPPER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("foundation", "tin_shovel"), TIN_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("foundation", "bronze_shovel"), BRONZE_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("foundation", "silver_shovel"), SILVER_SHOVEL);
        Registry.register(Registry.ITEM, new Identifier("foundation", "aluminum_shovel"), ALUMINUM_SHOVEL);

        //Hoes
        Registry.register(Registry.ITEM, new Identifier("foundation", "copper_hoe"), COPPER_HOE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "tin_hoe"), TIN_HOE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "bronze_hoe"), BRONZE_HOE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "silver_hoe"), SILVER_HOE);
        Registry.register(Registry.ITEM, new Identifier("foundation", "aluminum_hoe"), ALUMINUM_HOE);

        //Swords
        Registry.register(Registry.ITEM, new Identifier("foundation", "copper_sword"), COPPER_SWORD);
        Registry.register(Registry.ITEM, new Identifier("foundation", "tin_sword"), TIN_SWORD);
        Registry.register(Registry.ITEM, new Identifier("foundation", "bronze_sword"), BRONZE_SWORD);
        Registry.register(Registry.ITEM, new Identifier("foundation", "silver_sword"), SILVER_SWORD);
        Registry.register(Registry.ITEM, new Identifier("foundation", "aluminum_sword"), ALUMINUM_SWORD);

    }
}