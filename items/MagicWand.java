package items;

import spells.Spell;
import core.Hero;

public class MagicWand extends ItemBase {

	@Override
	public String getName() {
		return "MagicWand";
	}

	@Override
	public String getDescription() {
		return "A magic weapon that can cast the different spells you'll learn.";
	}
	
	public void onUseWith(Hero hero, MagicWand magicWand, Spell spell) {
		if (!hero.hasBag()) return;
		
		if (!hero.getBag().getItems().contains(magicWand)) 
			hero.getWriter().display("You don't have the right weapon to cast that spell.");
		else hero.cast(spell);
	}
}
