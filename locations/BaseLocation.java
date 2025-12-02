package locations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import characters.Character;
import items.Item;

public abstract class BaseLocation implements Location {
	private final Map<String, Exit> EXITS = new HashMap<>();
	private final List<Item> ITEMS = new ArrayList<>();
	private final List<Character> CHARACTERS = new ArrayList<>();
	
	@Override
	public Map<String, Exit> getExits() {
		return this.EXITS;
	}
	
	public List<Item> getItems() {
		return this.ITEMS;
	}
	
	public List<Character> getCharacters() {
		return this.CHARACTERS;
	}
	
	public void addExit(BaseLocation target) {
		this.EXITS.put(target.getName().toLowerCase(), new Exit(target));
	}
}
