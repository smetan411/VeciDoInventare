package veci.ostatni;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class KouzelneJablko extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack kouzelneJablko = new ItemStack(Material.GOLDEN_APPLE, 1);
        //kouzelneJablko.addEnchantment(Enchantment.PROTECTION_FIRE, 2);
        player.getInventory().addItem(kouzelneJablko);
        return true;
    }
}
