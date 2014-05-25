package net.clonecomputers.lab.explosions;

import org.bukkit.plugin.*;
import org.bukkit.plugin.java.*;

public class ExplosionDropAll extends JavaPlugin {
	public void onDisable() {
		getLogger().info("ExplosionDropAll 0.1 doesn't know how to disable itself");
	}

	public void onEnable() {
		getLogger().info("ExplosionDropAll 0.1 Enabled");
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(new ExplodeListener(), this);
	}
}
