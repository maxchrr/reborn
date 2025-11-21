package locations;

import java.util.List;

import items.Item;

public class Location {
	private final String NAME;
	private final String DESC;
	private List<Exit> exits;
	private List<Item> items;
	private List<Character> pnj;
	
	public String getName() {
		return this.NAME;
	}
		
	public String getDesc() {
		return this.DESC;
	}
	
	public Location(String name, String desc, List<Exit> exits, List<Item> items, List<Character> characters) {
		this.NAME = name;
		this.DESC = desc;
		this.exits = exits;	
		this.items = items;
		this.pnj = characters;
	}
}
