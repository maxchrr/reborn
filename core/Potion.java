package core;


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
		pnj.restoreHp(this.heal);
	}
	
	public void use(Hero hero){
		hero.restoreHp(this.heal);
	}
	
	
	public Potion(int Val){
		this.value = val;
	}	


}
