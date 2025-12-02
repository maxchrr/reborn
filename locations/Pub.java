package locations;

import items.Key1;

public class Pub extends BaseLocation {

	@Override
	public String getName() {
		return "Pub";
	}

	@Override
	public String getDescription() {
		return "A pub with everything thrown down, something happened there before the event.";
	}
	
	public Pub() {
		super();
		
		// All items in the location
		Key1 key1 = new Key1();
		this.getItems().add(key1);
		
		// All spells in the location
	}
}
