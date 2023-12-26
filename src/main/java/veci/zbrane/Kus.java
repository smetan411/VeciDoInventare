package veci.zbrane;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class Kus extends PlayerCommandExecutor {
    //kus v prave, raketa v leve, pravou zamirime, pustime, klikneme pravou
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack kus = new ItemStack(Material.CROSSBOW);
        kus.addEnchantment(Enchantment.MULTISHOT, 1);
        ItemStack raketa = new ItemStack(Material.FIREWORK_ROCKET,64);

        player.getInventory().setItemInMainHand(kus);
        player.getInventory().setItemInOffHand(raketa);
        return true;
    }
}
