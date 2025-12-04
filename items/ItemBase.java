package items;

import characters.CharacterBase;
import core.Hero;
import locations.LocationBase;

public abstract class ItemBase implements Item {
	
	@Override
    public boolean onTake(Hero hero, LocationBase location) {
        if (!hero.hasBag()) {
            hero.getWriter().display("I don't know where to put this.");
            return false;
        }

        if (!hero.getBag().addItem(this)) {
            hero.getWriter().display("My bag is full.");
            return false;
        }

        hero.getWriter().display("You put the " + this.getName() + " in your bag.");
        return true;
    }

	@Override
	public boolean onDrop(Hero hero, LocationBase location) {
	    hero.getWriter().display("You dropped the " + this.getName() + ".");
	    return true;
	}
	
	@Override
	public void onUse(Hero hero) {
		hero.getWriter().display("Nothing happens.");
	}
	
	@Override
	public void onUseWith(Hero hero, Item item) {
		hero.getWriter().display("Nothing happens.");
	}
	
	@Override
	public void onUseOn(Hero hero, CharacterBase character) {
		hero.getWriter().display("Nothing happens.");
	}
}
