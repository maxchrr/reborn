package characters;

public abstract class CharacterBase implements Character {
	private final String name;
	private final String desc;
	private final String talkDesc;
	private int health;
	private int healthMax;

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public int getHealth() {
		return this.health;
	}

	@Override
	public int getHealthMax() {
		return this.healthMax;
	}

	@Override
	public String getDesc() {
		return this.desc;
	}

	@Override
	public String talkInteraction() {
		return this.talkDesc;
	}

	@Override
	public void dealDamage(Character character, int value) {
		// TODO Auto-generated method stub

	}

}
