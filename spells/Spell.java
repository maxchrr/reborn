package spells;

import java.util.List;

import core.Hero;
import items.Item;
import locations.Exit;
import locations.LocationBase;

public class Spell {
	private String name;
	private String description;
	private int value;
	private int cost;
	private SpellType type;
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	public SpellType getType() {
		return this.type;
	}
	
	public Spell(String name, String description, int value, int cost, SpellType type) {
		this.name = name;
		this.description = description;
		this.value = value;
		this.cost = cost;
		this.type = type;
	}
	
	public void action(Hero hero, Spell spell) {
		switch(spell.type) {
		case BUBBLES:
			hero.getWriter().display("｡.°˚∘˙○˚.•｡˚𓈒𓏸.°•○");
			break;
		case HEAL:
			hero.addHealth(this.value);
			break;
		case SIXTHSENCE:
			LocationBase currentLocation = hero.getLocation();
			
			// List of all accessible and not hidden exits
			List<Exit> exits = currentLocation.getExits().values()
					.stream()
					.filter(e -> e.isAccessible() && !e.isHidden())
					.toList();
			
			if (exits.isEmpty()) {
				 hero.getWriter().display("Your vision sees nothing... no exits here.");
				 break;
			}
			
			// Random selector
			Exit randomExit = exits.get((int)(Math.random() * exits.size()));
			LocationBase targetLocation = randomExit.getTarget();
			
			hero.getWriter().display("You remotely view: " + targetLocation.getName());
			
			// Items
			if (targetLocation.getItems().isEmpty()) {
		        hero.getWriter().display(" Items: none");
		    } else {
		        hero.getWriter().display(" Items:");
		        for (Item item : targetLocation.getItems()) {
		            hero.getWriter().display("  - " + item.getName());
		        }
		    }
			
			// Character
			if (targetLocation.hasCharacter()) {
		        hero.getWriter().display("\n Character: " + targetLocation.getCharacter().getName());
		    } else {
		        hero.getWriter().display(" Character: none");
		    }

			// Exits
		    hero.getWriter().display("\n Exits:");
		    for (Exit e : targetLocation.getExits().values()) {
		        if (e.isAccessible()) {
		            hero.getWriter().display("  - " + e.getTarget().getName());
		        }
		    }
			break;
		case RADIOCALL:
			// show a list of Locations between you and the spaceship
			break;
		case ENFORCER:
			// breaks a door that normally needs an opener 
			break;
		}
	}
}
