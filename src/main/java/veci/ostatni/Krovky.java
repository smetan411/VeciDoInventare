package veci.ostatni;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class Krovky extends PlayerCommandExecutor {
    // hrac dostane elytru a 64 raket, v survivalu ma nastavena kridla, uchopi raketu
    // pomoci klavesy w se rozbehne a dvakrat klikne rychle na mezernik
    // tim se rozleti, hned nato klikne pravym raketou, to hrace postrci / boost
    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack krovky = new ItemStack(Material.ELYTRA, 1);
        ItemStack raketa = new ItemStack(Material.FIREWORK_ROCKET, 64);
        krovky.addEnchantment(Enchantment.MENDING, 1);
        player.getInventory().setChestplate(krovky);
        player.getInventory().addItem(raketa);
        return true;
    }
}
