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
<<<<<<< HEAD
	protected Character character = null;
=======
	private final List<Character> CHARACTERS = new ArrayList<>();
>>>>>>> 80d0d43acbe1aec01582d8cdaf592eb30c64fa3c
	protected Spell spell = null;
	
	@Override
	public Map<String, Exit> getExits() {
		return this.EXITS;
	}
	
	public List<Item> getItems() {
		return this.ITEMS;
	}
	
<<<<<<< HEAD
	public Character getCharacters() {
		return this.character;
=======
	public List<Character> getCharacters() {
		return this.CHARACTERS;
>>>>>>> 80d0d43acbe1aec01582d8cdaf592eb30c64fa3c
	}
	
	public boolean hasSpell() {
		return this.spell != null;
	}
	
<<<<<<< HEAD
	public Spell getSpell() {
=======
	public Spell getSPell() {
>>>>>>> 80d0d43acbe1aec01582d8cdaf592eb30c64fa3c
		if (this.hasSpell()) {
			return this.spell;
		} else {
			return null;
		}
	}
	
	public void addExit(LocationBase target) {
		this.EXITS.put(target.getName().toLowerCase(), new Exit(target));
	}
	
	public void addExit(LocationBase target, boolean state) {
		this.EXITS.put(target.getName().toLowerCase(), new Exit(target, state));
	}
}
