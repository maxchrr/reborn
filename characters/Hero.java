package characters;

import java.util.List;

import items.Bag;
import locations.Location;
import spells.Spell;
import util.Writer;

public class Hero {
	private static Writer writer;
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
	
	public Location getLocation() {
		return this.currLocation;	
	}
	
	public Hero(Writer writer, int hp, int mana, Location loc, boolean hasBag, Bag bag, List<Spell> spells) {
		Hero.writer = writer;
		this.hp = hp;
		this.mana = mana;
		this.currLocation = loc;
		this.hasBag = hasBag;
		this.bag = bag;
		this.spells = spells;
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
	
	public void viewBag() {
		//this.bag.use(Hero.writer);
	}
	
	public void cast(Spell spell) {
		if(spell.getCost() > this.mana)
			Hero.writer.display("Not enough mana !");
		else 
			spell.action(Hero.writer, spell, this);
	}
}
