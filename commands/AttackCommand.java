package commands;

import characters.Character;
import core.Hero;
import items.Item;
import locations.LocationBase;

public class AttackCommand implements Command {

	@Override
	public String getName() {
		return "ATTACK";
	}

	@Override
	public String getDescription() {
		return "Fight a character using an item.";
	}

	@Override
	public void execute(Hero hero, String[] args) {
		if (args.length == 0) return;
		
		String inputName = args[0];
		LocationBase currentLocation = hero.getLocation();
		if (!currentLocation.hasCharacter()) {
            hero.getWriter().display("There's nobody to attack here.");
            return;
        }
		
		Character character = currentLocation.getCharacter();
		String characterName = character.getName().toUpperCase();
		
		if (!inputName.equalsIgnoreCase(characterName)) {
			hero.getWriter().display("There's no one named " + inputName + " here.");
			return;
		}
		
		if (args.length == 1) {
			hero.getWriter().display("With what thing you want to attack this character.");
			return;
		}
		
		inputName = args[1];
		Item item = findItem(hero, inputName);
		
		if (item == null) {
            hero.getWriter().display("I don't have " + inputName + ".");
            return;
        }
		
		item.onAttack(hero, character);
	}

	// Search for an item in the bag (including the bag itself)
	private Item findItem(Hero hero, String name) {
		if (!hero.hasBag()) return null;
		
		// Bag itself
		if (name.equalsIgnoreCase("Bag")) {
			return hero.getBag();
		}
		
		// Items inside the bag
		for (Item item : hero.getBag().getItems()) {
			if (item.getName().equalsIgnoreCase(name)) {
				return item;
			}
		}
		
		return null;
	}
}
