package locations;

import characters.Wonderer;
import spells.Spell;
import spells.SpellType;

public class Highway extends LocationBase {

	@Override
	public String getName() {
		return "Highway";
	}

	@Override
	public String getDescription() {
		return "A big and empty road, with no cars in sight";
	}
	
	public Highway() {
		super();
		
		// Items in the location
		
		// Spell in the location
		this.spell = new Spell("Enforcer", "Opens a door using your HUGE muscles.", 0, 70, SpellType.ENFORCER);
		
		// Character in the location
		this.character = new Wonderer(100, 90);
	}
}
