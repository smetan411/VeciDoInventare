package veci.zbrane;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import veci.PlayerCommandExecutor;

public class Mec extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack mec = new ItemStack(Material.STONE_SWORD, 1);
        mec.addEnchantment(Enchantment.SHARPNESS, 5);
        mec.addEnchantment(Enchantment.KNOCKBACK, 2);
        mec.addEnchantment(Enchantment.FIRE_ASPECT, 2);

        ItemMeta vlastnosti = mec.getItemMeta();
        vlastnosti.setDisplayName("exkalibr");
        vlastnosti.setUnbreakable(true);
        mec.setItemMeta(vlastnosti);

        player.getInventory().addItem(mec);
        return true;
    }
}
