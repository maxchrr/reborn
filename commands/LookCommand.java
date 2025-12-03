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
		if (args.length == 1 && args[0].equalsIgnoreCase("Bag")) {
			if (!hero.hasBag()) {
				hero.getWriter().display("I don't have a bag.");
				return;
			}
			
			hero.getBag().onUse(hero);
			return;
		}
		
		hero.getWriter().display("Exits: ");
		LocationBase currentLocation = hero.getLocation();
		for (Exit exit : currentLocation.getExits().values()) {
			LocationBase exitLocation = exit.getTarget();
			hero.getWriter().display(exit.isAccessible() ? exitLocation.getName() : "");
		}
		
		hero.getWriter().display("\nItems: ");
		for (Item item : currentLocation.getItems()) {
			hero.getWriter().display(item.getName());
		}
		
		if (currentLocation.hasCharacter()) {
			hero.getWriter().display("\nCharacter: ");
			hero.getWriter().display(currentLocation.getCharacter().getName());
		}
	}

}
