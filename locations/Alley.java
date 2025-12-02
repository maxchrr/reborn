package locations;

import items.Key2;
import spells.*;


public class Alley extends BaseLocation {

	@Override
	public String getName() {
		return "Alley";
	}

	@Override
	public String getDescription() {
		return "A deep dark alley that seems to never ends";
	}
	
	public Alley() {
		super();
		
		// All items in the location
		Key2 key2 = new Key2();
		this.getItems().add(key2);
		// All spells in the location
		Spell sixthSence = new Spell("SixthSence", "Shows the content of a nearby Location.", 0, 50, SpellType.SIXTHSENCE);
	}
}
