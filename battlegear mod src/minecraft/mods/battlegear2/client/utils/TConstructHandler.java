package mods.battlegear2.client.utils;

import java.util.List;

import mods.battlegear2.Battlegear;
import mods.battlegear2.client.ClientProxy;
import mods.battlegear2.client.gui.controls.EquipGearTab;
import mods.battlegear2.client.gui.controls.SigilTab;
import tconstruct.client.tabs.TabRegistry;

public class TConstructHandler {
	
	public static void initTabs() {
        TabRegistry.registerTab(new EquipGearTab());
        if (Battlegear.debug) {
        	TabRegistry.registerTab(new SigilTab());
        }
        ClientProxy.tconstructEnabled = true;
	}
	
	public static void updateTab(int cornerX, int cornerY, Class<?> selectedButton) {
		TabRegistry.updateTabValues(cornerX, cornerY, selectedButton);
	}
	
	public static void addTabs(List buttonList) {
		TabRegistry.addTabsToList(buttonList);
	}

}
