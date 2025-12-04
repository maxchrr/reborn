package characters;

public class Ghoul extends CharacterBase {

	@Override
	public String getName() {
		return "Ghoul";
	}

	@Override
	public String getDescription() {
		return "A gross ghoul covered with scars and blood."
				+ "If I had to guess, I think he doesn't like my presence here.";
	}

	@Override
	public String talkInteraction() {
		return "earggg... Euaurr... GEURK!!!";
	}
	
	public Ghoul(int health, int backDamage) {
		super(health, backDamage);
	}
}
