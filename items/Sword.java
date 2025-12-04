package items;

import characters.CharacterBase;
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
	public void onUseOnCharacter(Hero hero, CharacterBase character) {
		if (!hero.hasBag()) return;
		
		int damageAmount = 10;
		character.damage(hero, damageAmount);

		hero.getWriter().display("You deal " + damageAmount + " damage to " + character.getName());
		if (character.getHealth() <= 0) {
			hero.getWriter().display(character.getName() + " has been defeated.");
		}
	}
}
