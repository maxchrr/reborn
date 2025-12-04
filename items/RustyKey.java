package items;

import core.Hero;
import locations.Crossroads;
import locations.Exit;
import locations.LocationBase;
import locations.Motel;

public class RustyKey extends ItemBase {

	@Override
	public String getName() {
		return "RustyKey";
	}

	@Override
	public String getDescription() {
		return "Unlocks something near the second street.";
	}
	
	@Override
	public void onUse(Hero hero) {
		if (!hero.hasBag()) return;
		
		LocationBase currentLocation = hero.getLocation();
		if (!(currentLocation instanceof Crossroads)) return;
		
		Exit exit = currentLocation.getExits()
				.values()
				.stream()
				.filter(e -> e.getTarget() instanceof Motel)
				.findFirst()
				.orElse(null);
		
		if (exit == null) return;
		
		// Open the exit
		currentLocation.openExit(exit.getTarget());
		hero.getWriter().display(exit.getTarget().getName() + " is now opened!");
		
		// Destroy the item after use
		hero.getBag().getItems().removeIf(it -> it.getName().equalsIgnoreCase(this.getName()));
		hero.getWriter().display(this.getName() + " is broken...");
	}
}
