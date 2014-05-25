package net.clonecomputers.lab.signedit;

import java.util.*;

import org.bukkit.plugin.*;
import org.bukkit.plugin.java.*;

public class ExplosionDropAll extends JavaPlugin {
	
	private final ExplodeListener explodeListener = new ExplodeListener(this);
	
	public void onDisable() {
		getLogger().info("ExplosionDropAll 0.1 doesn't know how to disable itself");
	}

	public void onEnable() {
		getLogger().info("ExplosionDropAll 0.1 Enabled");
        PluginManager pm = this.getServer().getPluginManager();
        pm.registerEvents(explodeListener, this);
	}
}
