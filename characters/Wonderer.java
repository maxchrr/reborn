package characters;

public class Wonderer implements Character {

	@Override
	public String getName() {
		return "Wonderer";
	}

	@Override
	public String getDescription() {
		return "A middle-age man that's heading outside the city with a scarf covering his face.";
	}

	@Override
	public int getHealth() {
		return 100;
	}

	@Override
	public String talkInteraction() {
		return "This city was condemned in its very start, "
				+ "when the precepts caught it's attention on the mystic powers of that place, "
				+ "it was over";
	}
}
