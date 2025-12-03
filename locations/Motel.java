package locations;

import items.HpPotion;

public class Motel extends BaseLocation {

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
		
		// All items in the location
		HpPotion hpPotion = new HpPotion();
		this.getItems().add(hpPotion);
		
		// All spells in the location
	}
}
