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
		
		// All items in the location
		KebabItem kebab = new KebabItem();
		this.getItems().add(kebab);
		
		// All spells in the location
	}
}
