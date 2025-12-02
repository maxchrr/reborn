package locations;

import items.Gun;

public class Graveyard extends BaseLocation {

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
		
		// All items in the location
		Gun gun = new Gun();
		this.getItems().add(gun);
		// All spells in the location
	}
}
