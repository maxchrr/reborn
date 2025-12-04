package items;

import characters.Character;
import core.Hero;
import locations.LocationBase;

public class Sword extends ItemBase {

	@Override
	public String getName() {
		return "Sword";
	}

	@Override
	public String getDescription() {
		return "A medieval sword, holding it fills you with bravery.";
	}
	
	@Override
	public void onUseOn(Hero hero, Character character) {
		if (!hero.hasBag()) return;
		
		if (character)
	}
}
