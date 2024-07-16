package veci.zbroj;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class Boty extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack boty = new ItemStack(Material.DIAMOND_BOOTS,1);
        boty.addEnchantment(Enchantment.BLAST_PROTECTION,3);
        boty.addEnchantment(Enchantment.PROJECTILE_PROTECTION,4);
        boty.addEnchantment(Enchantment.FIRE_PROTECTION,3);
        boty.addEnchantment(Enchantment.THORNS,2);
        boty.addEnchantment(Enchantment.FROST_WALKER,1);
        player.getInventory().addItem(boty);
        return true;
    }
}
