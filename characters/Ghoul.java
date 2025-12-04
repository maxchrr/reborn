package characters;

import core.Hero;

public class Ghoul implements Character {
	private int health = 60;

	@Override
	public String getName() {
		return "Ghoul";
	}

	@Override
	public String getDescription() {
		return "A gross ghoul covered with scars and blood."
				+ "If I had to guess, I think he doesn't like my presence here.";
	}

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
		return "earggg... Euaurr... GEURK!!!";
	}
	
	public void damagePlayer(Hero hero) {
		hero.delHealth(35);
		hero.getWriter().display("The Ghoul attcks !\n"
				+ "She dealt you 35 damage.");
	}
}
