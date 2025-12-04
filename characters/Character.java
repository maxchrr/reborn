package characters;

import core.Hero;

/**
 * Represents a single character.
 */
public interface Character {
	/** The name of the character */
	public String getName();
	
	/** The description by the hero of the character */
	public String getDescription();
	
	/** The health of the character */
	public int getHealth();
	
	/** The character loses amount of health, fights back the hero depending on its life and the character */
	public void delHealth(Hero hero, int amount);
	
	/** The sentences said by the character when command TALK is used on them */
	public String talkInteraction();

	/** The damage dealt by a character to another */
	//public void dealDamage(Character character, int value);
}
