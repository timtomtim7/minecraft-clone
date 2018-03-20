package blue.sparse.minecraft.common.item.impl

import blue.sparse.minecraft.common.item.ItemType
import blue.sparse.minecraft.common.item.impl.types.*
import blue.sparse.minecraft.common.item.impl.types.armor.ItemTypeBoots
import blue.sparse.minecraft.common.item.impl.types.armor.ItemTypeChestplate
import blue.sparse.minecraft.common.item.impl.types.armor.ItemTypeHelmet
import blue.sparse.minecraft.common.item.impl.types.armor.ItemTypeLeggings
import blue.sparse.minecraft.common.item.impl.types.tools.ItemTypeTool
import blue.sparse.minecraft.common.item.impl.types.tools.ItemTypeWeapon

/**
 * EDIBLE ITEM TYPES
 */

/*

if(item.type == ItemTypeDiamondSword) {
    val durability = item.type.durability
}

 */
object ItemApple:               ItemTypeEdible("apple")
object ItemAppleGolden:         ItemTypeEdible("apple_golden")
object ItemBeefCooked:          ItemTypeEdible("beef_cooked")
object ItemBeefRaw:             ItemTypeEdible("beef_raw")
object ItemBeetrootSoup:        ItemTypeEdible("beetroot_soup", 1)
object ItemBread:               ItemTypeEdible("bread")
object ItemCake:                ItemTypeEdible("cake", 1)
object ItemCarrot:              ItemTypeEdible("carrot")
object ItemCarrotGolden:        ItemTypeEdible("carrot_golden")
object ItemChickenCooked:       ItemTypeEdible("chicken_cooked")
object ItemChickenRaw:          ItemTypeEdible("chicken_raw")
object ItemChorusFruit:         ItemTypeEdible("chorus_fruit")
object ItemCookie:              ItemTypeEdible("cookie")
object ItemFishClownfishRaw:    ItemTypeEdible("fish_clownfish_raw")
object ItemFishCodCooked:       ItemTypeEdible("fish_cod_cooked")
object ItemFishCodRaw:          ItemTypeEdible("fish_cod_raw")
object ItemFishPufferfishRaw:   ItemTypeEdible("fish_pufferfish_raw")
object ItemFishSalmonCooked:    ItemTypeEdible("fish_salmon_cooked")
object ItemFishSalmonRaw:       ItemTypeEdible("fish_salmon_raw")
object ItemMelon:               ItemTypeEdible("melon")
object ItemBucketMilk:          ItemTypeEdible("bucket_milk", 1)
object ItemMushroomStew:        ItemTypeEdible("mushroom_stew", 1)
object ItemMuttonCooked:        ItemTypeEdible("mutton_cooked")
object ItemMuttonRaw:           ItemTypeEdible("mutton_raw")
object ItemPorkChopCooked:      ItemTypeEdible("porkchop_cooked")
object ItemPorkChopRaw:         ItemTypeEdible("porkchop_raw")
object ItemPotato:              ItemTypeEdible("potato")
object ItemPotatoBaked:         ItemTypeEdible("potato_baked")
object ItemPotatoPoisonous:     ItemTypeEdible("potato_poisonous")
object ItemPumpkinPie:          ItemTypeEdible("pumpkin_pie")
object ItemRabbitCooked:        ItemTypeEdible("rabbit_cooked")
object ItemRabbitRaw:           ItemTypeEdible("rabbit_raw")
object ItemRabbitStew:          ItemTypeEdible("rabbit_stew")
object ItemSpiderEye:           ItemTypeEdible("spider_eye")

/**
 * BOAT ITEM TYPES
 */
object ItemAcaciaBoat:          ItemTypeBoat("acacia_boat")
object ItemBirchBoat:           ItemTypeBoat("birch_boat")
object ItemDarkOakBoat:         ItemTypeBoat("dark_oak_boat")
object ItemJungleBoat:          ItemTypeBoat("jungle_boat")
object ItemOakBoat:             ItemTypeBoat("oak_boat")
object ItemSpruceBoat:          ItemTypeBoat("spruce_boat")

