package locations;

import items.KebabItem;

public class Kebab extends LocationBase {

	@Override
	public String getName() {
		return "Kebab";
	}

	@Override
	public String getDescription() {
		return "DONER KEBAB, why is there a kebab opened in such a place ?";
	}

	public Kebab() {
		super();
		
		// Items in the location
		KebabItem kebab = new KebabItem();
		this.getItems().add(kebab);
		
		// Spell in the location
						
		// Character in the location
	}
}
