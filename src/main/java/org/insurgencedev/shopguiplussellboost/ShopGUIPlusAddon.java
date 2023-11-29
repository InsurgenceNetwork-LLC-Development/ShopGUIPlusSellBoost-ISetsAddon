package org.insurgencedev.shopguiplussellboost;

import org.bukkit.Bukkit;
import org.insurgencedev.insurgencesets.api.addon.ISetsAddon;
import org.insurgencedev.insurgencesets.api.addon.InsurgenceSetsAddon;

@ISetsAddon(name = "ShopGUIPlus", version = "1.0.0", author = "Insurgence Dev Team", description = "Boost the currency earned from selling to the shop")
public class ShopGUIPlusAddon extends InsurgenceSetsAddon {

    @Override
    public void onAddonReloadablesStart() {
        if (isDependentEnabled()) {
            registerEvent(new ShopGUIPlusEventListeners());
        }
    }

    private boolean isDependentEnabled() {
        return Bukkit.getPluginManager().isPluginEnabled("ShopGUIPlus");
    }
}
