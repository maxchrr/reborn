package commands;

import core.Hero;

public class UseCommand implements Command {

	@Override
	public String getName() {
		return "USE";
	}

	@Override
	public String getDescription() {
		return "Uses the object arg1. In case a second argument is given, the first\n"
				+ "one is used with the second. For example, use gun bullet may load the gun, which\n"
				+ "can be used after that.";
	}

	@Override
	public void execute(Hero hero, String[] args) {
		if (args.length < 2) return;
		
		if (args[0].toUpperCase().equals("BAG") && hero.hasBag()) {
			// TODO: Use bag
		}
	}

}