/**
 * ARMOR ITEM TYPES
 */
object ItemChainmailHelmet:     ItemTypeHelmet("chainmail_helmet", 166)
object ItemDiamondHelmet:       ItemTypeHelmet("diamond_helmet",  364)
object ItemGoldHelmet:          ItemTypeHelmet("gold_helmet",  78)
object ItemIronHelmet:          ItemTypeHelmet("iron_helmet",  166)

object ItemChainmailChestplate: ItemTypeChestplate("chainmail_chestplate", 241)
object ItemDiamondChestplate:   ItemTypeChestplate("diamond_chestplate", 529)
object ItemGoldChestplate:      ItemTypeChestplate("gold_chestplate", 113)
object ItemIronChestplate:      ItemTypeChestplate("iron_chestplate", 241)

object ItemChainmailLeggings:   ItemTypeLeggings("chainmail_leggings", 226)
object ItemDiamondLeggings:     ItemTypeLeggings("diamond_leggings", 496)
object ItemGoldLeggings:        ItemTypeLeggings("gold_leggings", 106)
object ItemIronLeggings:        ItemTypeLeggings("iron_leggings", 226)

object ItemChainmailBoots:      ItemTypeBoots("chainmail_boots", 196)
object ItemDiamondBoots:        ItemTypeBoots("diamond_boots", 430)
object ItemGoldBoots:           ItemTypeBoots("gold_boots", 92 )
object ItemIronBoots:           ItemTypeBoots("iron_boots", 196)

/**
 * TOOL ITEM TYPES
 */
object ItemDiamondSword:        ItemTypeWeapon("diamond_sword", 1562)
object ItemGoldSword:           ItemTypeWeapon("gold_sword", 33)
object ItemIronSword:           ItemTypeWeapon("iron_sword", 251)
object ItemStoneSword:          ItemTypeWeapon("stone_sword", 132)
object ItemWoodSword:           ItemTypeWeapon("wood_sword", 60)

object ItemDiamondPickaxe:      ItemTypeTool("diamond_pickaxe", 1562)
object ItemGoldPickaxe:         ItemTypeTool("gold_pickaxe", 33)
object ItemIronPickaxe:         ItemTypeTool("iron_pickaxe", 251)
object ItemStonePickaxe:        ItemTypeTool("stone_pickaxe", 132)
object ItemWoodPickaxe:         ItemTypeTool("wood_pickaxe", 60)

object ItemDiamondAxe:          ItemTypeWeapon("diamond_axe", 1562)
object ItemGoldAxe:             ItemTypeWeapon("gold_axe", 33)
object ItemIronAxe:             ItemTypeWeapon("iron_axe", 251)
object ItemStoneAxe:            ItemTypeWeapon("stone_axe", 132)
object ItemWoodAxe:             ItemTypeWeapon("wood_axe", 60)

object ItemDiamondShovel:       ItemTypeTool("diamond_shovel", 1562)
object ItemGoldShovel:          ItemTypeTool("gold_shovel", 33)
object ItemIronShovel:          ItemTypeTool("iron_shovel", 251)
object ItemStoneShovel:         ItemTypeTool("stone_shovel", 132)
object ItemWoodShovel:          ItemTypeTool("wood_shovel", 60)

object ItemDiamondHoe:          ItemTypeTool("diamond_hoe", 1562)
object ItemGoldHoe:             ItemTypeTool("gold_hoe", 33)
object ItemIronHoe:             ItemTypeTool("iron_hoe", 251)
object ItemStoneHoe:            ItemTypeTool("stone_hoe", 132)
object ItemWoodHoe:             ItemTypeTool("wood_hoe", 60)

object ItemShears:              ItemTypeDurable("shears", 238)

/**
 * DURABLE ITEM TYPES
 */
