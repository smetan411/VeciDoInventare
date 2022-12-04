package veci.zbrane;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import veci.PlayerCommandExecutor;

public class Stit extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack stit = new ItemStack(Material.SHIELD, 1);
        stit.addEnchantment(Enchantment.MENDING, 1);
/*
        varianta>:
        ItemMeta vlastnosti = stit.getItemMeta();
        vlastnosti.setDisplayName("exkalibr");
        vlastnosti.setUnbreakable(true);
        stit.setItemMeta(vlastnosti);

   */
        player.getInventory().addItem(stit);
        return true;
    }
}
