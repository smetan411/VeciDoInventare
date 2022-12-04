package veci.zbrane;

import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.FallingBlock;
import org.bukkit.entity.Player;
import org.bukkit.scheduler.BukkitRunnable;
import org.bukkit.scheduler.BukkitTask;
import org.bukkit.util.Vector;
import veci.MainVeci;
import veci.PlayerCommandExecutor;

public class VlnaBloku extends PlayerCommandExecutor {
    public MainVeci plugin;
    public VlnaBloku(MainVeci plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommandPlayer(Player player, World world, Location playerLocation, String[] args) {
        float arrowSpeed = 2;
        boolean gravity = true;
        Player passenger = null;
        int maxBlocks = 100;
        if (args.length != 0) {
            for (int i = 0; i < args.length; i++) {
                if (i == 0) {
                    arrowSpeed = Float.parseFloat(args[i]);
                }
                if (i == 1 && args[i].equals("true")) {
                    gravity = false;
                }
                if (i == 2 && args[i].equals("true")) {
                    passenger = player;
                }
                if (i == 3) {
                    maxBlocks = Integer.parseInt(args[i]);
                }
            }
        }

        Arrow sip = world.spawnArrow(playerLocation, playerLocation.getDirection(), arrowSpeed, 0, Arrow.class);
        Vector velocity = sip.getVelocity();
        sip.setGravity(gravity);
        if (passenger != null) {
            sip.addPassenger(player);
        }
        //plugin.getLogger().info("Sip is strangely not null... INFO INFO SUB");

        //plugin.getServer().broadcastMessage("Arrow sent!");
        BukkitTask task = new VystreleniBloku(sip, world, maxBlocks, plugin).runTaskTimer(plugin, 0, 1);
        return true;
    }

    private static class VystreleniBloku extends BukkitRunnable {
        private final MainVeci plugin;
        private Arrow sip;
        private World world;
        private int maxblock;
        private Block previousblock;
        boolean firstBlock = true;

        public VystreleniBloku(Arrow sip, World world, int maxblocks, MainVeci plugin) {
            if (sip == null) {
                plugin.getLogger().info("Sip is null! ERROR ERROR");
            }
            this.sip = sip;
            this.world = world;
            this.maxblock = maxblocks;
            this.plugin = plugin;
        }

        //Block previousblock = world.getHighestBlockAt(sip.getLocation());
        private int amountOfBlocks = 0;

        @Override
        public void run() {
            if (sip.isInBlock()) {
                cancel();
                plugin.getServer().broadcastMessage("Arrow hitted a block;canceling the show!");
                sip.remove();
            }

            Block block = world.getHighestBlockAt(sip.getLocation());
            if (previousblock == null) {
                amountOfBlocks++;
                BlockData blockinfo = block.getBlockData();
                block.setType(Material.AIR);
                FallingBlock fallingBlock = world.spawnFallingBlock(block.getLocation().add(0.5, 0, 0.5), blockinfo);
                fallingBlock.setVelocity(new Vector(0, 1, 0));
                firstBlock = false;
                previousblock = world.getHighestBlockAt(sip.getLocation());
                //plugin.getServer().broadcastMessage("Block sent flying :)");
            } else {
                // check if we are still in the same place; ignore same BUT lower block by looking only on X and Z (at least i hope it works like this :) )
                if ((previousblock.getX() == block.getX()) && (previousblock.getZ() == block.getZ()) && (amountOfBlocks < 100) && (!firstBlock)) {
                    plugin.getServer().broadcastMessage("Same block!; Skipping!");
                } else {
                    // current block isn't same as previous one, making the block jump (save data, remove block, spawn falling block with matching data and position and add force to itself)
                    amountOfBlocks++;
                    BlockData blockinfo = block.getBlockData();
                    block.setType(Material.AIR);
                    FallingBlock fallingBlock = world.spawnFallingBlock(block.getLocation().add(0.5, 0, 0.5), blockinfo);
                    fallingBlock.setVelocity(new Vector(0, 0.5, 0));
                    //plugin.getServer().broadcastMessage("Block sent flying :)");
                    previousblock = world.getHighestBlockAt(sip.getLocation());
                }
                if (amountOfBlocks == maxblock) {
                    amountOfBlocks = 0;
                    cancel();
                    plugin.getServer().broadcastMessage("Max amount of blocks reached; Canceling the show!");
                    sip.remove();
                }
            }
        }
    }
}
