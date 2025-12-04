package characters;

import core.Hero;

public class Wonderer implements Character {
	private int health = 100;

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
		return this.health;
	}
	
	public void delHealth(Hero hero, int amount) {
		if ((this.getHealth() - amount) < 0) {
			this.health = 0;
			hero.getWriter().display("The " + this.getName() + "is dead.");
		}
		else {
			this.health -= amount;
		}
		damagePlayer(hero);
	}

	@Override
	public String talkInteraction() {
		return "This city was condemned in its very start, "
				+ "when the precepts caught it's attention on the mystic powers of that place, "
				+ "it was over";
	}
	
	public void damagePlayer(Hero hero) {
		hero.delHealth(90);
		hero.getWriter().display("You shouldn't have done that.\n"
				+ "The Wonderer dealt you 90 damage.");
	}
}
