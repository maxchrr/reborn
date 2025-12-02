package locations;

import spells.*;

public class Tunnel extends BaseLocation {

	@Override
	public String getName() {
		return "Tunnel";
	}

	@Override
	public String getDescription() {
		return "A dark and creepy tunnel, with cars almost blocking the entrance";
	}
	
	public Tunnel() {
		super();
		
		// All items in the location
		
		// All spells in the location
		Spell bubbles = new Spell("Bubbles", "Cast bubbles to keep a sense of humanity.", 0, 10, SpellType.BUBBLES);
	}
}
