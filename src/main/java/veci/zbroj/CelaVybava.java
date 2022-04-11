package veci.zbroj;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class CelaVybava extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack boty = new ItemStack(Material.DIAMOND_BOOTS,1);
        boty.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS,3);
        boty.addEnchantment(Enchantment.PROTECTION_PROJECTILE,4);
        boty.addEnchantment(Enchantment.PROTECTION_FIRE,3);
        boty.addEnchantment(Enchantment.THORNS,2);
        boty.addEnchantment(Enchantment.FROST_WALKER,1);

        ItemStack brneni = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        brneni.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3);
        brneni.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
        brneni.addEnchantment(Enchantment.PROTECTION_FIRE, 3);
        brneni.addEnchantment(Enchantment.THORNS, 2);

        ItemStack helma = new ItemStack(Material.DIAMOND_HELMET, 1);
        helma.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS, 3);
        helma.addEnchantment(Enchantment.PROTECTION_PROJECTILE, 4);
        helma.addEnchantment(Enchantment.PROTECTION_FIRE, 3);
        helma.addEnchantment(Enchantment.THORNS, 2);

        ItemStack kalhoty = new ItemStack(Material.DIAMOND_LEGGINGS,1);
        kalhoty.addEnchantment(Enchantment.PROTECTION_EXPLOSIONS,3);
        kalhoty.addEnchantment(Enchantment.PROTECTION_PROJECTILE,4);
        kalhoty.addEnchantment(Enchantment.PROTECTION_FIRE,3);
        kalhoty.addEnchantment(Enchantment.THORNS,2);
        kalhoty.addEnchantment(Enchantment.PROTECTION_ENVIRONMENTAL,4);

        player.getInventory().addItem(boty, brneni, helma, kalhoty);

        return true;
    }
}
