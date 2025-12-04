package commands;

import core.Hero;
import locations.LocationBase;
import locations.StrangeOffice;
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
		if (args.length == 0) return;
		
		String direction = args[0].toLowerCase();
		LocationBase currentLocation = hero.getLocation();
		Exit exit = currentLocation.getExits().get(direction);
		
		if (exit == null) {
			hero.getWriter().display("I can't move there...");
			return;
		}
		
		if (!exit.isAccessible()) {
			hero.getWriter().display("This issue is locked...");
			return;
		}
		
		LocationBase target = exit.getTarget();
		
		hero.getWriter().display("Moving to " + target.getName());
		hero.getWriter().display(target.getDescription());
		hero.move(target);
		
		// Special ending
		if (target instanceof StrangeOffice) {
			hero.getWriter().display("You enter the locked office, everything seems untouched.\n"
					+ "Everything looks normal until you spot something strange.\n "
					+ "The screen is powered on, and the year displayed is 2125.\n"
					+ "How is that possible?");
			
			hero.setStarted(false);
			hero.getWriter().display("The end.\n"
					+ "Thanks for playing!");
			
			System.exit(0);
		}
	}
}
