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
<<<<<<< HEAD
		return this.desc;
=======
		// TODO Auto-generated method stub
		return null;
>>>>>>> 80d0d43acbe1aec01582d8cdaf592eb30c64fa3c
	}

	@Override
	public String talkInteraction() {
<<<<<<< HEAD
		return this.talkDesc;
=======
		// TODO Auto-generated method stub
		return null;
>>>>>>> 80d0d43acbe1aec01582d8cdaf592eb30c64fa3c
	}

	@Override
	public void dealDamage(Character character, int value) {
		// TODO Auto-generated method stub

	}

}
