package commands;

import core.Hero;
import items.Item;

public class TakeCommand implements Command {

	@Override
	public String getName() {
		return "TAKE";
	}

	@Override
	public String getDescription() {
		return "Add (if possible) the argument to the hero’s items.";
	}

	@Override
	public void execute(Hero hero, String[] args) {
		if (args.length < 1) return;
		
		String itemName = args[0];
		var locItems = hero.getLocation().getItems();
		Item found = null;
		
		for (Item item : locItems) {
			if (item.getName().equalsIgnoreCase(itemName)) {
				found = item;
				break;
			}
		}
		
		if (found == null) {
			hero.getWriter().display("There's no " + itemName + " here.");
	        return;
		}
		
		boolean removed = found.onTake(hero, hero.getLocation());
		if (removed) locItems.remove(found);
	}

}
