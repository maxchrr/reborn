package spells;

import core.Hero;
import util.Writer;

public class Spell {
	private String name;
	private String desc;
	private int value;
	private int cost;
	private SpellType type; 
	
	public String getName() {
		return this.name;
	}
	
	public String getDesc() {
		return this.desc;
	}
	
	public int getCost() {
		return this.cost;
	}
	
	public int getValue() {
		return this.value;
	}
	
	public SpellType getType() {
		return this.type;
	}
	
	public Spell(String name, String desc, int value, int cost, SpellType type) {
		this.name = name;
		this.desc = desc;
		this.value = value;
		this.cost = cost;
		this.type = type;
	}
	
	public void action(Writer writer, Spell spell, Hero hero) {
		switch(spell.type) {
		case BUBBLES:
			hero.useMana(spell.cost);
			writer.display("｡.°˚∘˙○˚.•｡˚𓈒𓏸.°•○");
			break;
		case HEAL:
			hero.useMana(spell.cost);
			hero.addHealth(value);
			break;
		case SIXTHSENSE:
			hero.useMana(spell.cost);
			// show one of the exits
			break;
		case RADIOCALL:
			hero.useMana(spell.cost);
			// show a list of Locations between you and the spaceship
			break;
		case ENFORCER:
			hero.useMana(spell.cost);
			// breaks a door that normally needs an opener 
			break;
		}
		
	}
}
