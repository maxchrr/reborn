package items;

import core.Hero;

public class Soda extends ItemBase {

	@Override
	public String getName() {
		return "Soda";
	}

	@Override
	public String getDescription() {
		return "A can of soda, seemingly old but never opened.";
	}
	
	@Override
	public void onUse(Hero hero) {
		if (!hero.hasBag()) return;
		
		hero.addHealth(5);
		
		// Destroy the item after use
		hero.getBag().getItems().removeIf(it -> it.getName().equalsIgnoreCase(this.getName()));
		hero.getWriter().display(this.getName() + "TODO");
	}
}
