package veci.zbrane;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class KrumpacPickAxe extends PlayerCommandExecutor {
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack krumpac = new ItemStack(Material.IRON_PICKAXE, 1);
        krumpac.addUnsafeEnchantment(Enchantment.EFFICIENCY,200);
        player.getInventory().addItem(krumpac);
        return true;
    }
}
