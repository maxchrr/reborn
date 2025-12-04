package locations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import characters.Character;
import items.Item;
import spells.Spell;

public abstract class LocationBase implements Location {
	private final Map<String, Exit> EXITS = new HashMap<>();
	private final List<Item> ITEMS = new ArrayList<>();
	protected Character character = null;
	protected Spell spell = null;
	
	@Override
	public Map<String, Exit> getExits() {
		return this.EXITS;
	}
	
	public List<Item> getItems() {
		return this.ITEMS;
	}
	
	public boolean hasCharacter() {
		return this.character != null;
	}
	
	public Character getCharacter() {
		return this.character;
	}
	
	public boolean hasSpell() {
		return this.spell != null;
	}
	
	public Spell getSpell() {
		return this.spell;
	}
	
	public void addExit(LocationBase target) {
		this.EXITS.put(target.getName().toLowerCase(), new Exit(target));
	}
	
	public void addExit(LocationBase target, boolean state) {
		this.EXITS.put(target.getName().toLowerCase(), new Exit(target, state));
	}
	
	public void addExit(LocationBase target, boolean accessible, boolean hidden) {
		this.EXITS.put(target.getName().toLowerCase(), new Exit(target, accessible, hidden));
	}
	
	public void openExit(LocationBase target) {
		this.EXITS.get(target.getName().toLowerCase()).changeStateOpen();
	}
	
	public void closeExit(LocationBase target) {
		this.EXITS.get(target.getName().toLowerCase()).changeStateClosed();
	}
	
	public void hideExit(LocationBase target) {
		this.EXITS.get(target.getName().toLowerCase()).hide();
	}
	
	public void showExit(LocationBase target) {
		this.EXITS.get(target.getName().toLowerCase()).show();
	}
}
