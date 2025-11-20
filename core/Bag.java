package core;

import java.util.List;
import java.util.ArrayList;

public class Bag extends Items{
	private int capacity;
	private List<Items> items;
	
	public void addItem(Items item){
		if (items.size() >= capacity)
			System.out.println("BAG is full");
		else 
			this.items.add(item);
	}
	
	public void use(){
		System.out.println(items);
	}
	
	public Bag(String name, String desc, int capacity){
		super(name, desc);
		this.capacity = capacity;
		this.items = new ArrayList<Items>();
	}
}
