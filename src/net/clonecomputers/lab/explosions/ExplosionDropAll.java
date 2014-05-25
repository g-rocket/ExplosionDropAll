package net.clonecomputers.lab.explosions;

import org.bukkit.event.entity.*;
import org.bukkit.plugin.*;
import org.bukkit.plugin.java.*;

public class ExplosionDropAll extends JavaPlugin {
	
	private final ExplodeListener explodeListener = new ExplodeListener();
	
	public void onDisable() {
		getLogger().info("ExplosionDropAll 0.1 Disabled");
		EntityExplodeEvent.getHandlerList().unregister(explodeListener);
	}

	public void onEnable() {
        this.getServer().getPluginManager().registerEvents(explodeListener, this);
		getLogger().info("ExplosionDropAll 0.1 Enabled");
	}
}
