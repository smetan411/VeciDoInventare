package veci.zbrane;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class Sekera extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack sekera = new ItemStack(Material.DIAMOND_AXE, 1);
        sekera.addEnchantment(Enchantment.DAMAGE_ALL, 5);
        player.getInventory().addItem(sekera);
        return true;
    }
}
