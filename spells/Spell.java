package spells;

import core.Hero;

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
	
	public int getValue() {
		return this.value;
	}
	
	public int getCost() {
		return this.cost;
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
	
	public void action(Hero hero, Spell spell) {
		hero.useMana(spell.cost);
		switch(spell.type) {
		case BUBBLES:
			hero.getWriter().display("｡.°˚∘˙○˚.•｡˚𓈒𓏸.°•○");
			break;
		case HEAL:
			hero.addHealth(value);
			break;
		case SIXTHSENCE:
			// show one of the exits
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
