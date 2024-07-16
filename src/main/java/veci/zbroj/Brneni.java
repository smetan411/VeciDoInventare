package veci.zbroj;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class Brneni extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack brneni = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        brneni.addEnchantment(Enchantment.BLAST_PROTECTION, 3);
        brneni.addEnchantment(Enchantment.PROJECTILE_PROTECTION, 4);
        brneni.addEnchantment(Enchantment.FIRE_PROTECTION, 3);
        brneni.addEnchantment(Enchantment.THORNS, 2);
        player.getInventory().addItem(brneni);
        return true;
    }
}
