package core;

import java.util.ArrayList;
import java.util.List;

import items.Bag;
import locations.LocationBase;
import spells.Spell;
import util.Writer;

public class Hero {
	
	private boolean started;
	private Writer writer;
	
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
		return this.writer;
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
		return this.bag;
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
	
	public void learn(Spell spell) {
		if (!this.SPELLS.contains(spell)) {
            this.SPELLS.add(spell);
            this.getWriter().display("You learned the " + spell.getName() + " spell: " + spell.getDescription());
        }
	}
	
	public void cast(Spell spell) {
		if (spell.getCost() > this.mana) {
            this.getWriter().display("Not enough mana!");
            return;
        }
        
        this.mana -= spell.getCost();
        spell.action(this, spell);
	}
	
	/** ------ Health & Mana ------ */
	
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
		
		// Ensure new line
		this.getWriter().display(" ");
		
		// Spell discovery
		if (location.hasSpell()) {
			Spell newSpell = location.getSpell();
			this.learn(newSpell);
		}
	}
	
	/** ------ Constructor ------ */

	public Hero(Writer writer, int hp, int mana, LocationBase loc, boolean hasBag, Bag bag) {
		this.writer = writer;
		this.hp = hp;
		this.mana = mana;
		this.currentLocation = loc;
		this.bag = hasBag ? bag : null;
	}	
}
