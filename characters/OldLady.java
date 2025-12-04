package characters;

public class OldLady extends CharacterBase {

	@Override
	public String getName() {
		return "OldLady";
	}

	@Override
	public String getDescription() {
		return "A really old lady that somehow survive. "
				+ "I don't know if I should talk to her, maybe she could tell me about what happened";
	}

	@Override
	public String talkInteraction() {
		return "There is nothing we could have done to avoid that, it is not too late to leave. "
				+ "If you want to stay, I heard there is a key nearby that unlocks a cell further down the town, go find it";
	}
	
	@Override
	public String damageText() {
		return "hit you with her walking cane.";
	}
	
	public OldLady(int health, int backDamage) {
		super(health, backDamage);
	}
}
