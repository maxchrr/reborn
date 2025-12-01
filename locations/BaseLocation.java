package locations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import items.Item;

public abstract class BaseLocation implements Location {
	private final Map<String, Exit> exits = new HashMap<>();
	private final List<Item> items = new ArrayList<>();
	private final List<Character> characters = new ArrayList<>();
	
	@Override
	public Map<String, Exit> getExits() {
		return this.exits;
	}
	
	public List<Item> getItems() {
		return this.items;
	}
	
	public List<Character> getCharacters() {
		return this.characters;
	}
	
	public void addExit(Location target) {
		this.exits.put(target.getName().toLowerCase(), new Exit(target));
	}
}
