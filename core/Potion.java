package core;

import characters.Character;
enum Type {
	heal,
	mana,
	dmg
}


public class Potion {
	private final int VALUE;
	private Type type;
	
	public void use(){
		System.out.println("You have to add the character you want to use it on");
	}
	
	public void use(Character pnj){
		pnj.restoreHp(this.VALUE);
	}
	
	public void use(Hero hero){
		hero.addHealth(this.VALUE);
	}
	
	
	public Potion(int Val){
		this.VALUE = Val;
	}	


}
