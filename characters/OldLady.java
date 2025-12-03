package characters;

public class OldLady implements Character {

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
	public int getHealth() {
		return 40;
	}

	@Override
	public String talkInteraction() {
		return "There is nothing we could have done to avoid that, it is not too late to leave. "
				+ "If you want to stay, I heard there is a key nearby that unlocks a cell further down the town, go find it";
	}
}
