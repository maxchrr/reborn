package locations;

import items.HpPotion;

public class Motel extends LocationBase {

	@Override
	public String getName() {
		return "Motel";
	}

	@Override
	public String getDescription() {
		return "Two cars are left in front of the motel, thus the fog covers their color";
	}
	
	public Motel() {
		super();
		
		// Items in the location
		HpPotion hpPotion = new HpPotion();
		this.getItems().add(hpPotion);
		
		// Spell in the location
						
		// Character in the location
	}
}
