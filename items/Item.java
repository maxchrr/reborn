package items;

import core.Hero;
import locations.BaseLocation;

/**
 * Represents a single item.
 */
public interface Item {
	/** The name of the item */
    String getName();
    
    /** A short description of the item. */
    String getDescription();
    
    /** When an item is taken. */
    boolean onTake(Hero hero, BaseLocation location);
    
    /** When an item is dropped. */
    boolean onDrop(Hero hero, BaseLocation location);
    
    /** Use this item single. */
    default void onUse(Hero hero) {
    	hero.getWriter().display("I can't use this.");
    }
    
    /** Use this item together. */
    default void onUseWith(Hero hero, Item other) {
    	hero.getWriter().display("These two things can't be used together.");
    }
}