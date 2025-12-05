package characters;

import core.Hero;

public abstract class CharacterBase implements Character {
	
	private int health;
	private int backDamage;
	
	public CharacterBase(int health, int backDamage) {
		this.health = health;
		this.backDamage = backDamage;
	}
	
	@Override
	public int getHealth() {
		return this.health;
	}
	
	public int getBackDamage() {
		return this.backDamage;
	}

	public void setHealth(int health, int backDamage) {
		this.health = health;
	}
	
	public void setBackDamage(int amount) {
		this.backDamage = amount;
	}

	@Override
	public void damage(Hero hero, int amount) {
		if (this.getHealth() <= 0) {
			hero.getWriter().display("I can't fight this character.");
			return;
		}
		
		// Kill the character
		if (amount >= this.getHealth()) {
			this.health = 0;
			hero.getWriter().display("The " + this.getName() + " is dead.");
			hero.getWriter().display(this.getName() + " has been defeated.");
			return;
		}
		
		this.health -= amount;
		hero.getWriter().display("You deal "
				+ amount
				+ " damage to "
				+ this.getName());
		
		// Fight back the hero
		hero.delHealth(this.getBackDamage());
		if (this instanceof Wonderer) {
			hero.getWriter().display("You shouldn't have done that.");
		} else {
			hero.getWriter().display("The " + this.getName() + " " + this.damageText());
		}
		hero.getWriter().display("You receive " + this.getBackDamage() + " damage.");
	}

}
