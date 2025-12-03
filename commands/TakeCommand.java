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
		if (args.length == 0) return;
		
		String itemName = args[0];
		var locationItems = hero.getLocation().getItems();
		
		// Search for the item in the current location
		Item itemToTake = null;
		for (Item item : locationItems) {
			if (item.getName().equalsIgnoreCase(itemName)) {
				itemToTake = item;
				break;
			}
		}
		
		if (itemToTake == null) {
			hero.getWriter().display("There's no " + itemName + " here.");
	        return;
		}
		
		if (itemToTake.onTake(hero, hero.getLocation())) {
			locationItems.remove(itemToTake);
		}
	}

}
