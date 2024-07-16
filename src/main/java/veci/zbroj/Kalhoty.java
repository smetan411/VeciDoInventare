package veci.zbroj;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class Kalhoty extends PlayerCommandExecutor {
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack kalhoty = new ItemStack(Material.DIAMOND_LEGGINGS,1);
        kalhoty.addEnchantment(Enchantment.BLAST_PROTECTION,3);
        kalhoty.addEnchantment(Enchantment.PROJECTILE_PROTECTION,4);
        kalhoty.addEnchantment(Enchantment.FIRE_PROTECTION,3);
        kalhoty.addEnchantment(Enchantment.THORNS,2);
        player.getInventory().addItem(kalhoty);
        return true;
    }
}
