package com.gamestudio.online;

import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.plugin.java.JavaPlugin;

public class MinePackMain extends JavaPlugin {

	public static String PLUGIN_NAME = "MinePackInspired";
	public static ShapedRecipe FISHERY_RECIPE = getFisheryRecipe();
	
	@Override
    public void onEnable() {
    	
    	getServer().getPluginManager().registerEvents(new MinePackListener(), this);
    	
        // Quartz Set
        ItemStack item = new ItemStack(Material.IRON_SWORD);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName("§fQuartz Sword");
        item.setItemMeta(meta);
        item.addEnchantment(Enchantment.DAMAGE_ALL, 3);
        item.addEnchantment(Enchantment.DURABILITY, 2);
        ShapedRecipe recipe = new ShapedRecipe(item);
        recipe.shape(" Q ", " Q ", " S ");
        recipe.setIngredient('Q', Material.QUARTZ);
        recipe.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe);
        
        ItemStack item0 = new ItemStack(Material.IRON_PICKAXE);
        ItemMeta meta0 = item0.getItemMeta();
        meta0.setDisplayName("§fQuartz Pickaxe");
        item0.setItemMeta(meta0);
        item0.addEnchantment(Enchantment.DIG_SPEED, 3);
        item0.addEnchantment(Enchantment.DURABILITY, 2);
        ShapedRecipe recipe0 = new ShapedRecipe(item0);
        recipe0.shape("QQQ", " S ", " S ");
        recipe0.setIngredient('Q', Material.QUARTZ);
        recipe0.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe0);
        
        ItemStack item1 = new ItemStack(Material.IRON_AXE);
        ItemMeta meta1 = item1.getItemMeta();
        meta1.setDisplayName("§fQuartz Axe");
        item1.setItemMeta(meta1);
        item1.addEnchantment(Enchantment.DIG_SPEED, 3);
        item1.addEnchantment(Enchantment.DURABILITY, 2);
        ShapedRecipe recipe1 = new ShapedRecipe(item1);
        recipe1.shape(" QQ", " SQ", " S ");
        recipe1.setIngredient('Q', Material.QUARTZ);
        recipe1.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe1);
        
        ItemStack item2 = new ItemStack(Material.IRON_SPADE);
        ItemMeta meta2 = item2.getItemMeta();
        meta2.setDisplayName("§fQuartz Shovel");
        item2.setItemMeta(meta2);
        item2.addEnchantment(Enchantment.DIG_SPEED, 3);
        item2.addEnchantment(Enchantment.DURABILITY, 2);
        ShapedRecipe recipe2 = new ShapedRecipe(item2);
        recipe2.shape(" Q ", " S ", " S ");
        recipe2.setIngredient('Q', Material.QUARTZ);
        recipe2.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe2);
        
        ItemStack item3 = new ItemStack(Material.IRON_HOE);
        ItemMeta meta3 = item3.getItemMeta();
        meta3.setDisplayName("§fQuartz Hoe");
        item3.setItemMeta(meta3);
        item3.addEnchantment(Enchantment.DURABILITY, 3);
        ShapedRecipe recipe3 = new ShapedRecipe(item3);
        recipe3.shape(" QQ", " S ", " S ");
        recipe3.setIngredient('Q', Material.QUARTZ);
        recipe3.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe3);
          
        ItemStack item4 = new ItemStack(Material.IRON_HELMET);
        ItemMeta meta4 = item4.getItemMeta();
        meta4.setDisplayName("§fQuartz Helmet");
        item4.setItemMeta(meta4);
        item4.addEnchantment(Enchantment.DURABILITY, 2);
        item4.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        ShapedRecipe recipe4 = new ShapedRecipe(item4);
        recipe4.shape("QQQ", "Q Q", "   ");
        recipe4.setIngredient('Q', Material.QUARTZ);
        Bukkit.addRecipe(recipe4);
        
        ItemStack item5 = new ItemStack(Material.IRON_CHESTPLATE);
        ItemMeta meta5 = item5.getItemMeta();
        meta5.setDisplayName("§fQuartz Chestplate");
        item5.setItemMeta(meta5);
        item5.addEnchantment(Enchantment.DURABILITY, 2);
        item5.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        ShapedRecipe recipe5 = new ShapedRecipe(item5);
        recipe5.shape("Q Q", "QQQ", "QQQ");
        recipe5.setIngredient('Q', Material.QUARTZ);
        Bukkit.addRecipe(recipe5);
        
        ItemStack item6 = new ItemStack(Material.IRON_LEGGINGS);
        ItemMeta meta6 = item6.getItemMeta();
        meta6.setDisplayName("§fQuartz Leggings");
        item6.setItemMeta(meta6);
        item6.addEnchantment(Enchantment.DURABILITY, 2);
        item6.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 3);
        ShapedRecipe recipe6 = new ShapedRecipe(item6);
        recipe6.shape("QQQ", "Q Q", "Q Q");
        recipe6.setIngredient('Q', Material.QUARTZ);
        Bukkit.addRecipe(recipe6);
        
        ItemStack item7 = new ItemStack(Material.IRON_BOOTS);
        ItemMeta meta7 = item7.getItemMeta();
        meta7.setDisplayName("§fQuartz Boots");
        item7.setItemMeta(meta7);
        item7.addEnchantment(Enchantment.DURABILITY, 2);
        item7.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        ShapedRecipe recipe7 = new ShapedRecipe(item7);
        recipe7.shape("Q Q", "Q Q", "   ");
        recipe7.setIngredient('Q', Material.QUARTZ);
        Bukkit.addRecipe(recipe7);
        
        // Ocean Set
        ItemStack item8 = new ItemStack(Material.DIAMOND_SWORD);
        ItemMeta meta8 = item8.getItemMeta();
        meta8.setDisplayName("§1Ocean Sword");
        item8.setItemMeta(meta8);
        item8.addEnchantment(Enchantment.DAMAGE_ALL, 1);
        item8.addEnchantment(Enchantment.DURABILITY, 2);
        ShapedRecipe recipe8 = new ShapedRecipe(item8);
        recipe8.shape(" H ", " H ", " S ");
        recipe8.setIngredient('H', Material.PRISMARINE_SHARD);
        recipe8.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe8);
        
        ItemStack item9 = new ItemStack(Material.DIAMOND_PICKAXE);
        ItemMeta meta9 = item9.getItemMeta();
        meta9.setDisplayName("§1Ocean Pickaxe");
        item9.setItemMeta(meta9);
        item9.addEnchantment(Enchantment.DIG_SPEED, 1);
        item9.addEnchantment(Enchantment.DURABILITY, 2);
        ShapedRecipe recipe9 = new ShapedRecipe(item9);
        recipe9.shape("HCH", " S ", " S ");
        recipe9.setIngredient('H', Material.PRISMARINE_SHARD);
        recipe9.setIngredient('C', Material.PRISMARINE_CRYSTALS);
        recipe9.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe9);
        
        ItemStack item10 = new ItemStack(Material.DIAMOND_AXE);
        ItemMeta meta10 = item10.getItemMeta();
        meta10.setDisplayName("§1Ocean Axe");
        item10.setItemMeta(meta10);
        item10.addEnchantment(Enchantment.DIG_SPEED, 1);
        item10.addEnchantment(Enchantment.DURABILITY, 2);
        ShapedRecipe recipe10 = new ShapedRecipe(item10);
        recipe10.shape(" HH", " SH", " S ");
        recipe10.setIngredient('H', Material.PRISMARINE_SHARD);
        recipe10.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe10);
        
        ItemStack item11 = new ItemStack(Material.DIAMOND_SPADE);
        ItemMeta meta11 = item11.getItemMeta();
        meta11.setDisplayName("§1Ocean Shovel");
        item11.setItemMeta(meta11);
        item11.addEnchantment(Enchantment.DIG_SPEED, 1);
        item11.addEnchantment(Enchantment.DURABILITY, 2);
        ShapedRecipe recipe11 = new ShapedRecipe(item11);
        recipe11.shape(" H ", " S ", " S ");
        recipe11.setIngredient('H', Material.PRISMARINE_SHARD);
        recipe11.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe11);
        
        ItemStack item12 = new ItemStack(Material.DIAMOND_HOE);
        ItemMeta meta12 = item12.getItemMeta();
        meta12.setDisplayName("§1Ocean Hoe");
        item12.setItemMeta(meta12);
        item12.addEnchantment(Enchantment.DURABILITY, 3);
        ShapedRecipe recipe12 = new ShapedRecipe(item12);
        recipe12.shape(" HH", " S ", " S ");
        recipe12.setIngredient('H', Material.PRISMARINE_SHARD);
        recipe12.setIngredient('S', Material.STICK);
        Bukkit.addRecipe(recipe12);
          
        ItemStack item13 = new ItemStack(Material.DIAMOND_HELMET);
        ItemMeta meta13 = item13.getItemMeta();
        meta13.setDisplayName("§1Ocean Helmet");
        item13.setItemMeta(meta13);
        item13.addEnchantment(Enchantment.DURABILITY, 2);
        item13.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        item13.addEnchantment(Enchantment.OXYGEN, 3);
        ShapedRecipe recipe13 = new ShapedRecipe(item13);
        recipe13.shape("HCH", "HGH", "   ");
        recipe13.setIngredient('H', Material.PRISMARINE_SHARD);
        recipe13.setIngredient('C', Material.PRISMARINE_CRYSTALS);
        recipe13.setIngredient('G', Material.THIN_GLASS);
        Bukkit.addRecipe(recipe13);
        
        ItemStack item14 = new ItemStack(Material.DIAMOND_CHESTPLATE);
        ItemMeta meta14 = item14.getItemMeta();
        meta14.setDisplayName("§1Ocean Chestplate");
        item14.setItemMeta(meta14);
        item14.addEnchantment(Enchantment.DURABILITY, 2);
        item14.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        ShapedRecipe recipe14 = new ShapedRecipe(item14);
        recipe14.shape("H H", "HHH", "HHH");
        recipe14.setIngredient('H', Material.PRISMARINE_SHARD);
        Bukkit.addRecipe(recipe14);
        
        ItemStack item15 = new ItemStack(Material.DIAMOND_LEGGINGS);
        ItemMeta meta15 = item15.getItemMeta();
        meta15.setDisplayName("§1Ocean Leggings");
        item15.setItemMeta(meta15);
        item15.addEnchantment(Enchantment.DURABILITY, 2);
        item15.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 2);
        ShapedRecipe recipe15 = new ShapedRecipe(item15);
        recipe15.shape("HHH", "H H", "H H");
        recipe15.setIngredient('H', Material.PRISMARINE_SHARD);
        Bukkit.addRecipe(recipe15);
        
        ItemStack item16 = new ItemStack(Material.DIAMOND_BOOTS);
        ItemMeta meta16 = item16.getItemMeta();
        meta16.setDisplayName("§1Ocean Boots");
        item16.setItemMeta(meta16);
        item16.addEnchantment(Enchantment.DURABILITY, 2);
        item16.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL, 1);
        item16.addEnchantment(Enchantment.DEPTH_STRIDER, 2);
        ShapedRecipe recipe16 = new ShapedRecipe(item16);
        recipe16.shape("H H", "H H", "   ");
        recipe16.setIngredient('H', Material.PRISMARINE_SHARD);
        Bukkit.addRecipe(recipe16);
        
        // Basic Machines
        
        Bukkit.addRecipe(FISHERY_RECIPE);
        
    }

	private static ShapedRecipe getFisheryRecipe() {
		ItemStack item17 = new ItemStack(Material.CHEST);
        ItemMeta meta17 = item17.getItemMeta();
        meta17.setDisplayName("§1Fishery");
        item17.setItemMeta(meta17);
        ShapedRecipe recipe17 = new ShapedRecipe(item17);
        recipe17.shape("F  ", "W W", "WBW");
        recipe17.setIngredient('W', Material.WOOD);
        recipe17.setIngredient('B', Material.BUCKET);
        recipe17.setIngredient('F', Material.FISHING_ROD);
		return recipe17;
	}

    @Override
    public void onDisable() {

    }

}
