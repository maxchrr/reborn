package items;

import core.Hero;
import locations.LocationBase;

public class RustyAmulet extends ItemBase {

	@Override
	public String getName() {
		return "RustyAmulet";
	}

	@Override
	public String getDescription() {
		return "A strange artifact used in a different era, if used at the right place, could it still be useful?";
	}
	
	@Override
	public void onUse(Hero hero) {
		if (!hero.hasBag()) return;
		
		LocationBase currentLocation = hero.getLocation();
		if (!currentLocation.getName().equalsIgnoreCase("MotelRoom")) return;
		
		hero.getWriter().display("TODO");
		
		// Destroy the item after use
		hero.getBag().getItems().removeIf(it -> it.getName().equalsIgnoreCase(this.getName()));
		hero.getWriter().display(this.getName() + " is broken...");
	}
}
