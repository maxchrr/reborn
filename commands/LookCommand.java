package commands;

import core.Hero;
import locations.BaseLocation;
import locations.Exit;

public class LookCommand implements Command {

	@Override
	public String getName() {
		return "LOOK";
	}

	@Override
	public String getDescription() {
		return "Displays a description of the current location if no argument\n"
				+ "is given. In case a list of arguments is provided, a display of all arguments that can\n"
				+ "be observed is given.";
	}

	@Override
	public void execute(Hero hero, String[] args) {
		BaseLocation currentLocation = (BaseLocation) hero.getLocation();
		for (Exit exit : currentLocation.getExits().values()) {
			BaseLocation exitLocation = (BaseLocation) exit.getTarget();
			hero.getWriter().display(exit.isAccessible() ? exitLocation.getName() : "");
		}
	}

}
