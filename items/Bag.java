package items;

import java.util.List;

import util.Writer;

import java.util.ArrayList;

public class Bag extends Item {
	private int capacity;
	private List<Item> items;
	
	public Bag(String name, String desc, int capacity) {
		super(name, desc);
		this.capacity = capacity;
		this.items = new ArrayList<>();
	}
	
	public void use(Writer writer, String[] args) {
		switch (args[0].toUpperCase()) {
		case "ADD":
			if (items.size() >= capacity) {
				writer.display("BAG is full!");
			} else {
				this.items.add(null);
			}
			break;
		case "USE":
			break;
		case "VIEW":
			for (Item item : items) {
				writer.display(String.format("%s : %s", item.getName(), item.getDesc()));
			}
			break;
		}
	}
}
