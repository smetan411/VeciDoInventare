package veci.zbrane;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import veci.PlayerCommandExecutor;

public class Sekera extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack sekera = new ItemStack(Material.DIAMOND_AXE, 1);
        ItemMeta vlastnosti = sekera.getItemMeta();
        vlastnosti.setDisplayName("mojeSekera");
        vlastnosti.setUnbreakable(true);
        sekera.setItemMeta(vlastnosti);
        sekera.addEnchantment(Enchantment.SHARPNESS, 1);
        player.getInventory().addItem(sekera);
        return true;
    }
}
