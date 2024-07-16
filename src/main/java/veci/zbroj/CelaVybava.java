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
        boty.addEnchantment(Enchantment.BLAST_PROTECTION,3);
        boty.addEnchantment(Enchantment.PROJECTILE_PROTECTION,4);
        boty.addEnchantment(Enchantment.FIRE_PROTECTION,3);
        boty.addEnchantment(Enchantment.THORNS,2);
        boty.addEnchantment(Enchantment.FROST_WALKER,1);

        ItemStack pancir = new ItemStack(Material.DIAMOND_CHESTPLATE, 1);
        pancir.addEnchantment(Enchantment.BLAST_PROTECTION, 3);
        pancir.addEnchantment(Enchantment.PROJECTILE_PROTECTION, 4);
        pancir.addEnchantment(Enchantment.FIRE_PROTECTION, 3);
        pancir.addEnchantment(Enchantment.THORNS, 2);

        ItemStack helma = new ItemStack(Material.DIAMOND_HELMET, 1);
        helma.addEnchantment(Enchantment.BLAST_PROTECTION, 3);
        helma.addEnchantment(Enchantment.PROJECTILE_PROTECTION, 4);
        helma.addEnchantment(Enchantment.FIRE_PROTECTION, 3);
        helma.addEnchantment(Enchantment.THORNS, 2);

        ItemStack kalhoty = new ItemStack(Material.DIAMOND_LEGGINGS,1);
        kalhoty.addEnchantment(Enchantment.BLAST_PROTECTION,3);
        kalhoty.addEnchantment(Enchantment.PROJECTILE_PROTECTION,4);
        kalhoty.addEnchantment(Enchantment.FIRE_PROTECTION,3);
        kalhoty.addEnchantment(Enchantment.THORNS,2);

        // mame dve moznosti, do inventare nebo hrace oblect
        // player.getInventory().addItem(boty, pancir, helma, kalhoty);
        player.getInventory().setBoots(boty);
        player.getInventory().setHelmet(helma);
        player.getInventory().setLeggings(kalhoty);
        player.getInventory().setChestplate(pancir);

        return true;
    }
}
