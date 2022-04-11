package veci.zbrane;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class Trojzubec extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack trojzubec = new ItemStack(Material.TRIDENT, 1);
        trojzubec.addEnchantment(Enchantment.CHANNELING, 1); //blesk
        trojzubec.addEnchantment(Enchantment.LOYALTY, 3); //vrati se do ruky
        player.getInventory().addItem(trojzubec);
        return true;
    }
}
