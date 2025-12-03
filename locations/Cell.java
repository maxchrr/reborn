package locations;

import characters.Ghost;

public class Cell extends LocationBase {

	@Override
	public String getName() {
		return "Cell";
	}

	@Override
	public String getDescription() {
		return "A rusty cell, maybe someone was there and escaped, maybe not, only the bars know";
	}
	
	public Cell() {
		super();
		
		// Items in the location
		
		// Spell in the location
						
		// Character in the location
		this.character = new Ghost();
	}
}
