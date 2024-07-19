package veci.zbrane;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class LukSipy extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack luk = new ItemStack(Material.BOW, 1);
        ItemStack sipy = new ItemStack(Material.ARROW, 1);
        luk.addEnchantment(Enchantment.INFINITY, 1);
        luk.addEnchantment(Enchantment.FLAME, 1);
        luk.addEnchantment(Enchantment.KNOCKBACK, 1);
        luk.addEnchantment(Enchantment.POWER,4);
        player.getInventory().addItem(luk);
        player.getInventory().addItem(sipy);
        return true;
    }
}
