package locations;

import items.MagicWand;

public class PoliceStation extends BaseLocation {

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
		
		// All items in the location
		MagicWand magicWand = new MagicWand();
		this.getItems().add(magicWand);
		// All spells in the location
	}
}
