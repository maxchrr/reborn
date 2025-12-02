package characters;

public class Character {
	private String name;
	private int health;
	private int healthMax;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return this.health;
	}
	
	public int getHealthMax() {
		return this.healthMax;
	}
	
	public void restoreHp(int value) {
		if ((this.health + value) > this.healthMax)
			this.health = this.healthMax;
		else this.health += value;
	}
	
	public void dealDamage(int value) {
		if ((this.health - value) <= 0)
			System.out.println(this.getName() + " is dead.");
		else this.health -= value;
	}
}
