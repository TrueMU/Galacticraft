package micdoodle8.mods.galacticraft.moon;

import net.minecraft.src.Block;
import net.minecraft.src.CreativeTabs;
import net.minecraft.src.Item;
import net.minecraft.src.ItemReed;
import cpw.mods.fml.common.registry.LanguageRegistry;

public class GCMoonItems 
{
	public static Item cheeseCurd;
	public static Item meteoricIronRaw;
	public static Item meteoricIronIngot;
    public static Item cheeseBlock;
	
	public static void initItems() 
	{
		cheeseCurd = new GCMoonItemCheese(GCMoonConfigManager.idItemCheeseCurd, 1, 0.1F, false).setIconIndex(0).setItemName("cheeseCurd");
		cheeseBlock = new GCMoonItemReed(GCMoonConfigManager.idItemBlockCheese, GCMoonBlocks.cheeseBlock).setMaxStackSize(1).setIconIndex(1).setItemName("cheeseBlock");
		meteoricIronRaw = new GCMoonItem(GCMoonConfigManager.idItemMeteoricIronRaw).setIconIndex(2).setItemName("meteoricIronRaw");
		meteoricIronIngot = new GCMoonItem(GCMoonConfigManager.idItemMeteoricIronIngot).setIconIndex(3).setItemName("meteoricIronIngot");
	}
	
	public static void addNames() 
	{
		addName(cheeseCurd);
		addName(cheeseBlock);
		addName(meteoricIronRaw);
		addName(meteoricIronIngot);
	}

	private static void addName(Item item)
	{
        LanguageRegistry.instance().addStringLocalization(item.getItemName() + ".name", GalacticraftMoon.lang.get(item.getItemName() + ".name"));
	}
}