package locations;

import items.Gun;

public class Graveyard extends LocationBase {

	@Override
	public String getName() {
		return "Graveyard";
	}

	@Override
	public String getDescription() {
		return "A tiny graveyard, some graves looks fancy, some don't";
	}
	
	public Graveyard() {
		super();
		
		// Items in the location
		Gun gun = new Gun(0);
		this.getItems().add(gun);
		
		// Spell in the location
						
		// Character in the location
	}
}
