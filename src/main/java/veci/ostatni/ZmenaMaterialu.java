package veci.ostatni;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.PlayerInventory;
import veci.PlayerCommandExecutor;

public class ZmenaMaterialu extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        Material vychoziMat = Material.DIRT;
        Material cilovyMat = Material.COBBLESTONE;
        //premeni material, nutno zadat vychozi a cilovy, material musi byt v inventari
        // po premene se zvetsi mnozstvi ciloveho materialu,
        // nic moc, pomoci give se da nalogovat material do inventare ve velkem mnozstvi
        if (args.length > 1) {
            vychoziMat = Material.getMaterial(args[0]);
            cilovyMat = Material.getMaterial(args[1]);
        }
        if (vychoziMat == null) {
            player.sendMessage(args[0] + " neni znamy material.");
            return false;
        }
        if (cilovyMat == null) {
            player.sendMessage(args[1] + " neni znamy material.");
            return false;
        }

        PlayerInventory zasoby = player.getInventory();    //nacteni aktualniho inventare hrace
        for (int i = 0; i < zasoby.getSize(); i++) {   //prozkoumani kazde kupy polozek
            ItemStack polozky = zasoby.getItem(i);
            if (polozky == null) {   //tento slot inventare je prazdny
                continue;
            }
            if (polozky.getType() == vychoziMat) { //material v tomto slotu odpovida vychozimu, provedeme premenu:
                polozky.setType(cilovyMat);
                polozky.setAmount(cilovyMat.getMaxStackSize());   //naplnime slot maximalnim mnozstvim:
            }
        }
        player.sendMessage(vychoziMat.name() + " byl zmenen na " + cilovyMat.name());
        return true;
    }
}
