package com.gamestudio.online;

import java.util.Random;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.block.Chest;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Skeleton;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.event.entity.CreatureSpawnEvent;
import org.bukkit.event.inventory.CraftItemEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.metadata.FixedMetadataValue;
import org.bukkit.plugin.Plugin;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;

public class MinePackListener implements Listener {

	private static final String TASK_ID_KEY = "TASK_ID";
	private static final String FISHERY_KEY = "FISHERY";

	@EventHandler
	public void LingererEntity(CreatureSpawnEvent e) {
		if (e.getEntityType() == EntityType.SKELETON) {
			Skeleton skeleton = (Skeleton) e.getEntity();
			Random rand = new Random();
			int r = rand.nextInt(50);
			if (r <= 5) {
				skeleton.getEquipment().setHelmet(new ItemStack(Material.IRON_HELMET));
				skeleton.getEquipment().setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
				skeleton.getEquipment().setLeggings(new ItemStack(Material.CHAINMAIL_LEGGINGS));
				skeleton.getEquipment().setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
				skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH)
						.setBaseValue(skeleton.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue() + 10);
				skeleton.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED)
						.setBaseValue(skeleton.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue() + 0.2);

			}

		}

	}

	@EventHandler
	public void FisheryCraft(CraftItemEvent e) {
		ItemStack items = e.getRecipe().getResult();
		if (items.getItemMeta().getDisplayName() != null && items.getItemMeta().getDisplayName().contains("Fishery")) {
			Bukkit.broadcastMessage("Fishery Crafted!");

		}

	}

	@EventHandler
	public void FisheryPlace(BlockPlaceEvent e) {
		Block block = e.getBlock();
		ItemStack items = e.getItemInHand();
		if (items.getType() == Material.CHEST && items.getItemMeta().getDisplayName() != null
				&& items.getItemMeta().getDisplayName().contains("Fishery")) {
			Bukkit.broadcastMessage("Fishery placed");
			Location loc = e.getBlock().getLocation();
			Plugin plugin = Bukkit.getServer().getPluginManager().getPlugin(MinePackMain.PLUGIN_NAME);
			block.setMetadata(FISHERY_KEY, new FixedMetadataValue(plugin, "true"));

			// FisheryWork
			if (block.getRelative(BlockFace.NORTH).getType() == Material.STATIONARY_WATER
					&& block.getRelative(BlockFace.EAST).getType() == Material.STATIONARY_WATER
					&& block.getRelative(BlockFace.SOUTH).getType() == Material.STATIONARY_WATER
					&& block.getRelative(BlockFace.WEST).getType() == Material.STATIONARY_WATER) {
				final Chest chest = (Chest) block.getState();
				BukkitRunnable bukkitRunnable1 = new BukkitRunnable() {

					@Override
					public void run() {
						Random rand = new Random();
						int r = rand.nextInt(50);
						if (r <= 19) {
							chest.getBlockInventory().addItem(new ItemStack(Material.RAW_FISH, 1));

						}
						if (r >= 20 && r <= 29) {
							chest.getBlockInventory().addItem(new ItemStack(Material.RAW_FISH, 2));

						}
						if (r >= 30 && r <= 45) {
							chest.getBlockInventory().addItem(new ItemStack(Material.RAW_FISH, 3));

						}

					}

				};
				chest.setMetadata(TASK_ID_KEY, new FixedMetadataValue(plugin, bukkitRunnable1.runTaskTimer(plugin, 1200l, 2400L)));

			}

		}

	}

	@EventHandler
	public void FisheryBreak(BlockBreakEvent event) {
		Block block = event.getBlock();
		if (block.hasMetadata(TASK_ID_KEY)) {
			((BukkitTask)block.getMetadata(TASK_ID_KEY).get(0).value()).cancel();
			
		}
	}

	// @EventHandler
	// public void WildBoarEntity(CreatureSpawnEvent e) {
	// Pig pig = (Pig) e.getEntity();
	// World world = e.getEntity().getWorld();
	// Plugin plugin =
	// Bukkit.getServer().getPluginManager().getPlugin(MinePackMain.PLUGIN_NAME);
	// if (e.getEntityType() == EntityType.PIG) {
	//
	// Random rand = new Random();
	// int r = rand.nextInt(50);
	// if (r <= 5) {
	// pig.getAttribute(Attribute.GENERIC_MAX_HEALTH).setBaseValue(pig.getAttribute(Attribute.GENERIC_MAX_HEALTH).getValue()
	// + 7);
	// pig.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).setBaseValue(pig.getAttribute(Attribute.GENERIC_MOVEMENT_SPEED).getValue()
	// + 0.2);
	// BukkitRunnable bukkitRunnable1 = new BukkitRunnable() {
	//
	// @Override
	// public void run() {
	// world.playSound(pig.getLocation(), Sound.ENTITY_WOLF_GROWL, 1, 1);
	//
	// }
	//
	// };
	// bukkitRunnable1.runTaskTimer(plugin, 140L, 100L);
	//
	// }
	//
	// }
	//
	// }

}
