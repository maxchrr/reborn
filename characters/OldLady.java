package characters;

import core.Hero;

public class OldLady implements Character {
	private int health = 40;

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
		return "There is nothing we could have done to avoid that, it is not too late to leave. "
				+ "If you want to stay, I heard there is a key nearby that unlocks a cell further down the town, go find it";
	}
	
	public void damagePlayer(Hero hero) {
		hero.delHealth(2);
		hero.getWriter().display("The OldLady hit you with her walking cane.\n"
				+ "She dealt you 2 damage.");
	}
}
