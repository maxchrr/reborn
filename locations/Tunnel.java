package locations;

import spells.Spell;
import spells.SpellType;

public class Tunnel extends LocationBase {

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
		this.spell = new Spell("Bubbles", "Cast bubbles to keep a sense of humanity.", 0, 10, SpellType.BUBBLES);
	}
}
