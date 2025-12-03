package locations;

import items.Bag;
import spells.Spell;
import spells.SpellType;

public class Spaceship extends LocationBase {

	@Override
	public String getName() {
		return "Spaceship";
	}
	
	@Override
	public String getDescription() {
		return "Our good old Spaceship!";
	}
	
	public Spaceship() {
		super();
		
		// All items in the location
		Bag bag = new Bag(10);
		this.getItems().add(bag);
		
		// All spells in the location
		this.spell = new Spell("Heal", "Heals 20 missing hero HP.", 20, 40, SpellType.HEAL);
	}
}
