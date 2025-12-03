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
<<<<<<< HEAD
			if (targetLocation.getName().equalsIgnoreCase("StrangeOffice")) {
				hero.getWriter().display("You enter the locked office, everything seems untouched.\n"
						+ "Everything looks normal until you spot something strange.\n "
						+ "The screen is powered on, and the year displayed is 2125.\n"
						+ "How is that possible?\n");
				hero.setStarted(false);
				hero.getWriter().display("The end.\n"
						+ "Thanks for playing!\n");
				System.exit(0);
			}
=======
>>>>>>> 80d0d43acbe1aec01582d8cdaf592eb30c64fa3c
		} else {
			hero.getWriter().display("I cant't move there...");
		}
	}
}
