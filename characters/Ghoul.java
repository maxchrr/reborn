package characters;

public class Ghoul implements Character {

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
	public int getHealth() {
		return 60;
	}

	@Override
	public String talkInteraction() {
		return "earggg... Euaurr... GEURK!!!";
	}
}
