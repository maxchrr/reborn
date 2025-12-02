package locations;

import spells.*;

public class Highway extends BaseLocation {

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
		Spell enforcer = new Spell("Enforcer", "Opens a door using your HUGE muscles.", 0, 70, SpellType.ENFORCER);
	}
}
