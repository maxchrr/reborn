package locations;

import items.Apple;

public class MotelEntry extends LocationBase {

	@Override
	public String getName() {
		return "MotelEntry";
	}

	@Override
	public String getDescription() {
		return "'Maple's motel : welcome home!' Quite welcoming I must say, even though no one is there.";
	}
	
	public MotelEntry() {
		super();
		
		// Items in the location
		Apple apple = new Apple();
		this.getItems().add(apple);
		
		// Spell in the location
						
		// Character in the location
	}
}
