package commands;

import core.Hero;
import items.Item;

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
		if (args.length < 1) return;
		
		Item item1 = findItem(hero, args[0]);
		if (item1 == null) {
			hero.getWriter().display("I don't have " + args[0] + ".");
            return;
		}
		
		// USE <item>
		if (args.length == 1) {
			item1.onUse(hero);
			return;
		}
		
		// USE <item1> <item2>
		Item item2 = findItem(hero, args[1]);
        if (item2 == null) {
            hero.getWriter().display("I don't have " + args[1] + ".");
            return;
        }

        item1.onUseWith(hero, item2);
	}

	private Item findItem(Hero hero, String name) {
		if (hero.hasBag()) {
			for (Item item : hero.getBag().getItems()) {
				if (item.getName().equalsIgnoreCase(name)) {
					return item;
				}
			}
		}
		
		if (hero.hasBag() && name.equalsIgnoreCase("Bag")) {
			return hero.getBag();
		}
		
		return null;
	}
}
