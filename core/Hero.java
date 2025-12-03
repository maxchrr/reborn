package core;

import java.util.List;

import items.Bag;
import locations.LocationBase;
import spells.Spell;
import util.Writer;

public class Hero {
	private boolean started;
	private static Writer writer;
	private int hp;
	private int mana;
	private LocationBase currLocation;
	private boolean hasBag;
	private Bag bag;
	private List<Spell> spells;
	
	public boolean hasStarted() {
		return started;
	}
	
	public Writer getWriter() {
		return Hero.writer;
	}
	
	public int getHealth() {
		return this.hp;
	}
	
	public int getMana() {
		return this.mana;	
	}
	
	public LocationBase getLocation() {
		return this.currLocation;	
	}
	
	public boolean hasBag() {
		return this.hasBag;
	}
	
	public void setBag(Bag bag) {
	    this.bag = bag;
	    this.hasBag = (bag != null);
	}
	
	public Bag getBag() {
		if (hasBag()) {
			return bag;
		} else {
			return null;
		}
	}
	
	public List<Spell> getSpells() {
		return spells;
	}
	
	public Hero(Writer writer, int hp, int mana, LocationBase loc, boolean hasBag, Bag bag, List<Spell> spells) {
		Hero.writer = writer;
		this.hp = hp;
		this.mana = mana;
		this.currLocation = loc;
		this.hasBag = hasBag;
		this.bag = bag;
		this.spells = spells;
	}
	
	public void setStarted(boolean value) {
		this.started = value;
	}
	
	public void addHealth(int hp) {
		this.hp += hp;
	}
	
	public void delHealth(int hp) {
		this.hp -= hp;
	}
	
	public void restoreMana(int mana) {
		this.mana += mana;
	}
	
	public void useMana(int mana) {
		this.mana -= mana;
	}
	
	public void move(LocationBase location) {
		currLocation = location;
	}
	
	public void viewBag() {
		if (this.hasBag) {
			//this.bag;
		}
	}
	
	public void cast(Spell spell) {
		if(spell.getCost() > this.mana)
			Hero.writer.display("Not enough mana!");
		else 
			spell.action(this, spell);
	}
}
