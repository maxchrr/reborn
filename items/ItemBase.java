package items;

import core.Hero;
import locations.Location;

public abstract class ItemBase implements Item {
	
	@Override
    public boolean onTake(Hero hero, Location location) {
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
	public boolean onDrop(Hero hero, Location location) {
	    hero.getWriter().display("You dropped the " + this.getName() + ".");
	    return true;
	}
}
