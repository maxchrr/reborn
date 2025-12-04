package items;

import characters.CharacterBase;
import core.Hero;

public class Gun extends ItemBase {
	private int ammo;

	@Override
	public String getName() {
		return "Gun";
	}

	@Override
	public String getDescription() {
		return "A modern pistol, it's mag is empty.";
	}
	
	public Gun(int ammo) {
		this.ammo = ammo;
	}
	
	public int getAmmo() {
		return this.ammo;
	}
	
	public void addAmmo(int amount) {
		this.ammo = amount;
	}
	
	public void delAmmo(int amount) {
		this.ammo -= amount;
	}
	
	@Override
	public void onUseOn(Hero hero, CharacterBase character) {
		if (!hero.hasBag()) return;
		
		if (this.getAmmo() == 0) { 
			hero.getWriter().display("Clip is empty, go find ammo!");
			return;
		}
		
		int damageAmount = 60;
		character.damage(hero, damageAmount);
		
		this.delAmmo(-1);
		hero.getWriter().display("You deal " + damageAmount + " damage to " + character.getName() + ", nice shot!\n");
	}
}
