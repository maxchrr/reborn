package locations;

import items.RustyAmulet;

public class River extends BaseLocation {

	@Override
	public String getName() {
		return "River";
	}

	@Override
	public String getDescription() {
		return "A river, I can't understand it but it seems like someone was there not so long ago";
	}
	
	public River() {
		super();
		
		// All items in the location
		RustyAmulet rustyAmulet = new RustyAmulet();
		this.getItems().add(rustyAmulet);
		
		// All spells in the location
	}
}
