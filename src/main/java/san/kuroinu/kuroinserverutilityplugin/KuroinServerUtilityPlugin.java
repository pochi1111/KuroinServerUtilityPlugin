package san.kuroinu.kuroinserverutilityplugin;

import org.bukkit.plugin.java.JavaPlugin;

public final class KuroinServerUtilityPlugin extends JavaPlugin {

    public static JavaPlugin plugin;
    private Standart_Listeners listeners;


    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        this.listeners = new Standart_Listeners();
        getServer().getPluginManager().registerEvents(this.listeners, this);
        super.onEnable();
        //ここにコマンドを角
        //getCommand("コマンド").setExecutor(new コマンドのクラス名());
        plugin.saveDefaultConfig();
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        super.onDisable();
    }
    private static JavaPlugin getPlugin() {
        return plugin;
    }
}
