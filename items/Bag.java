package items;

import java.util.List;

import core.Hero;
import locations.LocationBase;

import java.util.ArrayList;

public class Bag implements Item {
	
	private final int CAPACITY;
	private List<Item> items;

	@Override
	public String getName() {
		return "Bag";
	}

	@Override
	public String getDescription() {
		return "A bag, ripped of on its side but that can still hold few objects.";
	}
	
	@Override
	public boolean onTake(Hero hero, LocationBase location) {
	    if (hero.hasBag()) {
	        hero.getWriter().display("I already have a bag.");
	        return false;
	    }

	    hero.setBag(this);
	    hero.getWriter().display("You picked up the bag.");
	    return true;
	}
	
	@Override
	public boolean onDrop(Hero hero, LocationBase location) {
	    if (!this.getItems().isEmpty()) {
	        hero.getWriter().display("I can't drop the bag while it is not empty.");
	        return false;
	    }

	    hero.setBag(null);
	    hero.getWriter().display("You dropped the bag.");
	    return true;
	}

	@Override
	public void onUse(Hero hero) {
		if (items.isEmpty()) {
			hero.getWriter().display("The bag is empty.");
			return;
		}
		
		hero.getWriter().display("Your bag contains:");
		for (Item item : items) {
			hero.getWriter().display(" - " + item.getName());
		}
		
		hero.getWriter().display(
			String.format("Capacity: %d/%d", items.size(), this.CAPACITY)	
		);
	}
	
	public int getCapacity() {
		return this.CAPACITY;
	}
	
	public List<Item> getItems() {
		return this.items;
	}
	
	public Bag(int capacity) {		
		this.CAPACITY = capacity;
		this.items = new ArrayList<>();
	}
	
	public boolean addItem(Item item) {
		if (items.size() >= this.getCapacity()) {
			return false;
		}
		items.add(item);
		return true;
	}
	
	public void removeItem(Item item) {
		items.remove(item);
	}
	
	public void use(String[] args) {
		for (Item item : this.items) {
			System.out.println(String.format("%s : %s", item.getName(), item.getDescription()));
		}
	}
}
