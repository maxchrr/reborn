package items;

import core.Hero;

public class ManaPotion extends ItemBase {

	@Override
	public String getName() {
		return "ManaPotion";
	}

	@Override
	public String getDescription() {
		return "A potion that completely restores your mana.";
	}
	
	@Override
	public void onUse(Hero hero) {
		if (!hero.hasBag()) return;
		
		hero.restoreMana(100);
		
		// Destroy the item after use
		hero.getBag().getItems().removeIf(it -> it.getName().equalsIgnoreCase(this.getName()));
		hero.getWriter().display(this.getName() + "TODO");
	}
}