// TODO: Actually implement textures TOM | object ItemFishingRod:          ItemTypeDurable("fishing_rod", 65)
object ItemFlintAndSteel:       ItemTypeDurable("flint_and_steel", 65)
object ItemCarrotOnAStick:      ItemTypeDurable("carrot_on_a_stick", 26)
object ItemElytra:              ItemTypeDurable("elytra", 432)

/**
 * DOOR ITEM TYPES
 */
object ItemDoorAcacia:          ItemTypeDoor("door_acacia")
object ItemDoorBirch:           ItemTypeDoor("door_birch")
object ItemDoorDarkOak:         ItemTypeDoor("door_dark_oak")
object ItemDoorIron:            ItemTypeDoor("door_iron")
object ItemDoorJungle:          ItemTypeDoor("door_jungle")
object ItemDoorSpruce:          ItemTypeDoor("door_spruce")
object ItemDoorWood:            ItemTypeDoor("door_wood")

/**
 * THROWABLE ITEM TYPES
 */
object ItemSnowball:            ItemTypeThrowable("snowball")
object ItemEnderPearl:          ItemTypeThrowable("ender_pearl")
object ItemEgg:                 ItemTypeThrowable("egg")
object ItemExperienceBottle:    ItemTypeThrowable("experience_bottle", 64)



