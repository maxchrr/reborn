package locations;

import items.Key2;
import spells.Spell;
import spells.SpellType;


public class Alley extends LocationBase {

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
		
		// Items in the location
		Key2 key2 = new Key2();
		this.getItems().add(key2);
		
		// Spell in the location
		this.spell = new Spell("SixthSence", "Shows the content of a nearby Location.", 0, 50, SpellType.SIXTHSENCE);
		
		// Character in the location
	}
}
