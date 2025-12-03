package locations;

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
		
		// All items in the location
		
		// All spells in the location
		this.spell = new Spell("Enforcer", "Opens a door using your HUGE muscles.", 0, 70, SpellType.ENFORCER);
	}
}
