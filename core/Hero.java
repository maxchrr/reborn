package core;

import java.util.List;

public class Hero {
	private int hp;
	private int mana;
	private Location currLocation;
	private boolean hasBag;
	private Bag bag;
	private List<Spell> spells;
	
	public boolean hasBag() {
		return this.hasBag;
	}
	
	public void cast(Spell spell) {
		if(spell.getCost() > this.mana)
			System.out.println("Not enough mana !");
		else 
			spell.action();
	}
}
