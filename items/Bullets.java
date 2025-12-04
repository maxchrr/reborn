package items;

import core.Hero;

public class Bullets extends ItemBase {

	@Override
	public String getName() {
		return "Bullets";
	}

	@Override
	public String getDescription() {
		return "A magazine with 3 bullets.";
	}
	
	public void onUseWith(Hero hero, Gun gun) {
		if (!hero.hasBag()) return;
		
		if (hero.getBag().getItems().contains(gun)) {
			gun.addAmmo();
			// Destroy the item after use
			hero.getBag().getItems().removeIf(it -> it.getName().equalsIgnoreCase(this.getName()));
			hero.getWriter().display("You put the " + this.getName() + "into the mag.");
		}	
	}
}
