package characters;

public class Ghost extends CharacterBase {

	@Override
	public String getName() {
		return "Ghost";
	}

	@Override
	public String getDescription() {
		return "The ghost of an old man. He doesn't look that threatening, "
				+ "if he understands what I say I could maybe uncover what happened there";
	}

	@Override
	public String talkInteraction() {
		return "They killed me for witnessing the truth, "
				+ "I was not a threat in that cell, but that was seemingly "
				+ "not enough for them. I heard an old amulet is located nearby, "
				+ "it might find its utility elsewhere...";
	}
	
	public Ghost(int health, int backDamage) {
		super(health, backDamage);
	}
}
