package locations;

import items.ManaPotion;
import items.Bullets;
import spells.*;



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
		this.getItems().add(manaPotion);
		Bullets mag = new Bullets();
		this.getItems().add(mag);
		// All spells in the location
		Spell radioCall = new Spell("RadioCall", "Gives a way to the spaceship.", 0, 40, SpellType.RADIOCALL);
	}
}
