package veci.zbrane;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import veci.PlayerCommandExecutor;

public class Motyka extends PlayerCommandExecutor {

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        ItemStack motykaZhouby = new ItemStack(Material.GOLDEN_HOE, 1);

        ItemMeta vlastnosti = motykaZhouby.getItemMeta();
        vlastnosti.setDisplayName("motyka zhouby");

        AttributeModifier niceni = new AttributeModifier("Damage", 1000000, AttributeModifier.Operation.ADD_NUMBER);
        vlastnosti.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, niceni);

        AttributeModifier jednouRanou = new AttributeModifier("Vydrz", 1, AttributeModifier.Operation.ADD_NUMBER);
        vlastnosti.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, jednouRanou);

        motykaZhouby.setItemMeta(vlastnosti);
        player.getInventory().addItem(motykaZhouby);
        return true;
    }
}
