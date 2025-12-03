package locations;

import items.Key;
import items.Soda;

public class Pub extends LocationBase {

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
		Key key1 = new Key();
		Soda soda = new Soda();
		this.getItems().add(key1);
		this.getItems().add(soda);
		
		// All spells in the location
	}
}
