package veci.ostatni;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class KouzelneJablko extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack kouzelneJablko = new ItemStack(Material.GOLDEN_APPLE, 1);
        ItemStack enchantovaneJablko = new ItemStack(Material.ENCHANTED_GOLDEN_APPLE, 1);
        player.getInventory().addItem(kouzelneJablko, enchantovaneJablko);
        return true;
    }
}
