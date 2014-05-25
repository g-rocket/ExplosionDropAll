package net.clonecomputers.lab.explosions;

import org.bukkit.event.*;
import org.bukkit.event.entity.*;

public class ExplodeListener implements Listener {
	@EventHandler
	public void handleExplosion(EntityExplodeEvent e){
		e.setYield(1);
	}
}