object ItemArrow: ItemType("arrow")
object ItemBarrier: ItemType("barrier")
object ItemBeetroot: ItemType("beetroot")
object ItemBeetrootSeeds: ItemType("beetroot_seeds")
object ItemBlazePowder: ItemType("blaze_powder")
object ItemBlazeRod: ItemType("blaze_rod")
object ItemBone: ItemType("bone")
object ItemBookEnchanted: ItemType("book_enchanted")
object ItemBookNormal: ItemType("book_normal")
object ItemBookWritable: ItemType("book_writable")
object ItemBookWritten: ItemType("book_written")
object ItemBowl: ItemType("bowl")
object ItemBrewingStand: ItemType("brewing_stand")
object ItemBrick: ItemType("brick")
object ItemBrokenElytra: ItemType("broken_elytra")
object ItemBucketEmpty: ItemType("bucket_empty")
object ItemBucketLava: ItemType("bucket_lava")
object ItemBucketWater: ItemType("bucket_water")
object ItemCauldron: ItemType("cauldron")
object ItemCharcoal: ItemType("charcoal")
object ItemChorusFruitPopped: ItemType("chorus_fruit_popped")
object ItemClayBall: ItemType("clay_ball")
object ItemCoal: ItemType("coal")
object ItemComparator: ItemType("comparator")
object ItemDiamond: ItemType("diamond")
object ItemDiamondHorseArmor: ItemType("diamond_horse_armor")
object ItemDragonBreath: ItemType("dragon_breath")
object ItemDyePowderBlack: ItemType("dye_powder_black")
object ItemDyePowderBlue: ItemType("dye_powder_blue")
object ItemDyePowderBrown: ItemType("dye_powder_brown")
object ItemDyePowderCyan: ItemType("dye_powder_cyan")
object ItemDyePowderGray: ItemType("dye_powder_gray")
object ItemDyePowderGreen: ItemType("dye_powder_green")
object ItemDyePowderLightBlue: ItemType("dye_powder_light_blue")
object ItemDyePowderLime: ItemType("dye_powder_lime")
object ItemDyePowderMagenta: ItemType("dye_powder_magenta")
object ItemDyePowderOrange: ItemType("dye_powder_orange")
object ItemDyePowderPink: ItemType("dye_powder_pink")
object ItemDyePowderPurple: ItemType("dye_powder_purple")
object ItemDyePowderRed: ItemType("dye_powder_red")
object ItemDyePowderSilver: ItemType("dye_powder_silver")
object ItemDyePowderWhite: ItemType("dye_powder_white")
object ItemDyePowderYellow: ItemType("dye_powder_yellow")
object ItemEmerald: ItemType("emerald")
object ItemEnderEye: ItemType("ender_eye")
object ItemEndCrystal: ItemType("end_crystal")
object ItemFeather: ItemType("feather")
object ItemFireball: ItemType("fireball")
object ItemFireworks: ItemType("fireworks")
object ItemFlint: ItemType("flint")
object ItemFlowerPot: ItemType("flower_pot")
object ItemGhastTear: ItemType("ghast_tear")
object ItemGlowstoneDust: ItemType("glowstone_dust")
object ItemGoldHorseArmor: ItemType("gold_horse_armor")
object ItemGoldIngot: ItemType("gold_ingot")
object ItemGoldNugget: ItemType("gold_nugget")
object ItemGunpowder: ItemType("gunpowder")
object ItemHopper: ItemType("hopper")
object ItemIronHorseArmor: ItemType("iron_horse_armor")
object ItemIronIngot: ItemType("iron_ingot")
object ItemIronNugget: ItemType("iron_nugget")
object ItemItemFrame: ItemType("item_frame")
object ItemKnowledgeBook: ItemType("knowledge_book")
object ItemLead: ItemType("lead")
object ItemLeather: ItemType("leather")
object ItemMagmaCream: ItemType("magma_cream")
object ItemMapEmpty: ItemType("map_empty")
//object ItemMapFilled: ItemType("map_filled")
object ItemMelonSpeckled: ItemType("melon_speckled")
object ItemMinecartChest: ItemType("minecart_chest")
object ItemMinecartCommandBlock: ItemType("minecart_command_block")
object ItemMinecartFurnace: ItemType("minecart_furnace")
object ItemMinecartHopper: ItemType("minecart_hopper")
object ItemMinecartNormal: ItemType("minecart_normal")
object ItemMinecartTnt: ItemType("minecart_tnt")
object ItemNameTag: ItemType("name_tag")
object ItemNetherBrick: ItemType("netherbrick")
object ItemNetherStar: ItemType("nether_star")
object ItemNetherWart: ItemType("nether_wart")
object ItemPainting: ItemType("painting")
object ItemPaper: ItemType("paper")
object ItemPrismarineCrystals: ItemType("prismarine_crystals")
object ItemPrismarineShard: ItemType("prismarine_shard")
object ItemQuartz: ItemType("quartz")
object ItemRabbitFoot: ItemType("rabbit_foot")
object ItemRabbitHide: ItemType("rabbit_hide")
object ItemRecordBlocks: ItemType("record_blocks")
object ItemRecordCat: ItemType("record_cat")
object ItemRecordChirp: ItemType("record_chirp")
object ItemRecordFar: ItemType("record_far")
object ItemRecordMall: ItemType("record_mall")
object ItemRecordMellohi: ItemType("record_mellohi")
object ItemRecordStal: ItemType("record_stal")
object ItemRecordStrad: ItemType("record_strad")
object ItemRecordWait: ItemType("record_wait")
object ItemRecordWard: ItemType("record_ward")
object ItemRedstoneDust: ItemType("redstone_dust")
object ItemReeds: ItemType("reeds")
object ItemRepeater: ItemType("repeater")
object ItemRottenFlesh: ItemType("rotten_flesh")
object ItemRuby: ItemType("ruby")
object ItemSaddle: ItemType("saddle")
object ItemSeedsMelon: ItemType("seeds_melon")
object ItemSeedsPumpkin: ItemType("seeds_pumpkin")
object ItemSeedsWheat: ItemType("seeds_wheat")
object ItemShulkerShell: ItemType("shulker_shell")
object ItemSign: ItemType("sign")
object ItemSlimeBall: ItemType("slimeball")
object ItemSpectralArrow: ItemType("spectral_arrow")
object ItemSpiderEyeFermented: ItemType("spider_eye_fermented")
object ItemStick: ItemType("stick")
object ItemString: ItemType("string")
object ItemStructureVoid: ItemType("structure_void")
object ItemSugar: ItemType("sugar")
object ItemTotem: ItemType("totem")
object ItemWheat: ItemType("wheat")
object ItemWoodenArmorStand: ItemType("wooden_armorstand")