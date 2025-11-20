package core;

import java.util.List;

public class Location {
	private final String NAME;
	private final String DESC;
	private List<Exit> exits;
	private List<Items> items;
	private List<Character> pnj;
		
	public String getDesc(){
		return this.desc;
	}
	
	public String getName(){
		return this.name;
	}
	
	public Location(String name, String desc, List<Exit> Exits, List<Items> Items, List<Character> Caracters) {
		this.name = name;
		this.desc = desc;
		this.exits = Exits;	
		this.items = Items;
		this.pnj = Caracters;
	}
}
