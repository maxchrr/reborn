package characters;

public class Wonderer extends CharacterBase {

	@Override
	public String getName() {
		return "Wonderer";
	}

	@Override
	public String getDescription() {
		return "A middle-age man that's heading outside the city with a scarf covering his face.";
	}

	@Override
	public String talkInteraction() {
		return "This city was condemned in its very start, "
				+ "when the precepts caught it's attention on the mystic powers of that place, "
				+ "it was over";
	}
	
	public Wonderer(int health, int backDamage) {
		super(health, backDamage);
	}
}
