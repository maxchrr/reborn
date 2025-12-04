package items;

import characters.Character;
import core.Hero;
import locations.Location;
import spells.Spell;

/**
 * Represents a single item.
 */
public interface Item {
	/** The name of the item */
    String getName();
    
    /** A short description of the item. */
    String getDescription();
    
    /** When an item is taken. */
    boolean onTake(Hero hero, Location location);
    
    /** When an item is dropped. */
    boolean onDrop(Hero hero, Location location);
    
    /** Use this item single. */
    default void onUse(Hero hero) {
    	hero.getWriter().display("I can't use this.");
    }
    
    /** Use this item together. */
    default void onUseWith(Hero hero, Item other) {
    	hero.getWriter().display("These two things can't be used together.");
    }
    
    default void onUseWithSpell(Hero hero, Spell spell) {
    	hero.getWriter().display("These two things can't be used together.");
    }
    
    /** Use this item to attack a character. */
    default void onAttack(Hero hero, Character character) {
    	hero.getWriter().display("You can't attack a character with this thing.");
    }
}