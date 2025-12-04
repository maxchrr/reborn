package commands;

import core.Hero;
import items.Item;
import locations.LocationBase;
import locations.Exit;

public class LookCommand implements Command {

	@Override
	public String getName() {
		return "LOOK";
	}

	@Override
	public String getDescription() {
		return "Display everything that can be observed in the current location.";
	}

	@Override
	public void execute(Hero hero, String[] args) {
		// Case: LOOK Bag
		if (args.length == 1 && args[0].equalsIgnoreCase("Bag")) {
			if (!hero.hasBag()) {
				hero.getWriter().display("I don't have a bag.");
				return;
			}
			hero.getBag().onUse(hero);
			return;
		}
		
		LocationBase currentLocation = hero.getLocation();
		
		// Items
		if (currentLocation.getItems().isEmpty()) {
	        hero.getWriter().display(" Items: none");
	    } else {
	        hero.getWriter().display(" Items:");
	        for (Item item : currentLocation.getItems()) {
	            hero.getWriter().display("  - " + item.getName());
	        }
	    }
		
		// Character
		if (currentLocation.hasCharacter()) {
	        hero.getWriter().display("\n Character: " + currentLocation.getCharacter().getName());
	    } else {
	        hero.getWriter().display(" Character: none");
	    }

		// Exits
	    hero.getWriter().display("\n Exits:");
	    for (Exit e : currentLocation.getExits().values()) {
	        if (e.isAccessible()) {
	            hero.getWriter().display("  - " + e.getTarget().getName());
	        }
	    }
	}

}
