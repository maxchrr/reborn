package items;

import core.Hero;
import characters.Character;

public class Gun extends ItemBase {
	private int ammo = 0;

	@Override
	public String getName() {
		return "Gun";
	}

	@Override
	public String getDescription() {
		return "A modern pistol, it's mag is empty.";
	}
	
	public void addAmmo() {
		this.ammo = 3;
	}
	
	public void delAmmo() {
		this.ammo -= 1;
	}
	
	public void onUseWith(Hero hero, Character character) {
		if (!hero.hasBag()) return;
		
		if (this.ammo == 0) 
			hero.getWriter().display("Clip is empty, go find ammo!");
		// Destroy the item after use
		
		character.delHealth(hero, 60);
		this.delAmmo();
		hero.getWriter().display("You deal 60 damage to " + character.getName() + ", nice shot!\n");
	}
}
