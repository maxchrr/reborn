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
	
	@Override
	public void onUseWith(Hero hero, Item item) {
		if (!hero.hasBag()) return;
		
		if (!(item instanceof Gun gun)) {
			hero.getWriter().display("I can't use ammo with this.");
			return;
		}
		
		// Check if hero have a gun
	    boolean gunInBag = hero.getBag().getItems().stream()
	        .anyMatch(it -> it == item);

	    if (!gunInBag) {
	        hero.getWriter().display("I don't have the gun.");
	        return;
	    }
		
		gun.addAmmo(3);
		
		// Destroy the item after use
		hero.getBag().getItems().removeIf(it -> it.getName().equalsIgnoreCase(this.getName()));
		hero.getWriter().display("You put the " + this.getName() + "into the mag.");
	}
}
