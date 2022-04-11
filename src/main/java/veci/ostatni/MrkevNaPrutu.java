package veci.ostatni;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Pig;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import veci.PlayerCommandExecutor;

public class MrkevNaPrutu extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack mrkevNaPrutu = new ItemStack(Material.CARROT_ON_A_STICK, 1);
        player.getInventory().addItem(mrkevNaPrutu);

        Pig prase = world.spawn(playerLocation, Pig.class);
        prase.setSaddle(true);
        prase.addPassenger(player);
        return true;
    }
}
