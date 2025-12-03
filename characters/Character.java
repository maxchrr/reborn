package characters;

public interface Character {

	/** The name of the character */
	public String getName();
	
	/** The health of the character */
	public int getHealth();

	/** The max health of the character */
	public int getHealthMax(); 
	
	/** The description by the hero of the character */
	public String getDesc();

	/** The sentences said by the character when command TALK is used on them */
	public String talkInteraction();

	/** The damage dealt by a character to another */
	public void dealDamage(Character character, int value);
}
