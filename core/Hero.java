package core;

import java.util.ArrayList;
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
	private LocationBase currentLocation;
	
	private Bag bag;
	
	private final List<Spell> SPELLS = new ArrayList<>();
	
	/** ------ Getters ------ */
	
	public boolean hasStarted() {
		return this.started;
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
		return this.currentLocation;	
	}
	
	public boolean hasBag() {
		return this.bag != null;
	}
	
	public Bag getBag() {
		if (this.hasBag()) {
			return this.bag;
		} else {
			return null;
		}
	}
	
	public List<Spell> getSpells() {
		return this.SPELLS;
	}
	
	/** ------ Setters ------ */
	
	public void setBag(Bag bag) {
		this.bag = bag;
	}
	
	public void setStarted(boolean value) {
		this.started = value;
	}
	
	/** ------ Spell management ------ */
	
	public void addSpell(Spell spell) {
		this.SPELLS.add(spell);
	}
	
	public void cast(Spell spell) {
		if (spell.getCost() > this.mana) {
			Hero.writer.display("Not enough mana!");
			return;
		}
		spell.action(this, spell);
	}
	
	public void addHealth(int amount) {
		this.hp += amount;
	}
	
	public void delHealth(int amount) {
		this.hp -= amount;
	}
	
	public void restoreMana(int amount) {
		this.mana += amount;
	}
	
	public void useMana(int amount) {
		this.mana -= amount;
	}
	
	/** ------ Movement ------ */
	
	public void move(LocationBase location) {
		this.currentLocation = location;
	}
	
	/** ------ Constructor ------ */

	public Hero(Writer writer, int hp, int mana, LocationBase loc, boolean hasBag, Bag bag) {
		Hero.writer = writer;
		this.hp = hp;
		this.mana = mana;
		this.currentLocation = loc;
		this.bag = hasBag ? bag : null;
	}	
}
