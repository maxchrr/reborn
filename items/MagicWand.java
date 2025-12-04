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
	
	@Override
	public void onUseWithSpell(Hero hero, Spell spell) {
		if (!hero.hasBag()) return;
	    
	    // Check if hero known the spell
	    Spell knownSpell = hero.getSpells().stream()
	            .filter(s -> s.getName().equalsIgnoreCase(spell.getName()))
	            .findFirst()
	            .orElse(null);

	    if (knownSpell == null) {
	        hero.getWriter().display("You don't know this spell.");
	        return;
	    }
	    
	    // Check for mana
	    if (hero.getMana() < knownSpell.getCost()) {
	        hero.getWriter().display("Not enough mana!");
	        return;
	    }
		
		hero.cast(spell);
	}
}
