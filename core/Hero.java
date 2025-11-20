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
	
	public int getHealth() {
		return this.hp;
	}
	
	public int getMana() {
		return this.mana;	
		}
	
	public void restoreMana(int mana) {
		this.mana += mana;
	}
	
	public void useMana(int mana) {
		this.mana -= mana;
	}
	
	public void addHealth(int hp) {
		this.hp += hp;
	}
	
	public void delHealth(int hp) {
		this.hp -= hp;
	}
	
	public void cast(Spell spell) {
		if(spell.getCost() > this.mana)
			System.out.println("Not enough mana !");
		else 
			spell.action(spell, this);
	}
}
