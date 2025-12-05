package items;

import characters.Character;
import core.Hero;

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
	public void onAttack(Hero hero, Character character) {
		if (!hero.hasBag()) return;
		
		int damageAmount = 10;
		character.damage(hero, damageAmount);
	}
}
