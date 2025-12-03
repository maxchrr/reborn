package locations;

import items.ManaPotion;
import spells.Spell;
import spells.SpellType;
import items.Bullets;

public class Church extends BaseLocation {

	@Override
	public String getName() {
		return "Church";
	}

	@Override
	public String getDescription() {
		return "An old looking church, with beautiful stained glass and a strong smell";	
	}
	
	public Church() {
		super();
		
		// All items in the location
		ManaPotion manaPotion = new ManaPotion();
		Bullets mag = new Bullets();
		this.getItems().add(manaPotion);
		this.getItems().add(mag);
		
		// All spells in the location
		this.spell = new Spell("RadioCall", "Gives a way to the spaceship.", 0, 40, SpellType.RADIOCALL);
	}
}
