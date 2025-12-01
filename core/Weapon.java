package core;

public class Weapon{
	private int atk;
	
	public void use(){
		System.out.println("You have to add the character you want to use it on");
	}
	
	public void use(Character pnj){
		pnj.looseHp(this.atk);
	}
	
	public Weapon(int atk){
		this.atk = atk;
	}	
	
	
}
