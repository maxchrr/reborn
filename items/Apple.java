package items;

import core.Hero;

public class Apple extends ItemBase {

	@Override
	public String getName() {
		return "Apple";
	}

	@Override
	public String getDescription() {
		return "A fresh and juicy apple.";
	}
	
	@Override
	public void onUse(Hero hero) {
		if (!hero.hasBag()) return;
		
		hero.addHealth(10);
		
		// Destroy the item after use
		hero.getBag().getItems().removeIf(it -> it.getName().equalsIgnoreCase(this.getName()));
		hero.getWriter().display(this.getName() + "TODO");
	}
}
