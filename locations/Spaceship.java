package locations;

import items.Bag;

import spells.*;

public class Spaceship extends BaseLocation {

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
		Spell heal = new Spell("Heal", "Heals 20 missing hero HP.", 20, 40, SpellType.HEAL);
	}
}
