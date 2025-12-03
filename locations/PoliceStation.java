package locations;

import items.MagicWand;

public class PoliceStation extends LocationBase {

	@Override
	public String getName() {
		return "PoliceStation";
	}

	@Override
	public String getDescription() {
		return "I am pleased no one is there, or am I ?";
	}
	
	public PoliceStation() {
		super();
		
		// Items in the location
		MagicWand magicWand = new MagicWand();
		this.getItems().add(magicWand);
		
		// Spell in the location
						
		// Character in the location
	}
}
