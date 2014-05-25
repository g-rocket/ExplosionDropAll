package net.clonecomputers.lab.explosions;

import org.bukkit.event.entity.*;
import org.bukkit.plugin.*;
import org.bukkit.plugin.java.*;

public class ExplosionDropAll extends JavaPlugin {
	
	private final ExplodeListener explodeListener = new ExplodeListener();
	
	public void onDisable() {
		EntityExplodeEvent.getHandlerList().unregister(explodeListener);
		getLogger().info("ExplosionDropAll 0.1 Disabled");
	}

	public void onEnable() {
        this.getServer().getPluginManager().registerEvents(explodeListener, this);
		getLogger().info("ExplosionDropAll 0.1 Enabled");
	}
}
