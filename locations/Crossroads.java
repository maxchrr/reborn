package locations;

import characters.OldLady;
import items.Sword;

public class Crossroads extends LocationBase {

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
		
		// Items in the location
		Sword sword = new Sword();
		this.getItems().add(sword);
		
		// Spell in the location
						
		// Character in the location
		this.character = new OldLady(40, 2);
	}
}
