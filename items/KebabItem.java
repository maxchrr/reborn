package items;

import core.Hero;

public class KebabItem extends ItemBase {

	@Override
	public String getName() {
		return "Kebab";
	}

	@Override
	public String getDescription() {
		return "Lettuce, tomato and onions, chef ?";
	}
	
	@Override
	public void onUse(Hero hero) {
		if (!hero.hasBag()) return;
		
		hero.addHealth(70);
		
		// Destroy the item after use
		hero.getBag().getItems().removeIf(it -> it.getName().equalsIgnoreCase(this.getName()));
		hero.getWriter().display(this.getName() + " has been consumed. Don't forget the tip!");
	}
}
