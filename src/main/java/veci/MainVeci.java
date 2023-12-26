package veci;

import org.bukkit.plugin.java.JavaPlugin;
import veci.ostatni.KouzelneJablko;
import veci.ostatni.Krovky;
import veci.ostatni.MrkevNaPrutu;
import veci.ostatni.ZmenaMaterialu;
import veci.zbrane.*;
import veci.zbroj.*;

public class MainVeci extends JavaPlugin {

    @Override
    public void onEnable() {

        getCommand("_boty").setExecutor(new Boty());
        getCommand("_brneni").setExecutor(new Brneni());
        getCommand("_helma").setExecutor(new Helma());
        getCommand("_kalhoty").setExecutor(new Kalhoty());

        getCommand("_vybava").setExecutor(new CelaVybava());

        getCommand("_lukSipy").setExecutor(new LukSipy());
        getCommand("_mec").setExecutor(new Mec());
        getCommand("_motyka").setExecutor(new Motyka());
        getCommand("_trojzubec").setExecutor(new Trojzubec());
        getCommand("_sekera").setExecutor(new Sekera());
        getCommand("_stit").setExecutor(new Stit());
        getCommand("_krumpac").setExecutor(new KrumpacPickAxe());
        getCommand("_kusRaketa").setExecutor(new Kus());


        getCommand("_krovky").setExecutor(new Krovky());
        getCommand("_jablko").setExecutor(new KouzelneJablko());
        getCommand("_mrkevNaPrutu").setExecutor(new MrkevNaPrutu());
        getCommand("_zmenaMaterialu").setExecutor(new ZmenaMaterialu());

        getPlugin(MainVeci.class).getLogger().info("plugin enabled!!!!!");
        getCommand("_vlnaBloku").setExecutor(new VlnaBloku(this));




    }
}
