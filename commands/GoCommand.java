package commands;

import core.Hero;
import locations.LocationBase;
import locations.Exit;

public class GoCommand implements Command {
	
    @Override
    public String getName() {
        return "GO";
    }

    @Override
    public String getDescription() {
        return "The GO command is followed by the name of the neighbor location the\n"
        		+ "player wants to go. In case the location exists and the exit can be crossed, the hero\n"
        		+ "goes there, otherwise he stays in the same room. In each case, a display will indicate\n"
        		+ "what happens.";
    }

	@Override
	public void execute(Hero hero, String[] args) {
		if (args.length < 1) return;
		
		LocationBase currentLocation = (LocationBase) hero.getLocation();
		Exit exit = currentLocation.getExits().get(args[0].toLowerCase());
		if (exit != null && exit.isAccessible()) {
			LocationBase targetLocation = (LocationBase) exit.getTarget();
			hero.move(targetLocation);
			hero.getWriter().display("Moving to " + targetLocation.getName());
			hero.getWriter().display(targetLocation.getDescription());
		} else {
			hero.getWriter().display("I cant't move there...");
		}
	}
}
