package locations;

import items.Sword;

public class Crossroads extends BaseLocation {

	@Override
	public String getName() {
		return "Crossroads";
	}

	@Override
	public String getDescription() {
		return "An intersection, the street lights are still working, many exits from there";
	}
	
	public Crossroads() {
		super();
		
		// All items in the location
		Sword sword = new Sword();
		this.getItems().add(sword);
		// All spells in the location
	}
}
