package locations;

import items.Bag;

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
		Bag bag = new Bag("Bag", "A bag, ripped of on its side but that can still hold few objects.", 10);
		this.getItems().add(bag);
		
		// All spells in the location
	}
}
