package net.clonecomputers.lab.signedit;

import org.bukkit.event.*;
import org.bukkit.event.entity.*;

public class ExplodeListener implements Listener {
	ExplosionDropAll plugin;

	public ExplodeListener(ExplosionDropAll plugin){
		this.plugin = plugin;
	}

	@EventHandler
	public void handleExplosion(EntityExplodeEvent e){
		e.setYield(1);
	}
}
