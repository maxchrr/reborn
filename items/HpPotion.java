package items;

import core.Hero;

public class HpPotion extends ItemBase {

	@Override
	public String getName() {
		return "HpPotion";
	}

	@Override
	public String getDescription() {
		return "A potion that completely restores your health.";
	}
	
	@Override
	public void onUse(Hero hero) {
		if (!hero.hasBag()) return;
		
		hero.addHealth(50);
		
		// Destroy the item after use
		hero.getBag().getItems().removeIf(it -> it.getName().equalsIgnoreCase(this.getName()));
		hero.getWriter().display(this.getName() + " is fully consumed.");
	}
}
