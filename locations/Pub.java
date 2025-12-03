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
		

		// Items in the location
		Key key = new Key();
		Soda soda = new Soda();
		this.getItems().add(key);
		this.getItems().add(soda);
		
		// Spell in the location
						
		// Character in the location
	}
}
