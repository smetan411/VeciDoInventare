package veci.zbroj;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class Helma extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack helma = new ItemStack(Material.DIAMOND_HELMET, 1);
        helma.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3);
        helma.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
        helma.addEnchantment(Enchantment.PROTECTION_FIRE, 3);
        helma.addEnchantment(Enchantment.THORNS, 2);
        player.getInventory().addItem(helma);
        return true;

    }
}
