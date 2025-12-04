package characters;

/**
 * Represents a single character.
 */
public interface Character {
	/** The name of the character. */
	public String getName();
	
	/** The description by the hero of the character. */
	public String getDescription();
	
	/** The sentences said by the character when command TALK is used on them. */
	public String talkInteraction();
	
	/** The sentences said when the Hero fight the character. */
	default public String damageText() {
		return "attacks!";
	}
}
