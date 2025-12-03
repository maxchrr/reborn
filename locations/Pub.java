package locations;

import items.Key1;
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
		Key1 key1 = new Key1();
		Soda soda = new Soda();
		this.getItems().add(key1);
		this.getItems().add(soda);
		
		// All spells in the location
	}
}
