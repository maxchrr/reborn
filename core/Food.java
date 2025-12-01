package core;

public class Food {
	private int heal;
	
	public void use(){
		System.out.println("You have to add the character you want to use it on");
	}
	
	public void use(Character pnj){
		pnj.restoreHp(this.heal);
	}
	
	public void use(Hero hero){
		hero.restoreHp(this.heal);
	}
	
	
	public Food(int heal){
		this.heal = heal;
	}	


}
